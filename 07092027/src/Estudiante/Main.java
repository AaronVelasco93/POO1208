package Estudiante;

public class Main {
    public static void main(String[] args) {
        Alumne Aaron = new Alumne("413112576","Computacion",9.2);

        String Carrera = Aaron.getCarrera();
        System.out.println(Carrera);


        double beca= Aaron.getPromedio();
        if (beca >=9){
            System.out.println("Puedes ir a Canada");

        }else{
            System.out.println("Se queda en Aragon");
        }


    }
}
