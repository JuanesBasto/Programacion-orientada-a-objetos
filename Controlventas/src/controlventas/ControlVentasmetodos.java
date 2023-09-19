package controlventas;
import java.util.Scanner;
/**
 *
 * @author basto
 */
public class ControlVentasmetodos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantp = 0, cantc = 0, cantz = 0, total = 0, num_personas = 0;
        String opcion;
        boolean nuevoCliente = true;

        while (nuevoCliente) {
            int prenda = obtenerPrenda(in, num_personas);
            while (prenda != 4) {
                switch (prenda) {
                    case 1:
                        cantp++;
                        total += 96000;
                        System.out.println("Se agrego un pantalon");
                        break;
                    case 2:
                        cantc++;
                        total += 32000;
                        System.out.println("Se agrego una camisa");
                        break;
                    case 3:
                        cantz++;
                        total += 60000;
                        System.out.println("Se agregaron unos zapatos");
                        break;
                    default:
                        System.out.println("Digite una opcion valida");
                        break;
                }
                prenda = obtenerPrenda(in, num_personas);
            }

            opcion = "";
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("p")) {
                System.out.println("Desea agregar un nuevo cliente?");
                System.out.println("Si: s");
                System.out.println("No: p");
                opcion = in.next();

                if (opcion.equalsIgnoreCase("s")) {
                    nuevoCliente = true;
                } else if (opcion.equalsIgnoreCase("p")) {
                    nuevoCliente = false;
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("La opcion ingresada no es valida");
                }
            }
            num_personas++;
        }

        System.out.println("Compraron " + num_personas + " personas");
        System.out.println("Se vendieron " + total + " en total");
        System.out.println("Se vendieron " + cantp + " pantalones, " + cantc + " camisas y " + cantz + " zapatos.");
    }

    public static int obtenerPrenda(Scanner in, int num_personas) {
        System.out.println("Cliente " + (num_personas + 1) + " que prenda deseas comprar:");
        System.out.println("1.Pantalosnes $96.000");
        System.out.println("2.Camisas $32000");
        System.out.println("3.Zapatos $60.000");
        System.out.println("Pulse 4 para terminar la compra");

        int prenda = in.nextInt();
        return prenda;
    }
}
