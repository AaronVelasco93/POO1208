public class Pricipal {
    
    public static void main(String[] args) {
        Estudiante Computacion = new Estudiante("413112576",9.3);
        // Computacion.presentarse();
        // Computacion.mostrarPromedio();
        // System.out.println(Computacion.obtnerPromedio());

        // Computacion.numeroCuenta="55656";
        // System.out.println(Computacion.numeroCuenta);
        // System.out.println(Computacion.getPromedio());
        System.out.println(Computacion.getPromedio());        

        Computacion.setPromedio(10);
        System.out.println(Computacion.getPromedio());        

        /*
        Computacion.nombre="Aaron";
        Computacion.numeroCuenta="413112576";
        Computacion.carrera="M en C";
        Computacion.semestre=4;
        Computacion.promedio=9.3;
        
        Computacion.presentarse();
        Computacion.obtnerPromedio();
        double DatoAlfa= Computacion.sumaCalificacion();

        double dato1= 3.6;
        double dato2=9.43;
        double Resultado= (dato1/DatoAlfa)/.16+dato2;
        System.out.print(Resultado);
*/




    }
}
