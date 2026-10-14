public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int existencia;
    
    // constructor por defecto cuando no se tenga en ID
    public Producto( String nombre, double precio, int existencia){
        this(0, nombre, precio, existencia);
    }

    // Contructor para SQLite
    public Producto( int id, String nombre, double precio, int existencia){
        this.id=id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }
    // getter y setter para consultar los atributos privados
    public int getID(){
        return id;
    }
    public  String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getExistencias(){
        return  existencia;
    }
    // Se actualizar el ID despues de insertar el producto y recibir un clave de SQLite
    public void setID(int id){
        this.id=id;
    }
}