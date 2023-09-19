package quiz;

import java.util.Scanner;
import quiz.Proceso.Llenar;

/**
 *
 * @author basto
 */
public class Quiz {

    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner in = new Scanner(System.in);
        Validar v1 = new Validar();
        Llenar l1 = new Llenar();
        menu();
        int opc = 1;
        int dim = 0;
        boolean vdim = false, vopc = false;
        int[] Vec = null;
        String[] Vec2 = new String[2];
        do {
            do{
            opc = in.nextInt();
            vopc = v1.valopc(opc);
            }while(vopc==false);
            switch (opc) {
                case 1:
                    System.out.println("Digite la dimension");
                    do {
                        System.out.println("La dimension debe ser positiva");
                        dim = in.nextInt();
                        vdim = v1.valdim(dim);
                    } while (vdim == false);
                    Vec = new int[dim];
                    l1.llevarvec(Vec, Vec2);

                    break;
                case 2:
                    for (int i = 0; i < Vec.length; i++) {
                        System.out.println("El numero en la posicion " + i + " es " + Vec[i]);
                    }

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;

            }
        } while (opc != 3);

    }

    public static void menu() {
        System.out.println("--------------------");
        System.out.println("         MENU       ");
        System.out.println("--------------------");
        System.out.println("1. Llenar vector ");
        System.out.println("2. Imprimir vector 1");
        System.out.println("3. Salir");
        System.out.println("--------------------");
        System.out.println("Seleccione la opcion:");
    }
}
