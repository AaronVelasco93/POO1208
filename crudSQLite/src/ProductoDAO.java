import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
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

        }catch(){

        }

    }
    
}