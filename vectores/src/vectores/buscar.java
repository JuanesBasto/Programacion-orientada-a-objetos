package vectores;
import java.util.Scanner;
/**
 *
 * @author basto
 */
public class buscar {
    
    public void search(int Age[],String Name[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Que edad deseas buscar");
        int edadbuscada= in.nextInt();
        
        boolean find = false;
        
        System.out.println("Las personas con "+edadbuscada+" años son :");
        for (int i=0;i<Age.length;i++){
            if (Age[i]== edadbuscada){
                System.out.println(Name[i]+"");
                find=true;
            }
        }
        if (find==false){
            System.out.println("No se encontraron personas con esa edad");
        }
    }
}
