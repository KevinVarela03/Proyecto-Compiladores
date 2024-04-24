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

type YourASTType struct {
	NodeType string
	Children []*YourASTType
}

func (ast *YourASTType) ConvertToASTNode() *checker.ASTNode {
	// Aquí realizas la conversión de tu AST a ASTNode
	// Retorna un ASTNode adecuadamente construido basado en tu AST
	return nil
}

type miniGoListener struct {
	*parser.BaseMiniGoParserListener
	AST *YourASTType // Aquí debes definir el tipo correcto para tu AST
}

func NewMiniGoListener() *miniGoListener {
	return &miniGoListener{
		BaseMiniGoParserListener: nil, // Aquí debes proporcionar la instancia correcta del listener base
		AST:                      nil, // Inicializa el campo AST según sea necesario
	}
}

func (l *miniGoListener) GetAST() *YourASTType {
	return l.AST
}

func (l *miniGoListener) VisitTerminal(node antlr.TerminalNode) {
	//fmt.Println(node.GetText())
}

func main() {
	// Crear un listener personalizado para la construcción del AST
	listener := &miniGoListener{}

	// Crear un analizador léxico para el archivo de entrada
	input, _ := antlr.NewFileStream("test.txt")
	lexer := parser.NewMiniGoScanner(input)
	lexer.RemoveErrorListeners()                 // Remover los listeners de errores por defecto
	lexer.AddErrorListener(NewMyErrorListener()) // Añadir tu propio listener de errores

	// Crear un flujo de tokens a partir del analizador léxico
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Crear un analizador sintáctico para el flujo de tokens
	p := parser.NewMiniGoParser(stream)
	p.RemoveErrorListeners()                 // Remover los listeners de errores por defecto
	p.AddErrorListener(NewMyErrorListener()) // Añadir tu propio listener de errores

	// Construir el AST utilizando el analizador sintáctico
	tree := p.Root()

	// Caminar el AST y construir la representación en memoria
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)

	// Crear una tabla de símbolos global
	globalSymbolTable := checker.NewSymbolTable(nil)

	// Crear un checker con la tabla de símbolos global
	check := &checker.Checker{
		SymbolTable: globalSymbolTable,
	}
	check.Visit(tree)

	/*
		ast := listener.GetAST()

		// Realizar el análisis contextual utilizando el checker
		if err := check.Check(ast.ConvertToASTNode()); err != nil {
			fmt.Println("Error de análisis contextual:", err)
		} else {
			fmt.Println("Análisis contextual completado sin errores")
		}

	*/

}
