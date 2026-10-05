public class Cajero extends Empleado {
    private int horasExtra;
    private double pagoHoraExtra;

    public Cajero(String nombre, int numeroEmpleado, double sueldoBase, int horasExtra, double pagoHoraExtra) {
        super(nombre, numeroEmpleado, sueldoBase);
        this.horasExtra = horasExtra;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        if (pagoHoraExtra >= 0) {
            this.pagoHoraExtra = pagoHoraExtra;
        } else {
            this.pagoHoraExtra = 0;
        }
    }
    @Override
    public double calcularPagos() {
        double sueldoBase = super.getSueldoBase();
        return sueldoBase + (horasExtra * pagoHoraExtra);
    }
}
