package evaluacion;
public class Preguntas {
    
    String[] preguntas = {
        "¿La tecnología orientada a objetos se define como?",
        "Una clase es una estructura preliminar que describe.....", 
        "¿Las clases pueden usar abstraccion?",
        "¿Que es un objeto?", 
        "¿La palabra reservada de una Herencia es:?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
