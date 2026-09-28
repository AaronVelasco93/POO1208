public class Producto {
    private String nombre;
    private double precio;
    private int existencia;

    //Contrucutor sin pararametros
    //Permite crear un objeto Producto sin enviar datos inicialmente
    public Producto(){
        nombre="Sin nombre";
        precio=0;
        existencia=0;
    }

    // Constructor con parametros
    // Permite inicializar todos los atributos al crear el objeto
    public Producto(String Nombre, double Precio, int Existencia){
        this.nombre= Nombre;
        //En lugar de asignar directamente el precio y la existencia
        // se utilizan setter y getter para aprobechar las validaciones
        setPrecio(Precio);
        setExistencia(Existencia);
    }
    // Getter Nombre
    // Permite consultar el valor del atributo Nombre
    public String getNombre(){
        return  nombre;
    }

    // Setter nombre
    // Permite modificar el nombre
    public void  setNombre(String Nombre){
        this.nombre = Nombre;
    }

    // Getter precio
    public double getPrecio(){
        return precio;
    }

    // setter precio
    // Validar que los precios no sean negativos
    public void setPrecio(double Precio){
        if(Precio>=0){
            this.precio = Precio;
        }else{
            this.precio=0;
        }
    }
    // getter existencia 
    public int getExistencia(){
        return  existencia;
    }
    // setter existencia
    public void setExistencia(int Existencia){
        if(Existencia >=0){
            this.existencia = Existencia;
        }else{
            this.existencia =0;
        }
    }
    // Mostrar todos los datoa del pruducto
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio "+precio);
        System.out.println("Existencia"+existencia);
    }


}
