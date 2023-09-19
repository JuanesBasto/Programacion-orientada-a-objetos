package makro;
import java.util.Scanner;
/**
 *
 * @author basto
 */
public class MAKRO {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        // TODO code application logic here
        
        menu();
    }
     
    public static void menu () {
        Scanner in = new Scanner(System.in);
        System.out.println("________________________________________");
        System.out.println("               TIENDA MAKRO             ");
        System.out.println("________________________________________");
        System.out.println("Digite el nombre del cajero");
        String ncajero = in.nextLine();
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("________________________________________");
        System.out.println("               TIENDA MAKRO             ");
        System.out.println("________________________________________");
        System.out.println(  "Buenos dias "+ncajero+ " ingrese en que dia \ndel mes estamos");
        int dia;
        boolean vald;        
        dia = in.nextInt();
        validaciones m1 = new validaciones();
        vald = m1.validardia(dia);
        while (vald== false){
            System.out.println("Ingrese un valor correcto (entre 1 y 31)");
            dia = in.nextInt();
            vald =m1.validardia(dia);
        }
        System.out.println("DATOS DEL CLIENTE:");
        mcompra(dia);
    }
    

    public static void vsexo(){
        Scanner in = new Scanner(System.in);
        boolean sex;
        validaciones m2 = new validaciones();
        do{
                String sexo = in.nextLine();
                sex = m2.validarsexo(sexo);
            }while(sex== false);

    }
    
    public static void mcompra(int dia){
        Scanner in = new Scanner(System.in);
        int doc = 0;
        int totalrecaudo=0;

        do{
            System.out.println("Numero de documento");
            doc = in.nextInt();
            if (doc ==0){
                break;
            }
            in.nextLine();
            System.out.println("Primer nombre ");
            String nombre = in.nextLine();
            
            System.out.println("Numero telefonico");
            String tlf = in.nextLine();
            
            System.out.println("E-mail");
            String email = in.nextLine();
            
            System.out.println("Sexo (M o F)");
            vsexo();
            
            System.out.println("Cantidad de productos");
            int nump = in.nextInt();
            
            productos p1= new productos();
            int tprod = p1.cproductos(nump, dia);
            
            descuentos d2 = new descuentos();
            int vced=d2.cedulaganadora(doc, dia);
            if (vced==0){
                System.out.println("Felicitaciones, has sido ganador de nuestra");
                System.out.println("promocion de semana santa, el valor a pagar por");
                System.out.println("tu compra es de $:"+vced);
            }else{
                System.out.println("Señor "+nombre+" el valor a pagar de su compra es $"+tprod);
            }
            totalrecaudo += tprod;
        }while(doc !=0);
        System.out.println("El total recaudado por ventas es de $"+totalrecaudo);
    }
    
    
}
