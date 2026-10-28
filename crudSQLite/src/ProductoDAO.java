import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductoDAO
 */
public class ProductoDAO {

    // crear la tabla solamente si  aun no existe
    public boolean crearTabla(){
        String sql=""" 
            CREATE TABLE IF NOT EXISTS productos(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT NOT NULL,
                precio REAL NOT NULL CHECK(precio>=0),
                existencias INTEGER NOT NULL CHECK (existencias>=0)
            )
        """;
    try(Connection conexion = ConexionSQLite.conectar();
      Statement sentencia = conexion.createStatement()){
        sentencia.execute(sql);
        return true;
  
    }catch(SQLException error){
        mostrarError("crear la tabla",error);
        return false;
    }

    }
    /*CREATE : guardar un producto nuevo y le asigna una ID genrado por SQLite */
    public boolean insertar(Producto producto){
        String sql = "INSERT INTO productos (nombre, precio, existencias) values(?,?,?)";
        try(Connection conexion = ConexionSQLite.conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                sentencia.setString(1, producto.getNombre());
                sentencia.setDouble(2, producto.getPrecio());
                sentencia.setInt(3, producto.getExistencias());
                sentencia.executeUpdate();
                try(ResultSet claves = sentencia.getGeneratedKeys()){
                    if(claves.next()){
                        producto.setID(claves.getInt(1));
                    }
                }
                return true;

         }catch(SQLException error){
            mostrarError("Insertar producto",error);
            return false;
        }
         }
    
    
    // Leer: convertir todas las filas de la tabla en objetos producto
    public List<Producto> listar(){
        String sql = "SELECT id, nombre, precio, existencias FROM productos ORDER BY id";
        List<Producto> productos = new ArrayList<>();
        try(Connection conexion = ConexionSQLite.conectar();
            Statement sentencia = conexion.createStatement();
            ResultSet filas = sentencia.executeQuery(sql);
            ){
            while (filas.next()){
                productos.add(convertirFilaEnProducto(filas));
            }

        }catch(SQLException error){
            mostrarError("Listar los prodcutos",error);
        }
        return productos;     

    }
                                //8
    public Producto buscarPorID(int id){
        String sql = "SELECT id, nombre, precio, existencias FROM productos WHERE id = ?";
        try(Connection conexion = ConexionSQLite.conectar();
           PreparedStatement sentencia = conexion.prepareStatement(sql)){
            sentencia.setInt(1,id);
            try(ResultSet fila = sentencia.executeQuery()){
                if(fila.next()){
                    return convertirFilaEnProducto(fila);
                }
            }
        }catch(SQLException error){
                mostrarError("Buscar producto",error);

        }
        return  null;
    }
    //actualizar: reemplaza los datos de la Fila indentificada por el producto.getId();
    public boolean actualizar (Producto producto){
        String sql= """
            UPDATE productos
            SET nombre = ?, precio = ?, existencias = ?
            WHERE id  = ?
        """;

        try(Connection conexion = ConexionSQLite.conectar();
            PreparedStatement setencia = conexion.prepareStatement(sql)){
            setencia.setString(1, producto.getNombre());
            setencia.setDouble(2, producto.getPrecio());
            setencia.setInt(3, producto.getExistencias());
            setencia.setInt(4, producto.getID());
            
            return setencia.executeUpdate() == 1;

        }catch(SQLException error){
            mostrarError("Actualizar el producto",error);
            return false;
        }
    }

    // Delete: borrar el registro que tenga el ID recibido
    public boolean eliminar (int id){
        String sql = "DELETE FROM productos WHERE id = ?";
        try(Connection conexion = ConexionSQLite.conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql)){
                sentencia.setInt(1, id);
                return sentencia.executeUpdate() == 1;


        }catch( SQLException error){
            mostrarError("Eliminar el producto",error);
            return false;
        }
        
    }
    private Producto convertirFilaEnProducto(ResultSet fila) throws SQLException{
        return new Producto(
            fila.getInt("id"),
            fila.getString("nombre"),
            fila.getDouble("precio"),
            fila.getInt("existencias")
        );
    }

    //error
    private void mostrarError(String operacion, SQLException error){
        System.out.println("Error al " + operacion + " : " + error.getMessage());

    }
}