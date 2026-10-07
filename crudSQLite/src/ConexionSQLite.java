import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// centralizar la conexion de SQLite
// si cambia el nombre o la ubicacion de la base de datoa, solamente es necesario 
// modificar esta clase y no cada una de las consultas
public final class ConexionSQLite{

    //jdbc:sqlite indica el controlador : indicamos el archivo de datos
    private static final String URL ="jdbc:sqlite:crud_productos.db";

    // impide crear objetos de esta clase, por que solo ofrecemos un metodo estatico
    //Constructor
    private ConexionSQLite(){
    }
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL);
    } 


}