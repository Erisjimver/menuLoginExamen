package evaluacion;
import java.util.StringTokenizer;
public class Respuestas {

    String[] respuestas = {
      "una metodología de diseño de software",
      "un objeto y define atributos ",
      "si",
      "es una instancia de una clase",
      "e"
    };
    
    String[] radioR = {
        "una metodología de diseño grafico,una Jerarquia de clases,una metodología de diseño de software ,una metodología de diseño de clases",
        "un objeto y define atributos ,metodos abstractos,instancias de clases,metodo abstracto",
        "no,talves,siempre,si",
        "es un metodo abstracto,es una instancia de una clase,es una clase,es una encapsulacion",
        "extends,implements,herenc,extender",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        //separa cadena
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        //String como auziliar para obtener valores
        // el tamañano 4 es referente al numero de respuestas
        String[] a = new String[4];
        int i = 0;
       
        //metodo while para obtener los valores
        //referencia al objeto, y se usa HasMoreTokens para leer hasta que culminen las respuestas
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;//incrementa y obtiene todos los valores
        }
        
        return a;
    }
    //Asignar respuestas al Jframe
    public String[] setRespuestas(int posicion){//reccine un Int Pocicion
        String s1 = radioR[posicion];//pocicion
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
