package checker

// SymbolTable representa la tabla de símbolos del compilador MiniGo
type SymbolTable struct {
	Parent    *SymbolTable         // Ámbito padre
	Variables map[string]Type      // Mapa de identificadores a tipos bote
	Functions map[string]Function  // Mapa de funciones a sus definiciones
	Structs   map[string]Structure // Mapa de estructuras a sus definiciones
}

// Type representa un tipo de dato en MiniGo
type Type string

// Function representa la definición de una función en MiniGo
type Function struct {
	Name       string   // Nombre de la función
	ReturnType Type     // Tipo de retorno de la función
	Parameters []Symbol // Parámetros de la función
}

// Structure representa la definición de una estructura en MiniGo
type Structure struct {
	Name   string          // Nombre de la estructura
	Fields map[string]Type // Mapa de campos a tipos en la estructura
}

// Symbol representa un identificador en MiniGo
type Symbol struct {
	Name string // Nombre del identificador
	Type Type   // Tipo del identificador
}

// NewSymbolTable crea una nueva tabla de símbolos con un ámbito padre
func NewSymbolTable(parent *SymbolTable) *SymbolTable {
	return &SymbolTable{
		Parent:    parent,
		Variables: make(map[string]Type),
		Functions: make(map[string]Function),
		Structs:   make(map[string]Structure),
	}
}

// AddVariable agrega un identificador de variable a la tabla de símbolos
func (st *SymbolTable) AddVariable(name string, dataType Type) {
	st.Variables[name] = dataType
}

// AddFunction agrega una definición de función a la tabla de símbolos
func (st *SymbolTable) AddFunction(name string, function Function) {
	st.Functions[name] = function
}

// AddStructure agrega una definición de estructura a la tabla de símbolos
func (st *SymbolTable) AddStructure(name string, structure Structure) {
	st.Structs[name] = structure
}

// Lookup busca un identificador en la tabla de símbolos y sus ámbitos padres
func (st *SymbolTable) Lookup(name string) (Type, bool) {
	// Buscar en el ámbito actual
	dataType, found := st.Variables[name]
	if found {
		return dataType, true
	}

	// Buscar en ámbitos padres si existen
	if st.Parent != nil {
		return st.Parent.Lookup(name)
	}

	// Identificador no encontrado
	return "", false
}
