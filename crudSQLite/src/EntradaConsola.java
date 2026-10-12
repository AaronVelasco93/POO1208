import java.util.Scanner;

// lee y valida los datos escritos por el ususario
// separar estas validaciones evitara repetir ciclos y try/catch en cada opcion del menu, 
// todos lo metodos vuelven a preguntar hasta recibir un calor valido
public class EntradaConsola {
    // instanciar un objeto scanner
    private final Scanner teclado = new Scanner(System.in);

    /* lee una linea y eliminar los espacios al inicio y al el final */
    public String leerTexto(String mensaje){
        System.out.println(mensaje);
        return teclado.nextLine().trim();
    }
    // No permite aceptar una cadena vacio como nombre de producto
    public String leerTextoObligatorio(String mensaje){
        while(true){
            String texto = leerTexto(mensaje);
            if(!texto.isBlank()){
                return texto;
            }
            System.out.println("El texto no puede estar vacio");
        }
    }
    // Convierte el texto a int y controla NumberFormatException
    public int leerEntero(String mensaje){
        while (true) {
            try{
                return Integer.parseInt(leerTexto(mensaje));

            }catch(NumberFormatException error){
                System.out.println("Escribe un numero entero valido");
            }
        }
    }
    // El ID, tiene que ser mayor a 0 y de tipo int
    public int leerEnteroPositivo(String mensaje){
        while (true) {
               int numero = leerEntero(mensaje);
               if(numero >=0 ){
                return numero;
               } 
               System.out.println("El numero no puede ser negativo");
        }
    }
    // leer los precios y que acepte punto o coma como separador decimal
    public double leerDecimalNoNegativo(String mensaje){
        while (true){
            try{ 
                String texto = leerTexto(mensaje).replace(',','.' );
                double numero = Double.parseDouble(texto);
                if(numero >= 0 && Double.isFinite(numero)){
                    return numero;
                }
                System.out.println("El numero no puede ser negativo ni infinito");

            }catch( NumberFormatException error){
                    System.out.println("Escribe un numero decimal valido");
            }
            
        }
    }
    // liberar el Scanner cuando el programa termine
    public void cerrar(){
        teclado.close();
    }

    
}