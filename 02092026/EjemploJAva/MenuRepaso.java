package EjemploJAva;
import java.util.Scanner;

public class MenuRepaso {

    // metodo main y estatico para que se pueda ejecutar sin necesidad de crear un
    // objeto de la clase
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // variable donde se guardara la opcion del menu
        int opcion = 0;
        // El ciclo whilw mantendra el menu activo hasta que el usuario decida salir
        while (opcion != 5) {
            // se imprime el menu
            System.out.println("Menu de Repaso");
            System.out.println("1. Sumar numeros");
            System.out.println("2. Saber si un numero es par o impar");
            System.out.println("3. Calcular el promedio de 3 calificaciones");
            System.out.println("4. Mostrar del 1 a N");
            System.out.println("5. Salir o terminar el programa");
            System.out.print("Ingrese una opcion: ");
            // se lee la opcion del usuario
            opcion = teclado.nextInt();

            // se evalua la opcion ingresada por el usuario
            switch (opcion) {
                case 1:
                    // Declaracion de variables para la suma
                    double numero1;
                    double numero2;
                    double suma;
                    // Se solicita al usuario que ingrese los numeros a sumar
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = teclado.nextDouble();
                    // Se realiza la suma
                    suma = numero1 + numero2;
                    // Se muestra el resultado de la suma
                    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

                    break;
                case 2:
                    //saber si un numero es par o impar
                    int numero;
                    System.out.print("Ingrese un numero: ");
                    numero = teclado.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("El numero " + numero + " es par.");
                    } else {
                        System.out.println("El numero " + numero + " es impar.");
                    }
                    
                    break;
                case 3:
                    // Calcular el promedio de 3 calificaciones
                    double calificacion1;
                    double calificacion2;
                    double calificacion3;
                    double promedio;
                    System.out.print("Ingrese la primera calificacion: ");
                    calificacion1 = teclado.nextDouble();
                    System.out.print("Ingrese la segunda calificacion: ");
                    calificacion2 = teclado.nextDouble();
                    System.out.print("Ingrese la tercera calificacion: ");
                    calificacion3 = teclado.nextDouble();
                    promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
                    System.out.println("El promedio de las calificaciones es: " + promedio);
                    if(promedio >= 6){
                        System.out.println("El alumno aprobo");
                    }else{
                        System.out.println("El alumno reprobo");
                    }
                    
                
                    break;
                case 4:
                    // Mostrar del 1 a N
                    int limite;
                    System.out.print("Ingrese el numero hasta el cual quieres contar: ");
                    limite = teclado.nextInt();
                    System.out.println("Contando del 1 al " + limite + ":");
                    // inicializamos el contador
                    int contador = 1;
                    // ciclo while para contar del 1 al limite
                    while (contador <= limite) {
                        System.out.println(contador);
                        contador++;
                    }


                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
                    break;
            }
            teclado.close();

        }

    }

}
