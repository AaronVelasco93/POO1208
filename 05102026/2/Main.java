public class Main {
    public static void main(String[] args) {
        double totalCompra = 250.00;

        System.out.println("=== Pago en efectivo ===");
        PagoEfectivo pagoEfectivo = new PagoEfectivo(300.00);
        pagoEfectivo.mostrarTipoPago();
        pagoEfectivo.pagar(totalCompra);

        System.out.println("\n=== Pago en efectivo con monto insuficiente ===");
        PagoEfectivo pagoEfectivoInsuficiente = new PagoEfectivo(200.00);
        pagoEfectivoInsuficiente.mostrarTipoPago();
        pagoEfectivoInsuficiente.pagar(totalCompra);

        System.out.println("\n=== Pago con tarjeta ===");
        PagoTarjeta pagoTarjeta = new PagoTarjeta("**** **** **** 1234", "Ana Lopez");
        pagoTarjeta.mostrarTipoPago();
        System.out.println("Titular: " + pagoTarjeta.mostrarNombreTitular());
        pagoTarjeta.pagar(totalCompra);
    }
}
