public class Automovil extends Vehiculo{
    //Atributos propios del automovil
    private int numeroPuertas;
    private double redimientoKilometros;

    // Contructor de clase hija
    public Automovil(String marca, String modelo, double velocidaMaxima,int numeroPuertas,double rendimientoKilometros){
        super(marca,modelo,velocidaMaxima);    
        this.numeroPuertas = numeroPuertas;
        this.redimientoKilometros=rendimientoKilometros;
    
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
   
    public void setNumeroPuertas(int numeroPuertas){
        if(numeroPuertas>0){
            this.numeroPuertas = numeroPuertas;
        }
    }
    public void setRendimientoKilometro(double rendimientoKilometros){
        if(rendimientoKilometros >0){
            this.redimientoKilometros=rendimientoKilometros;
        }
    }
    //sobre escritura de los metodos heredados
    @Override 
    public double calcularCostoViaje(double kilometros){
        double precioGasolina = 24.0;
        //caculamos cuantos litros se requieren
        double litrosNecesarios = kilometros / redimientoKilometros;
        return litrosNecesarios * precioGasolina;
    }
    // Metodo propio del automovil
    public void mostrarPuertas(){
        System.out.println("Numero de puertas"+numeroPuertas);
    }

}
