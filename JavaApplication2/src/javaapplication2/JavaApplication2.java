package javaapplication2;
import java.util.Scanner;
import javaapplication2.submodulo1.submodulo11;
/**
 *
 * @author basto
 */
public class JavaApplication2 {

    public static int sumar(int a){
        submodulo11 meth1 = new submodulo11();
        int totalsuma = a+10;
        int rtarestar = meth1.restar(totalsuma);
        
        return totalsuma;
    }
    public int multi (int number){
        JavaApplication2 meth= new JavaApplication2();
        int multipli= number *10;
        if (multipli>=99){
            meth.division(multipli);
        }
        return multipli;
    }
    public void division (int multipli){
        double rtadivi= multipli/2;
        System.out.println("Divi: "+rtadivi);
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        JavaApplication2 meth =new JavaApplication2();
        
        System.out.println("Digite un numero:");
        int number= in.nextInt();
        int rta=sumar(number);
        System.out.println("La suma es "+rta);
        int rtamulti =meth.multi(number);
        System.out.println(" La multiplicacion es: "+rtamulti);
        
    }
}
