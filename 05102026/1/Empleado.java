public class Empleado {
    //atributos
    private String nombre;
    private int numeroEmpleado;
    private double sueldoBase;

    //constructor de la clase padre
    public Empleado(String nombre, int numeroEmpleado, double sueldoBase) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.sueldoBase = sueldoBase;
    }
    // getter para consultar nombre
    public String getNombre() {
        return nombre;
    }

    // getter para consultar número de empleado
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    // getter para consultar sueldo base
    public double getSueldoBase() {
        return sueldoBase;
     }
    // setter para modificar nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // setter para modificar número de empleado
    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    // setter para modificar sueldo base
    public void setSueldoBase(double sueldoBase){
        if(sueldoBase >= 0){
            this.sueldoBase = sueldoBase;
        }else{
            this.sueldoBase = 0;
        }
    }

    // metodo para que se pueda sobre escribir en las clases hijas
    public double calcularPagos(){
        return sueldoBase;
    }
    //  metodo comun para todos los empleados
    public String mostrarInformacion(){
        return "Nombre: " + nombre + "\nNúmero de empleado: " + numeroEmpleado + "\nSueldo base: " + sueldoBase;
    }
    


}
