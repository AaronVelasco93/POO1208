import java.util.List;

// Controla el menu y la interaccion con el usuario
// Esta clase coordina las otras capas: EcntradaConsola obtiene los datos,
// Pruductos lo respresenta y ProductosDAO los guarda o recupera de SQLite
public class MenuProductos {
    private final ProductoDAO productoDAO;
    private final EntradaConsola entrada;

    // Inyeccion sencilla: EL DAO se recibe en lugar de crearse dentro del menu
    public MenuProductos (ProductoDAO productoDAO){
        this.productoDAO = productoDAO;
        this.entrada = new EntradaConsola();
    }
    // Mantener el menu activo hasta que el usuario elige cero
    public void iniciar(){
        int opcion;
        do{
            mostrarOpciones();
            opcion = entrada.leerEntero("Selecciona una opciones");
            ejecutarOpcion(opcion);
        }while(opcion!=0);
        entrada.cerrar();;
    }
    // menu de mostrar opciones
    private void mostrarOpciones(){
        System.out.println("\n-----------------------------");
        System.out.println("          CRUD DE PRODUCTOS   ");  
        System.out.println("-----------------------------");
        System.out.println("1.- Crear producto");
        System.out.println("2.- Listar Producto");
        System.out.println("3.- Actualizar producto");
        System.out.println("4.- Eliminar producto");
        System.out.println("0.- Salir");
    }
    // relacion de cada numero con el menu de operaciones
    private void ejecutarOpcion(int Opcion){
        switch (Opcion) {
            case 1 -> crearProducto();
            case 2 -> listarProductos();
            case 3 -> actualizarProducto();
            case 4 -> eliminarProducto();
            case 0 -> System.out.println("Programa Finalizado");
            default -> System.out.println("Opciones no valida");
        }
    }
    // solicta los datos, construye el modelo y delega el insert al DAO
    private void crearProducto(){
        System.out.println("\n --- Nuevo Producto ---");
        Producto  producto = leerDatosProducto(0);

        if(productoDAO.insertar(producto)){
            System.out.println("Producto creado con el ID"+producto.getID()+ ".-");
            
        }

    }

    // Solicitar al DAO los productos y los presenta en una tabla
    private void listarProductos(){
        List<Producto> productos = productoDAO.listar();
        System.out.println("-- Lista de productos --");
        if(productos.isEmpty()){
            System.out.println("No hay productos");
            return ;
        }else{
            System.out.println("----Productos----");
            System.out.println("ID, Nombre, Precio, Existencias");
            System.out.println("--------------------------");
            for(Producto producto : productos){
              System.out.println(producto.getID()+
              producto.getNombre()+producto.getPrecio()+
              producto.getExistencias());  
            }
        }
    }
    private void actualizarProducto(){
        listarProductos();
        int id = entrada.leerEnteroPositivo("\n ID del producto que deseas actualizar");
        Producto  actual = productoDAO.buscarPorID(id);

        if(actual == null){
            System.out.println("No existe el producto con el ID: "+id);
            return ;
        }
        System.out.println("Escribe los datos que remplazaron los actuales");
        
        Producto modificado = leerDatosProducto(id);
        if(productoDAO.actualizar(modificado)){
            System.out.println("Producto actualizado correctamente");
        }
    }
    private void eliminarProducto(){
        listarProductos();
        int id =  entrada.leerEnteroPositivo("\n ID del producto que desea eliminar");
        if(productoDAO.buscarPorID(id)== null){
            System.out.println( "No existe un producto con el ID : "+id);
            return ;
        }

        String confirmacion = entrada.leerTexto("Escribe S para confirmar.");

        if(!confirmacion.equalsIgnoreCase("S")){
            System.out.println("Eliminacion cancelada");
            return ;
        }
        if(productoDAO.eliminar(id)){
            System.out.println("Producto Eliminado");
        }


    }
    //reutiliza las mismas preguntas al crear y actualizar un productos

    private Producto leerDatosProducto(int id){
        String nombre = entrada.leerTextoObligatorio("Nombre");
        double precio = entrada.leerDecimalNoNegativo("Precio:");
        int existencias= entrada.leerEntero("Existencias");
        return new Producto (id, nombre,precio,existencias);
    }

}//fin de clase