public class Principal {

    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        //antes de mostrar el menu, nos aseguramos que se realizan sobre SQLI
        if(!productoDAO.crearTabla()){
            System.out.println("No fue posible preparar la base de datos");
            System.out.println("El programa termina para evitar mas errores");
            return ;
        }
        MenuProductos menu = new MenuProductos(productoDAO);
        menu.iniciar();
    }
}