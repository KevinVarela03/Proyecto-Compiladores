package checker

// NodeType representa los tipos de nodos en el AST
type NodeType int

const (
	// NodeTypeFunction representa un nodo de declaración de función
	NodeTypeFunction NodeType = iota + 1
	// NodeTypeVariableDeclaration representa un nodo de declaración de variable
	NodeTypeVariableDeclaration
	// NodeTypeAssignment representa un nodo de asignación de variable
	NodeTypeAssignment
	// NodeTypeIdentifier representa un nodo de identificador
	NodeTypeIdentifier
	// NodeTypeType representa un nodo de tipo de dato
	NodeTypeType
	// NodeTypeLiteral representa un nodo de literal
	NodeTypeLiteral
)

// ASTNode representa un nodo en el árbol de sintaxis abstracta (AST)
type ASTNode struct {
	Type     NodeType   // Tipo de nodo
	Value    string     // Valor del nodo (nombre de función, identificador, value literal, etc.)
	Children []*ASTNode // Hijos del nodo (si los tiene)
}

// NewASTNode crea un nuevo nodo AST
func NewASTNode(nodeType NodeType, value string, children ...*ASTNode) *ASTNode {
	return &ASTNode{
		Type:     nodeType,
		Value:    value,
		Children: children,
	}
}
