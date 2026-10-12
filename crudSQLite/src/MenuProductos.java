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
            case 2 -> listarProducto();
            case 3 -> actualizarProducto();
            case 4 -> eliminarProducto();
            case 0 -> System.out.println("Programa Finalizado");
            default -> System.out.println("Opciones no valida");
        }
    }
}