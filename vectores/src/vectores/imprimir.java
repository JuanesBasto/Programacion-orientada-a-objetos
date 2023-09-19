package vectores;

/**
 *
 * @author basto
 */
public class imprimir {
    
    public  void printy(int Age[], String Name[]){
    
        for (int i=0;i<Age.length;i++){
            System.out.println("Posicion ["+i+"]");
            System.out.println("Nombre: "+Name[i]);
            System.out.println("Edad: "+Age[i]);
        }
    }
}
