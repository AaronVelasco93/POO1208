public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private double rendimientoKilometro;
    //constructor
    public Motocicleta(String marca, String modelo, double velocidadMaxima,int cilindrada, double redimientoKilometro){
        super(marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
        this.rendimientoKilometro = redimientoKilometro;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    public  void setCilindrada(int cilindrada){
        if(cilindrada >0){
            this.cilindrada = cilindrada;
        }
    }
    public double getRendimientoKilometro(){
        return  rendimientoKilometro;
    }
    public void setRedimientoKilometro(double redimientoKilometro){
        if(redimientoKilometro >0 ){
            this.rendimientoKilometro = redimientoKilometro;
        }
    }

    // La moto usa su propia formula
    @Override 
    public double calcularCostoViaje(double kilometros){
       double precioGasolina = 24.0;
        //caculamos cuantos litros se requieren
        double litrosNecesarios = kilometros / rendimientoKilometro;
        return litrosNecesarios * precioGasolina;
    }
    //metodo de motocicleta
    public void mostrarCilindrada(){
        System.out.println("Cilindrada"+cilindrada+"cc");
    }


}
