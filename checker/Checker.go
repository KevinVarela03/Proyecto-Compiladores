package checker

import (
	"fmt"
)

// Checker realiza el análisis contextual utilizando una tabla de símbolos
type Checker struct {
	SymbolTable *SymbolTable // Tabla de símbolos utilizada para el análisis contextual
}

// Check realiza el análisis contextual en el AST proporcionado
func (c *Checker) Check(ast *ASTNode) error {
	// Realizar el análisis contextual recursivamente en el AST
	return c.checkNode(ast)
}

// checkNode realiza el análisis contextual en un nodo del AST
func (c *Checker) checkNode(node *ASTNode) error {
	switch node.Type {
	case NodeTypeFunction:
		return c.checkFunction(node)
	case NodeTypeVariableDeclaration:
		return c.checkVariableDeclaration(node)
	case NodeTypeAssignment:
		return c.checkAssignment(node)
	// Agregar más casos según sea necesario para otros tipos de nodos
	default:
		// No se requiere análisis contextual para otros tipos de nodos
		return nil
	}
}

// checkFunction realiza el análisis contextual para una declaración de función
func (c *Checker) checkFunction(node *ASTNode) error {
	// Obtener el nombre y la definición de la función del nodo
	functionName := node.Value
	functionDefinition := c.SymbolTable.Functions[functionName]

	// Verificar si la función ha sido declarada previamente
	if _, ok := c.SymbolTable.Lookup(functionName); !ok {
		return fmt.Errorf("función '%s' no declarada", functionName)
	}

	// Verificar el tipo de retorno de la función
	returnTypeNode := node.Children[0]
	returnType := Type(returnTypeNode.Value) // Convertir el tipo de nodo a Type
	if functionDefinition.ReturnType != returnType {
		return fmt.Errorf("tipo de retorno incorrecto para la función '%s'", functionName)
	}

	// Realizar el análisis contextual en el cuerpo de la función
	for _, statement := range node.Children[1:] {
		if err := c.checkNode(statement); err != nil {
			return err
		}
	}

	return nil
}

// checkVariableDeclaration realiza el análisis contextual para una declaración de variable
func (c *Checker) checkVariableDeclaration(node *ASTNode) error {
	// Obtener el nombre y el tipo de la variable del nodo
	variableName := node.Children[0].Value
	variableType := node.Children[1].Value

	// Verificar si la variable ha sido declarada previamente
	if _, ok := c.SymbolTable.Lookup(variableName); ok {
		return fmt.Errorf("variable '%s' ya declarada", variableName)
	}

	// Agregar la variable a la tabla de símbolos
	c.SymbolTable.AddVariable(variableName, Type(variableType))

	// Realizar el análisis contextual en la expresión de asignación si está presente
	if len(node.Children) > 2 {
		if err := c.checkNode(node.Children[2]); err != nil {
			return err
		}
	}

	return nil
}

// checkAssignment realiza el análisis contextual para una asignación de variable
func (c *Checker) checkAssignment(node *ASTNode) error {
	// Obtener el nombre de la variable y su tipo de la tabla de símbolos
	variableName := node.Children[0].Value
	variableType, ok := c.SymbolTable.Lookup(variableName)
	if !ok {
		return fmt.Errorf("variable '%s' no declarada", variableName)
	}

	// Verificar el tipo de la expresión de asignación
	assignmentTypeNode := node.Children[1]
	assignmentType := Type(assignmentTypeNode.Value) // Convertir el tipo de nodo a Type
	if variableType != assignmentType {
		return fmt.Errorf("tipo incorrecto para la asignación a la variable '%s'", variableName)
	}

	return nil
}
