public class PagoTarjeta implements FormaPago {
    private String numeroTarjeta;
    private String nombreTitular;

    public PagoTarjeta(String numeroTarjeta, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    public String mostrarNombreTitular() {
        return nombreTitular;
    }

    @Override
    public void pagar(double total) {
        System.out.println("Pago con tarjeta realizado. Número de tarjeta: " + numeroTarjeta);
    }

    @Override
    public void mostrarTipoPago() {
        System.out.println("Tipo de pago: Tarjeta");
    }
}
