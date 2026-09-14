package Tienda;
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001","Teclado",450.50,10);
        producto1.mostrarInformacion();
        producto1.aumentarExistencia(5);
        producto1.vender(3);
        System.out.println("Valor de inventario"+producto1.cacularValorInventario());
    }
}
