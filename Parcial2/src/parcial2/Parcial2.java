/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import parcial2.validaciones.Validaciones;

/**
 *
 * @author basto
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static Perecederos registrarPerecederos(Scanner in, ArrayList<Perecederos> perecederos, Validaciones v1, ArrayList<NoPerecederos> noperecederos) {
        boolean valcod = false;
        long CodProd=0;
        do {
            System.out.println("Digite el codigo de producto");
             CodProd = in.nextInt();
            in.nextLine();
            valcod = v1.validarcodigo(perecederos, noperecederos, CodProd);
        } while (valcod == false);

        System.out.println("Digite el nombre del producto");
        String Nombre = in.nextLine();

        System.out.println("Digite el precio del producto");
        float Precio = in.nextFloat();

        System.out.println("Digite los dias para caducar");
        int DiasACaducar = in.nextInt();
        in.nextLine();
        return new Perecederos(DiasACaducar, CodProd, Nombre, Precio);

    }

    public static NoPerecederos registrarNoPerecederos(Scanner in, ArrayList<Perecederos> perecederos, Validaciones v1, ArrayList<NoPerecederos> noperecederos) {
        boolean valcod = false;
        long CodProd = 0;
        do {
            System.out.println("Digite el codigo de producto");
            CodProd = in.nextInt();
            in.nextLine();
            valcod = v1.validarcodigo(perecederos, noperecederos, CodProd);
        } while (valcod == false);
        in.nextLine();

        System.out.println("Digite el nombre del producto");
        String Nombre = in.nextLine();

        System.out.println("Digite el precio del producto");
        float Precio = in.nextFloat();

        System.out.println("Digite el tipo");
        int tipo = in.nextInt();
        in.nextLine();
        return new NoPerecederos(tipo, CodProd, Nombre, Precio);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Perecederos> perecederos = new ArrayList<>();
        ArrayList<NoPerecederos> noperecederos = new ArrayList<>();
        Validaciones v1 = new Validaciones();
        Scanner in = new Scanner(System.in);
        boolean bandera = false;
        do {
            System.out.println("**************************");
            System.out.println("Menu:");
            System.out.println("1.Insertar productos");
            System.out.println("2.Modificar productos");
            System.out.println("3.Listar productos");
            System.out.println("4.Salir");

            int opc = 0;
            boolean opcvalido = false;
            do {
                try {
                    System.out.println("Digite una opcion");
                    opc = in.nextInt();
                    opcvalido = true;

                } catch (InputMismatchException ex) {
                    System.out.println("No puede ingresar letras solo numeros");
                    in.nextLine();
                }

            } while (!opcvalido);

            switch (opc) {
                case 1:

                    boolean tipovalido = false;
                    int tipo = 0;
                    do {
                        try {
                            System.out.println("Que tipo de producto desea insertar");
                            System.out.println("1.Perecedero");
                            System.out.println("2.No perecedero");
                            System.out.println("Digite una opcion");
                            tipo = in.nextInt();
                            tipovalido = true;

                        } catch (InputMismatchException ex) {
                            System.out.println("No puede ingresar letras solo numeros");
                            in.nextLine();
                        }

                    } while (!tipovalido);
                    switch (tipo) {
                        case 1:
                            Perecederos perecedero = registrarPerecederos(in, perecederos, v1, noperecederos);
                            perecederos.add(perecedero);
                            System.out.println("Insercion Exitosa");
                            break;

                        case 2:
                            NoPerecederos noperecedero = registrarNoPerecederos( in,  perecederos,  v1,  noperecederos);
                            noperecederos.add(noperecedero);
                            System.out.println("Insercion Exitosa");
                            break;

                        default:
                            System.out.println("Ingrese un tipo de producto dentro de los rangos");
                            break;
                    }
                    bandera = false;
                    break;

                case 2:
                    boolean modvalido = false;
                    int mod = 0;
                    do {
                        try {
                            System.out.println("Que tipo de producto desea Modificar");
                            System.out.println("1.Perecedero");
                            System.out.println("2.No perecedero");
                            System.out.println("Digite una opcion");
                            mod = in.nextInt();
                            modvalido = true;

                        } catch (InputMismatchException ex) {
                            System.out.println("No puede ingresar letras solo numeros");
                            in.nextLine();
                        }

                    } while (!modvalido);
                    switch (mod) {
                        case 1:
                            System.out.println("Modificar Perecederos");
                            int i = 0;
                            for (Perecederos perecedero : perecederos) {
                                System.out.println(i + "" + perecedero.listar());
                                i++;
                            }
                            System.out.println("Digite la posicion del producto que desea modificar");
                            int opcmod = in.nextInt();
                            int k = 0;
                            for (Perecederos perecedero : perecederos) {
                                if (k == opcmod) {
                                    boolean valcod = false;
                                    long CodProd = 0;
                                    do {
                                        System.out.println("Digite el codigo de producto");
                                        CodProd = in.nextInt();
                                        in.nextLine();
                                        valcod = v1.validarcodigo(perecederos, noperecederos, CodProd);
                                    } while (valcod == false);
                                    perecedero.setCodigo(CodProd);
                                    in.nextLine();

                                    System.out.println("Digite el nombre del producto");
                                    String Nombre = in.nextLine();
                                    perecedero.setNombre(Nombre);

                                    System.out.println("Digite el precio del producto");
                                    float Precio = in.nextFloat();
                                    perecedero.setPrecio(Precio);

                                    System.out.println("Digite los dias para caducar");
                                    int DiasACaducar = in.nextInt();
                                    in.nextLine();
                                    perecedero.setDiasACaducar(DiasACaducar);
                                }
                                k++;
                            }

                            break;
                        case 2:
                            System.out.println("Modificar No Perecederos");
                            int p = 0;
                            for (Perecederos perecedero : perecederos) {
                                System.out.println(p + "" + perecedero.listar());
                                p++;
                            }
                            System.out.println("Digite la posicion del producto que desea modificar");
                            int opcmod2 = in.nextInt();
                            int l = 0;
                            for (NoPerecederos noperecedero : noperecederos) {
                                if (l == opcmod2) {
                                    boolean valcod = false;
                                    long CodProd = 0;
                                    do {
                                        System.out.println("Digite el codigo de producto");
                                        CodProd = in.nextInt();
                                        in.nextLine();
                                        valcod = v1.validarcodigo(perecederos, noperecederos, CodProd);
                                    } while (valcod == false);
                                    noperecedero.setCodigo(CodProd);
                                    in.nextLine();

                                    System.out.println("Digite el nombre del producto");
                                    String Nombre = in.nextLine();
                                    noperecedero.setNombre(Nombre);

                                    System.out.println("Digite el precio del producto");
                                    float Precio = in.nextFloat();
                                    noperecedero.setPrecio(Precio);

                                    System.out.println("Digite el tipo");
                                    tipo = in.nextInt();
                                    in.nextLine();
                                    noperecedero.setTipo(tipo);
                                }
                                l++;
                            }
                            break;
                    }

                    break;

                case 3:
                    //Listar
                    System.out.println("Listar productos");
                    System.out.println("---Perecederos");
                    for (Perecederos perecedero : perecederos) {
                        System.out.println("" + perecedero.listar());
                    }

                    System.out.println("---No perecederos");
                    for (NoPerecederos noperecedero : noperecederos) {
                        System.out.println("" + noperecedero.listar());

                    }
                    break;

                case 4:
                    bandera = false;
                    break;

                default:
                    System.out.println("Opcion fuera de rango. Digite nuevamente.");
            }
        } while (!bandera);

    }
}
