package Estudiante;

public class Alumne {
    // Atributos privados
    private String nombre;
    private String NumeroCuenta;
    private String Carrera;
    private double promedio;

    //Constructor
    public Alumne (String NumeroCuenta, String Carrera,double promedio){
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
        this.promedio = promedio;
    }
    // Metodo para poder obtener la carrera
    public String getCarrera(){
        return Carrera;
    }

    public double getPromedio(){
        return  promedio;
    }
}
