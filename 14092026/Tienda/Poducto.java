package Tienda;
public class Poducto {
 private String codigo;
 private String nombre;
 private double precio;
 private int existencia;
 
 public Producto(String Codigo, String Nombre, double Precio, int Existencia){
    this.codigo = Codigo;
    this.nombre = Nombre;
    setPRecio(Precio);
    setExistencia(Existencia);
 }
 //Agregar metodos Set y Get
 //Agregar mostrarInformacion()
 //Agregar aumentarExistencia(int Cantidad)
 //Agregar CalcularValorInventario()
}


