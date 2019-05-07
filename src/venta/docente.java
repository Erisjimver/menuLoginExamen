package venta;
public class docente extends Datos implements implementos{  //aqui aplicas interfaces y herencia 
 

    public docente() {
        super();
        //atributos que vas a escribir desde el formulario MenuDocente 
        
    }

  
   // estos metodos van a retornar los valores calculados 
    //estos metodos son implementados de la interfaz Implementos 
   @Override
   public long subtotal(){
       
     long subtotal=this.getCantidad()*this.getPreciounitario(); //vas a leer los valores que heredas 
       
       return subtotal;
   }
   
   @Override
    public long total(){
        long descuento=(this.subtotal()*12)/100;  //aplicas el descuento
        long tot=this.subtotal()-descuento;
     return tot;   
    }
    
}
