package venta;

public class estudiante extends Datos  implements implementos{  //aplicas interfaz  y herencia 
    
  
    
    public estudiante() {
        super(); //inicializas los atributos de la clase Datos de la que heredas 
    }

   // estos metodos van a retornar los valores calculados 
    //estos metodos son implementados de la interfaz Implementos 
   @Override
   public long subtotal(){
       
     long subtotal=this.getCantidad()*this.getPreciounitario();
       
       return subtotal;
   }
   
   @Override
    public long total(){
        long descuento=(this.subtotal()*10)/100;  //aplicas el descuento
        long tot=this.subtotal()-descuento;
     return tot;   
    }
    
}
    

