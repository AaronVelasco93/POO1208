package Mascota;

public class Mascota {
    // atributos publicos
   public String nombre;
   public String raza;
   public int edad;
   private String color;
   public String tamanio; 

   //constructor
   public Mascota(String nombre, int edad, String color){
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
   
   }
   //metodo general
   public void PresentarMascota(){
        System.out.println("Los datos de mi mascota son ");
        System.out.println("El nombre es "+ nombre);
        System.out.println("La edad es "+ edad);
        System.out.println("Su color es "+ color); 

   }
   //saber edad mascota
   public void edadMascota(){
    System.out.println("Edad de mi mascota:"+edad);
   }

   //metodo para edad**
   public void cumpleaños(){
    edad++;
    System.out.println("Fue el compleaños de mi mascota"+edad);
   }
}
