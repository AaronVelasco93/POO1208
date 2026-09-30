public class Vehiculo {
    //Atributos privados: aplicamos encapsulamiento
    private String marca;
    private String modelo;
    private double velocidadMaxina;

    //Contructor de la clase padre
    public Vehiculo (String marca, String modelo, double velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        setVelocidadMaxima(velocidadMaxima);
    }
    //Getter Marca
    public String getMarca(){
        return  marca;
    }
    //setter de marca
    public void setMarca(String marca){
        this.marca = marca;
    }
    //getter Modelo
    public  String getModelo(){
        return modelo;
    }
    // setter modelo
    public void setModelo(String modelo){
        this.modelo=modelo;

    }
    //getter velocidadMaxima
    public double getVelocidadMaxima(){
        return velocidadMaxina;
    }
    // setter velocidad maxima (validacion)
    public void setVelocidadMaxima(double velocidadMaxima){
        if(velocidadMaxima>=0){
            this.velocidadMaxina= velocidadMaxima;
        }else{
            this.velocidadMaxina=0;
        }
    }
    //metodo comun para todos los veiculos
    public void mostrarDatos(){
        System.out.println("Marca"+marca);
        System.out.println("Modelo"+modelo);
        System.out.println("Velocidad Maxima"+velocidadMaxina);
    }
    // metodo que las clases hijas podran sobrescribir
    public double calcularCostoViaje(double kilometros){
        
        // valor generico para un veiculo
        return kilometros +1.0;
    }


}

