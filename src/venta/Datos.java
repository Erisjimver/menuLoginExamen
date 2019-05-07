package venta;
public class Datos {
    
    
//estas variables son comunes con docente y estudiante por eso vas a hacer que herede cada una estos atributos 
 private int cantidad;
 private long preciounitario;
   
 
 public Datos() {
        this.cantidad=0;
        this.preciounitario=0;
       
    }
// aqui vas a escribir por medio de los formularios de Docente y estudiante y leer los atributos que van a tener acceso la clase docente y estudiante 
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(long preciounitario) {
        this.preciounitario = preciounitario;
    }

 
 
 
 
    
    
}
