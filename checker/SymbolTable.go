package checker

import (
	"fmt"
)

type Ident struct {
	token string
	Type  int
	level int
}

type VarIdent struct {
	Ident
}

type MethodIdent struct {
	Ident
	params []int
}

type TypeIdent struct {
	Ident
	baseType int
}

type StructIdent struct {
	Ident
	fields []VarIdent
}

type SymbolTable struct {
	table       []Ident
	actualLevel int
}

func NewSymbolTable() *SymbolTable {
	return &SymbolTable{
		table:       make([]Ident, 0),
		actualLevel: 0,
	}

}

var (
	Bool = Ident{
		token: "bool",
		Type:  1,
		level: 0,
	}
	Int = Ident{
		token: "int",
		Type:  2,
		level: 0,
	}
	Float = Ident{
		token: "float",
		Type:  3,
		level: 0,
	}
	String = Ident{
		token: "string",
		Type:  4,
		level: 0,
	}
	Rune = Ident{
		token: "rune",
		Type:  5,
		level: 0,
	}
)

func (t *SymbolTable) InsertMethod(token string, typ int, params []int) {
	i := MethodIdent{Ident: Ident{token: token, Type: typ, level: t.actualLevel}, params: params}
	t.table = append(t.table, i.Ident)
}

func (t *SymbolTable) InsertVar(token string, typ int) {
	i := VarIdent{Ident: Ident{token: token, Type: typ, level: t.actualLevel}}
	t.Find(token)
	t.table = append(t.table, i.Ident)
}

func (t *SymbolTable) InsertType(tok string, typ int, baseType int) {
	i := TypeIdent{Ident: Ident{token: tok, Type: typ, level: t.actualLevel}, baseType: baseType}
	t.table = append(t.table, i.Ident)
}

func (t *SymbolTable) InsertStruct(tok string, typ int, fields []VarIdent) {
	i := StructIdent{Ident: Ident{token: tok, Type: typ, level: t.actualLevel}, fields: fields}
	t.table = append(t.table, i.Ident)
}

func (t *SymbolTable) Find(name string) *Ident {
	for _, id := range t.table {
		if id.token == name {
			fmt.Println("ERROR, MULTIPLE VAR DECLARATION \nVariable: '", id.token, "' its declared multiple times")
			return &id
		}
	}
	return nil
}

func (t *SymbolTable) FindActualLevel(name string) *Ident {
	var temp *Ident
	tempLevel := t.actualLevel
	for _, id := range t.table {
		if tempLevel == id.level {
			if id.token == name {
				temp = &id
			}
		} else {
			break
		}
	}
	return temp
}

func (t *SymbolTable) OpenScope() {
	t.actualLevel++
}

func (t *SymbolTable) CloseScope() {
	for i := len(t.table) - 1; i >= 0; i-- {
		if t.table[i].level == t.actualLevel {
			t.table = append(t.table[:i], t.table[i+1:]...)
		}
	}
	t.actualLevel--
}

func (t *SymbolTable) PrintTable() {
	_type := ""
	fmt.Println("----- SYMBOL TABLE ------")
	fmt.Println("|    Name    |  Level  |  Type  |")
	fmt.Println("|------------|---------|--------|")
	for _, s := range t.table {
		if s.Type == 1 {
			_type = "boolean"
		} else if s.Type == 2 {
			_type = "int"
		} else if s.Type == 4 {
			_type = "string"
		} else {
			_type = "unknown"
		}

		fmt.Printf("|  %-10s|    %-4d|   %-4s|\n", s.token, s.level, _type)
	}
	fmt.Println("----- END TABLE ------")
}
