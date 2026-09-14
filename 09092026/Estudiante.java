public class Estudiante {
    // Atributos
    public String nombre;
    public String numeroCuenta;
    public String carrera;
    private int semestre;
    private double promedio;
    //constructor
    public Estudiante (String NumeroCuenta, double Promedio,int Semestre){
            this.numeroCuenta = NumeroCuenta;
            this.promedio = Promedio;
            this.semestre = Semestre;
    }
    //metodo get -> obtener un atributo
    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double Promedio){
        this.promedio=Promedio;
    }

    public void Promedio(double promedio){
        if(semestre>=1 && promedio <=10){
                this.promedio= promedio;
        }else{
            System.out.println("promedio invalido");
            this.promedio=0;
        }
    }


    // metodo set
    //metodo
    public void presentarse() {
        System.out.println("No Cuenta: " + numeroCuenta);
        System.out.println("Promedio" + promedio);

    }
    public void mostrarPromedio() {
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }
    public double obtnerPromedio(){
        return promedio;
    }
    public double sumaCalificacion(){
        return (((promedio)/4)*4.6)/4.5;
    }

    
    

}
