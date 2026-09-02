package src;


public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Ana";
        estudiante1.numeroCuenta = "416117202";
        estudiante1.carrera = "Ingeniería en Computacion";
        estudiante1.semestre = 5;
        estudiante1.promedio = 9.5;
        estudiante1.correoElectronico = "ana@uabc.edu.mx";
        estudiante1.presentarse();

    System.out.println("-------------------------------------");
        Estudiante Juan = new Estudiante("juan", "416117203");
        Juan.presentarse();
       
    }
}
