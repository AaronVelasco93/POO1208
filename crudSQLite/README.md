# CRUD educativo con Java y SQLite

Programa por consola que permite crear, consultar, actualizar y eliminar productos.
El proyecto está dividido en clases pequeñas para enseñar separación de responsabilidades.

## ¿Qué significa CRUD?

| Letra | Operación | SQL utilizado |
|---|---|---|
| C | Create: crear | `INSERT` |
| R | Read: consultar | `SELECT` |
| U | Update: actualizar | `UPDATE` |
| D | Delete: eliminar | `DELETE` |

## Organización del código

### `Principal.java`

Es el punto de entrada. Crea el DAO, prepara la tabla e inicia el menú. No contiene
consultas SQL ni validaciones porque delega esas tareas a otras clases.

### `Producto.java`

Es el modelo de datos. Representa un producto mediante `id`, `nombre`, `precio` y
`existencias`. Cada objeto equivale conceptualmente a una fila de SQLite.

### `ConexionSQLite.java`

Guarda la dirección JDBC y abre conexiones con SQLite. Centralizar la conexión
evita repetir su configuración en cada operación.

### `ProductoDAO.java`

DAO significa *Data Access Object*. Contiene las instrucciones SQL y convierte
filas de SQLite en objetos `Producto`. Aquí se encuentran las cuatro operaciones CRUD.

### `EntradaConsola.java`

Lee y valida los datos escritos. Impide nombres vacíos, números incorrectos y
valores negativos sin mezclar esas comprobaciones con el código SQL.

### `MenuProductos.java`

Muestra las opciones y coordina las demás clases. Solicita datos con
`EntradaConsola`, crea objetos `Producto` y pide a `ProductoDAO` que los almacene.

## Flujo de una operación

Ejemplo al crear un producto:

```text
Usuario
  ↓ escribe datos
MenuProductos
  ↓ construye el objeto
Producto
  ↓ se entrega al DAO
ProductoDAO
  ↓ ejecuta INSERT mediante JDBC
SQLite (crud_productos.db)
```

## Archivos auxiliares

- `lib/`: bibliotecas JDBC necesarias para conectar Java y SQLite.
- `out/`: clases compiladas; se genera automáticamente.
- `compilar.bat`: compila todos los archivos de `src/`.
- `ejecutar.bat`: compila y después inicia `Principal`.
- `crud_productos.db`: base de datos generada al ejecutar por primera vez.

## Ejecutar el programa

Se necesita Java 17 o posterior. En una terminal de Windows:

```bat
cd "C:\Users\Vinculacion\Downloads\Nueva carpeta"
ejecutar.bat
```

También se puede hacer doble clic en `ejecutar.bat`.

## Conceptos que pueden observar 

- Clases, objetos, constructores, atributos y métodos.
- Encapsulamiento mediante atributos privados y getters.
- Separación de responsabilidades.
- Listas con `List<Producto>` y ciclos `for`.
- Manejo de excepciones con `try` y `catch`.
- Liberación automática de recursos con `try-with-resources`.
- Conexión JDBC.
- Consultas preparadas con `PreparedStatement`.
- Validación de entradas de consola.
