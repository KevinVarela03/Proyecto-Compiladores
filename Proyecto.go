package main

import (
	"Proyecto_Compiladores/checker"
	"Proyecto_Compiladores/parser"
	"fmt"
	"github.com/antlr4-go/antlr/v4"
)

type MyErrorListener struct {
	*antlr.DefaultErrorListener
}

func NewMyErrorListener() *MyErrorListener {
	return new(MyErrorListener)
}

func (d *MyErrorListener) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	fmt.Printf("Error de sintaxis en la línea %d, columna %d: %s\n", line, column, msg)
}

func main() {

	// Crear un analizador léxico para el archivo de entrada
	input, _ := antlr.NewFileStream("test.txt")
	lexer := parser.NewMiniGoScanner(input)
	//**lexer.RemoveErrorListeners()                 // Remover los listeners de errores por defecto
	lexer.AddErrorListener(NewMyErrorListener()) // Añadir tu propio listener de errores

	// Crear un flujo de tokens a partir del analizador léxico
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Crear un analizador sintáctico para el flujo de tokens
	p := parser.NewMiniGoParser(stream)
	//**p.RemoveErrorListeners()                 // Remover los listeners de errores por defecto
	p.AddErrorListener(NewMyErrorListener()) // Añadir tu propio listener de errores

	// Construir el AST utilizando el analizador sintáctico
	tree := p.Root()

	// Crear una tabla de símbolos global
	globalSymbolTable := checker.NewSymbolTable()

	// Crear un checker con la tabla de símbolos global
	check := &checker.Checker{
		SymbolTable: globalSymbolTable,
	}
	check.Visit(tree)
}
