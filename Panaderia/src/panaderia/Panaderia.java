package panaderia;

import java.util.Scanner;
import panaderia.llenar.llenarVec;
import panaderia.validaciones.Validar;

public class Panaderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mprincipal();
    }

    public static void mprincipal() {
        Scanner in = new Scanner(System.in);
        Validar p1 = new Validar();
        llenarVec p2 = new llenarVec();
        boolean valdim;
        int dim;
        do {
            System.out.println("Digite la cantidad de clientes");
            dim = in.nextInt();
            valdim = p1.valdim(dim);
        } while (valdim == false);

        p2.llenar(dim);
    }

}
