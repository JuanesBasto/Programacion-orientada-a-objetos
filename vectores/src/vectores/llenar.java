package vectores;
import java.util.Scanner;
import vectores.validar;
/**
 *
 * @author basto
 */
public class llenar {
    public void llen(int dim){
        Scanner in = new Scanner(System.in);
        int[] Age = new int[dim];
        String[] Name = new String[dim];
        String n;
        int a;
        boolean valedad;
        validar edad = new validar();
        
        for (int i=0;i<Age.length;i++){
            System.out.println("Digite el Nombre");
            n = in.nextLine();
            Name[i] = n;
            System.out.println("Digite la edad");
            do{
                System.out.println("Ingrese una edad valida");
                a = in.nextInt();
              
                valedad= edad.limage(a);
            }while(valedad == false);
            Age[i] = a;
            in.nextLine();
        }
        imprimir doc = new imprimir();
        doc.printy(Age, Name);
        buscar f= new buscar();
        f.search(Age, Name);
    }
}
