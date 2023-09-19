 
package controlventas;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Controlventas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        /*int prenda, cantp = 0, cantc = 0, cantz = 0, total = 0, num_personas = 0;
        String opcion;
        boolean nuevoCliente = true;
        
        while(nuevoCliente){
        prenda=0;
        while (prenda!=4){
            System.out.println("Cliente "+(num_personas+1)+" que prenda deseas comprar:");
            System.out.println("1.Pantalosnes $96.000");
            System.out.println("2.Camisas $32000");
            System.out.println("3.Zapatos $60.000");
            System.out.println("Pulse 4 para terminar la compra");
            
            prenda= in.nextInt();
            
            switch(prenda){
                case 1:
                    cantp++;
                    total+=96000;
                    System.out.println("Se agrego un pantalon");
                    break;
                case 2:
                    cantc++;
                    total+=32000;
                    System.out.println("Se agrego una camisa");
                    break;
                case 3:
                    cantz++;
                    total+=60000;
                    System.out.println("Se agregaron unos zapatos");
                    break;
                case 4:
                    num_personas++;
                    System.out.println("Terminando la compra...");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
         
        }
        System.out.println("Desea agregar un nuevo cliente?");
        System.out.println("Si: s");
        System.out.println("No: p");
        opcion= "";
        while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("p")){
            System.out.println("Ingrese una opcion(s para agregar, p para salir");
            opcion = in.next();
            
            if(opcion.equalsIgnoreCase("s")){
                nuevoCliente= true;
            }else if(opcion.equalsIgnoreCase("p")){
                nuevoCliente= false;
                System.out.println("Saliendo del programa...");
            }else {
                System.out.println("La opcion ingresada no es valida");
            }
        }
        }
        
        
        
        System.out.println("Compraron "+num_personas+" personas");
        System.out.println("Se vendieron "+total+ " en total");
        System.out.println("Se vencieron "+cantp+" pantalones, "+cantc+" camisas y "+cantz+" zapatos.");
    }*/
    int numero = in.nextInt();
    int contador = 0;

    while (numero != 0) {
        numero /= 10;
        contador++;
    }

    System.out.println("El número " + numero + " tiene " + contador + " cifras.");

    }   
}
