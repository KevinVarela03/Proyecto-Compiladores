package checker

import (
	"fmt"
)

type Ident struct {
	tok   string
	typ   int
	nivel int
	valor int
}

type VarIdent struct {
	Ident
	isConstant bool
}

type MethodIdent struct {
	Ident
	params []int
}

type TablaSimbolos struct {
	tabla       []Ident
	nivelActual int
}

func NewSymbolTable() *TablaSimbolos {
	return &TablaSimbolos{
		tabla:       make([]Ident, 0),
		nivelActual: -1,
	}
}

func (t *TablaSimbolos) Insertar(tok string, typ int, isConstant bool) {
	i := VarIdent{Ident: Ident{tok: tok, typ: typ, nivel: t.nivelActual, valor: 0}, isConstant: isConstant}
	t.tabla = append(t.tabla, i.Ident)
}

func (t *TablaSimbolos) InsertarFunc(tok string, typ int, params []int) {
	i := MethodIdent{Ident: Ident{tok: tok, typ: typ, nivel: t.nivelActual, valor: 0}, params: params}
	t.tabla = append(t.tabla, i.Ident)
}

func (t *TablaSimbolos) Buscar(nombre string) *Ident {
	for _, id := range t.tabla {
		if id.tok == nombre {
			return &id
		}
	}
	return nil
}

func (t *TablaSimbolos) BuscarNivelActual(nombre string) *Ident {
	var temp *Ident
	tempNivel := t.nivelActual
	for _, id := range t.tabla {
		if tempNivel == id.nivel {
			if id.tok == nombre {
				temp = &id
			}
		} else {
			break
		}
	}
	return temp
}

func (t *TablaSimbolos) OpenScope() {
	t.nivelActual++
}

func (t *TablaSimbolos) CloseScope() {
	for i := len(t.tabla) - 1; i >= 0; i-- {
		if t.tabla[i].nivel == t.nivelActual {
			t.tabla = append(t.tabla[:i], t.tabla[i+1:]...)
		}
	}
	t.nivelActual--
}

func (t *TablaSimbolos) Imprimir() {
	fmt.Println("----- INICIO TABLA ------")
	for _, s := range t.tabla {
		fmt.Printf("Nombre: %s - %d - %d\n", s.tok, s.nivel, s.typ)
	}
	fmt.Println("----- FIN TABLA ------")
}
