package src;
public class Estudiante {
    // Declaracion de atributos (caracteristicas) del estudiante
    public String nombre;
    public String numeroCuenta;
    public String carrera;
    public int semestre;
    public double promedio;
    public String correoElectronico;
    
    public Estudiante() {
        // Constructor por defecto
    }
    // contructor de la clase estudiante
    public Estudiante(String nombre, String numeroCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;

    }

    //metodo presentar al alumno
    public void presentarse(){
        System.out.println("Hola, mi nombre es"+ nombre);
        System.out.println("Mi numero de cuenta es: "+ numeroCuenta);
        System.out.println("Mi carrera es: "+ carrera);
        System.out.println("Estoy en el semestre: "+ semestre);
        System.out.println("Mi promedio es: "+ promedio);
        System.out.println("Mi correo electronico es: "+ correoElectronico);

    }



}

