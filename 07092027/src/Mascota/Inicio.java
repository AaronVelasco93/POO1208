package Mascota;

public class Inicio {
    public static void main(String[] args) {
        //Creacion del objeto mascota con un constructor
        Mascota miMascota =new Mascota("Goyo",50,"cafe");
        //Generar Metodo
        miMascota.PresentarMascota();
        // Edad mascota
        miMascota.edadMascota();
        miMascota.cumpleaños();

        miMascota.color="rojo";

        miMascota.PresentarMascota();

    }
    
}
