public class Vendedor extends Empleado {
    // atributos privados solo son de la clase Hija
    private double ventas;
    private double porcentajeComision;

    // constructor de la clase hija
    public Vendedor(String nombre, int numeroEmpleado, double sueldoBase, double ventas, double porcentajeComision) {
        // Super llama al constructor de la clase padre para inicializar los atributos heredados
        super(nombre, numeroEmpleado, sueldoBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    //  getter y setter para consultar y modificar datos de el vendedor
    public double getVentas() {
        return ventas;
    }
    public void setVentas(double ventas) {
        if(ventas >= 0){
            this.ventas = ventas;
        }else{
            this.ventas = 0;
        }
    }
    public double getPorcentajeComision() {
        return porcentajeComision; 
    }
    public void setPorcentajeComision(double porcentajeComision) {
        if(porcentajeComision >= 0){
            this.porcentajeComision = porcentajeComision;
        }else{
            this.porcentajeComision = 0;
        }
    }
    // metodo para calcular el pago del vendedor
    @Override
    public double calcularPagos() {
        //Obtener el sueldo base del empleado utilizando el método getter de la clase padre
        double sueldoBase = super.getSueldoBase();
        // Calcular el pago total del vendedor sumando el sueldo base y la comisión por ventas
        return sueldoBase + (ventas * porcentajeComision);

    }

    


    
}
