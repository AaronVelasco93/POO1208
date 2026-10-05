public class PagoEfectivo implements FormaPago {
    // Atributo es propio de la clase pagoEfectivo, no es de la interfaz FormaPago
    private double monto;
    
    //setter de pago efectivo
    public PagoEfectivo(double monto) {
        this.monto = monto;
    }

    // Implementación del método pagar de la interfaz FormaPago
    @Override
    public void pagar(double total) {
        if (monto >= total) {
            System.out.println("Pago en efectivo realizado. Cambio: " + (monto - total));
        } else {
            System.out.println("Monto insuficiente para realizar el pago.");
        }
    }
    
    @Override
    public void mostrarTipoPago() {
        System.out.println("Tipo de pago: Efectivo");
    }
    
}
