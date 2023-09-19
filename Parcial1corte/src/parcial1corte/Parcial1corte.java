/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1corte;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Parcial1corte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        Scanner in = new Scanner(System.in);

        /*int num = 1234567;
        int aux1 = num / 100000;
        int aux2 = (num / 10000) % 10;
        int aux3 = (num % 10000) / 1000;
        int aux4 = ((num % 10000) / 100) % 10;
        int aux5 = ((num % 10000) / 10) % 10;
        int aux6 = (num % 1000)%10;
        System.out.println(aux6);*/
        int dim = 0;
        System.out.println("Digite la dimension");
        do {
            System.out.println("La dimension debe ser positiva y diferente de 0");
            dim = in.nextInt();
        } while (dim <= 0);

        int Numero[] = new int[dim];
        String Nombre[] = new String[dim];

        System.out.println("Digite la opcion del vector");

        System.out.println("1. Insertar");
        System.out.println("2. Eliminar");
        System.out.println("3.Salir");

        do {
            do {
                opc = in.nextInt();
            } while (opc < 0);

            switch (opc) {
                case 1:

                    insertar(Numero, Nombre);
                    for (int i = 0; i < (Nombre.length); i++) {
                        System.out.println(Numero[i]+" "+Nombre[i]);
                    }
                    break;

                case 2:

                    eliminar(Nombre);
                    for (int i = 0; i < (Nombre.length)-1; i++) {
                        System.out.println(Numero[i]+" "+Nombre[i]);
                    }
                    break;

                case 3:
                    System.out.println("Cerrando programa");
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opc != 3);
    }

    public static void insertar(int Numero[], String Nombre[]) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < Numero.length; i++) {
            System.out.println("Digite un numero");
            int num = in.nextInt();
            in.nextLine();
            System.out.println("Ingrese un nombre");
            String name = in.nextLine();
            Nombre[i] = name;

            int aux = num;
            int cifras = 0;
            while (aux != 0) {
                aux = aux / 10;
                cifras += 1;
            }
            int repetidos = 0;
            for (int j = 0; j < cifras ; j++) {
                if (cifras == 1) {
                    repetidos = 0;
                } else if (cifras == 2) {
                    int aux1 = num / 10;
                    int aux2 = num % 2;

                    if (aux1 == aux2) {
                        repetidos = 1;
                    } else {
                        repetidos = 0;
                    }
                } else if (cifras == 3) {
                    int aux1 = num / 10;
                    int aux2 = (num / 10) % 10;
                    int aux3 = (num % 100) % 10;

                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux3) {
                        repetidos += 1;
                    }
                    if (aux2 == aux3) {
                        repetidos += 1;
                    }
                } else if (cifras == 4) {
                    int aux1 = num / 1000;
                    int aux2 = ((num / 10) / 10) % 10;
                    int aux3 = (num % 100) / 10;
                    int aux4 = (num % 100) % 10;

                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux3) {
                        repetidos += 1;
                    }
                    if (aux1 == aux4) {
                        repetidos += 1;
                    }
                    if (aux2 == aux3) {
                        repetidos += 1;
                    }
                    if (aux2 == aux4) {
                        repetidos += 1;
                    }
                    if (aux3 == aux4) {
                        repetidos += 1;
                    }

                } else if (cifras == 5) {
                    int aux1 = num / 10000;
                    int aux2 = (num / 1000) % 10;
                    int aux3 = (num % 1000) / 100;
                    int aux4 = ((num % 1000) / 10) % 10;
                    int aux5 = ((num % 1000) % 10);

                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux3) {
                        repetidos += 1;
                    }
                    if (aux1 == aux4) {
                        repetidos += 1;
                    }
                    if (aux1 == aux5) {
                        repetidos += 1;
                    }
                    if (aux2 == aux3) {
                        repetidos += 1;
                    }
                    if (aux2 == aux4) {
                        repetidos += 1;
                    }
                    if (aux2 == aux5) {
                        repetidos += 1;
                    }
                    if (aux3 == aux4) {
                        repetidos += 1;
                    }
                    if (aux3 == aux5) {
                        repetidos += 1;
                    }
                    if (aux4 == aux5) {
                        repetidos += 1;
                    }
                } else if (cifras == 6) {
                    int aux1 = num / 100000;
                    int aux2 = (num / 10000) % 10;
                    int aux3 = (num % 10000) / 1000;
                    int aux4 = ((num % 10000) / 100) % 10;
                    int aux5 = ((num % 10000) / 10) % 10;
                    int aux6 = (num % 1000) % 10;

                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux2) {
                        repetidos += 1;
                    }
                    if (aux1 == aux3) {
                        repetidos += 1;
                    }
                    if (aux1 == aux4) {
                        repetidos += 1;
                    }
                    if (aux1 == aux5) {
                        repetidos += 1;
                    }
                    if (aux1 == aux6) {
                        repetidos += 1;
                    }
                    if (aux2 == aux3) {
                        repetidos += 1;
                    }
                    if (aux2 == aux4) {
                        repetidos += 1;
                    }
                    if (aux2 == aux5) {
                        repetidos += 1;
                    }
                    if (aux2 == aux6) {
                        repetidos += 1;
                    }
                    if (aux3 == aux4) {
                        repetidos += 1;
                    }
                    if (aux3 == aux5) {
                        repetidos += 1;
                    }
                    if (aux3 == aux6) {
                        repetidos += 1;
                    }
                    if (aux4 == aux5) {
                        repetidos += 1;
                    }
                    if (aux4 == aux6) {
                        repetidos += 1;
                    }
                    if (aux5 == aux6) {
                        repetidos += 1;
                    }

                }
                Numero[i] = repetidos;
            }

        }
    }

    public static void eliminar(String Nombre[]) {
        Scanner in = new Scanner(System.in);
        Eliminar e = new Eliminar();

        System.out.println("Ingrese el nombre a eliminar");
        String namedelete = in.nextLine();
        boolean n = e.vDelete(namedelete, Nombre);

        while (n == false) {
            System.out.println("El nombre no se encuentra en el array");
            namedelete = in.nextLine();
            n = e.vDelete(namedelete, Nombre);
        }

        int pos = 0;
        for (int i = 0; i < Nombre.length; i++) {
            if (Nombre[i].equalsIgnoreCase(namedelete)) {
                pos = i;
            }
        }
        for (int i = pos; i < (Nombre.length) - 1; i++) {
            Nombre[i] = Nombre[i + 1];
        }

    }

}
