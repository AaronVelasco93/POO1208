public class Estudiante {
    public String nombre;
    public String numeroCuenta;
    public String carrera;
    public int semestre;
    public double promedio;

    //contructor
    

    public void presentarse(){
        System.out.println("Hola mi nombre es:"+nombre);
        System.out.println("Mi numero de Cuenta es:"+ numeroCuenta);
        System.out.println("Mi carrera es: "+ carrera);
        System.out.println("Mi promedio es"+promedio);
    }
}
