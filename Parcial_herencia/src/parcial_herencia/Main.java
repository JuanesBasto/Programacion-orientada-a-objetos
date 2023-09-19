/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_herencia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import parcial_herencia.registros.Registrar;
import parcial_herencia.registros.Imprimir;
import parcial_herencia.registros.Validaciones;

/**
 *
 * @author basto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Futbolistas> futbolistas = new ArrayList<>();
        ArrayList<Esposas> esposas = new ArrayList<>();
        ArrayList<Aguateros> aguateros = new ArrayList<>();
        ArrayList<Entrenadores> entrenadores = new ArrayList<>();
        ArrayList<Medicos> medicos = new ArrayList<>();
        ArrayList<Jefe_masajista> jefesm = new ArrayList<>();
        ArrayList<Masajista> masajistas = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        Imprimir m2 = new Imprimir();
        Registrar m1 = new Registrar();

        Ingresopersona(m1, in, futbolistas, esposas, aguateros, entrenadores, medicos, jefesm, masajistas);

        boolean salir = false;

        while (salir == false) {
            System.out.println("Que tipo de persona desea seleccionar?");
            System.out.println("1- Futbolista");
            System.out.println("2- Esposa");
            System.out.println("3- Aguatero");
            System.out.println("4- Entrenador");
            System.out.println("5- Medico");
            System.out.println("6- Jefe masajista");
            System.out.println("7- Masajista");
            System.out.println("8- Deseo imprimir el registro de los datos ingresados");
            System.out.println("9- Deseo agregar mas personas");
            System.out.println("0- Salir");
            int opc = -1;
            boolean inputValido = false;

            do {
                try {
                    System.out.println("Digite una opcion");
                    opc = in.nextInt();
                    inputValido = true;

                } catch (InputMismatchException ex) {
                    System.out.println("No puede ingresar letras solo numeros");
                    in.nextLine();
                }
            } while (!inputValido);

            switch (opc) {
                case 1:
                    //--------------------------------------------------------
                    System.out.println("Futbolista");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Jugar Partido");
                    System.out.println("4-Entrenar");
                    System.out.println("5-Salir");
                    int fopc = in.nextInt();
                    Futbolistas jugadorSeleccionado;

                    switch (fopc) {
                        case 1:
                            jugadorSeleccionado = mostrarJugadores(futbolistas, in);
                            jugadorSeleccionado.Concentracion();
                            break;

                        case 2:
                            jugadorSeleccionado = mostrarJugadores(futbolistas, in);
                            jugadorSeleccionado.Viajar();
                            break;
                        case 3:
                            jugadorSeleccionado = mostrarJugadores(futbolistas, in);
                            jugadorSeleccionado.JugarPartido();
                            break;
                        case 4:
                            jugadorSeleccionado = mostrarJugadores(futbolistas, in);
                            jugadorSeleccionado.Entrenar();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }
                    break;
                //--------------------------------------------------------
                case 2:
                    //--------------------------------------------------------
                    System.out.println("Esposa");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Salir");
                    int fesp = in.nextInt();
                    Esposas esposaSeleccionado;

                    switch (fesp) {
                        case 1:
                            esposaSeleccionado = mostrarEsposas(esposas, in);
                            esposaSeleccionado.Concentracion();
                            break;

                        case 2:
                            esposaSeleccionado = mostrarEsposas(esposas, in);
                            esposaSeleccionado.Viajar();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }
                    break;
                //--------------------------------------------------------
                case 3:
                    //--------------------------------------------------------
                    System.out.println("Aguatero");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Servir agua");
                    System.out.println("4-Salir");
                    int Aopc = in.nextInt();
                    Aguateros aguateroSeleccionado;
                    switch (Aopc) {
                        case 1:
                            aguateroSeleccionado = mostrarAguateros(aguateros, in);
                            aguateroSeleccionado.Concentracion();
                            break;

                        case 2:
                            aguateroSeleccionado = mostrarAguateros(aguateros, in);
                            aguateroSeleccionado.Viajar();
                            break;

                        case 3:
                            aguateroSeleccionado = mostrarAguateros(aguateros, in);
                            aguateroSeleccionado.ServirAgua(futbolistas);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }

                    break;
                //--------------------------------------------------------
                case 4:
                    //--------------------------------------------------------
                    System.out.println("Entrenador");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Seguir partido");
                    System.out.println("4-Seguir entrenamiento");
                    System.out.println("5-Salir");
                    int Enopc = in.nextInt();
                    Entrenadores entrenadorSeleccionado;
                    switch (Enopc) {
                        case 1:
                            entrenadorSeleccionado = mostrarEntrenadores(entrenadores, in);
                            entrenadorSeleccionado.Concentracion();
                            break;

                        case 2:
                            entrenadorSeleccionado = mostrarEntrenadores(entrenadores, in);
                            entrenadorSeleccionado.Viajar();
                            break;

                        case 3:
                            entrenadorSeleccionado = mostrarEntrenadores(entrenadores, in);
                            entrenadorSeleccionado.SeguirPartido();
                            break;
                        case 4:
                            entrenadorSeleccionado = mostrarEntrenadores(entrenadores, in);
                            entrenadorSeleccionado.SeguirEntrenamiento();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }

                    break;
                //--------------------------------------------------------
                case 5:
                    //--------------------------------------------------------
                    System.out.println("Medico");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Historial");
                    System.out.println("4-Salir");
                    int Medopc = in.nextInt();
                    Medicos medicoSeleccionado;
                    switch (Medopc) {
                        case 1:
                            medicoSeleccionado = mostrarMedicos(medicos, in);
                            medicoSeleccionado.Concentracion(futbolistas);
                            break;

                        case 2:
                            medicoSeleccionado = mostrarMedicos(medicos, in);
                            medicoSeleccionado.Viajar();
                            break;

                        case 3:
                            medicoSeleccionado = mostrarMedicos(medicos, in);
                            medicoSeleccionado.Historial();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }

                    break;
                //--------------------------------------------------------
                case 6:
                    //--------------------------------------------------------
                    System.out.println("Jefe de masajistas");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Salir");
                    int Jeopc = in.nextInt();
                    Jefe_masajista jefeSeleccionado;

                    switch (Jeopc) {
                        case 1:
                            jefeSeleccionado = mostrarJefesm(jefesm, in);
                            jefeSeleccionado.Concentracion();
                            break;

                        case 2:
                            jefeSeleccionado = mostrarJefesm(jefesm, in);
                            jefeSeleccionado.Viajar();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }
                    break;
                //--------------------------------------------------------
                case 7:
                    //--------------------------------------------------------
                    System.out.println("Masajista");
                    System.out.println("Que desea hacer: ");
                    System.out.println("1-Concentracion");
                    System.out.println("2-Viajar");
                    System.out.println("3-Salir");
                    int Masopc = in.nextInt();
                    Masajista masjistaSeleccionado;

                    switch (Masopc) {
                        case 1:
                            masjistaSeleccionado = mostrarMasajistas(masajistas, in);
                            masjistaSeleccionado.Concentracion();
                            break;

                        case 2:
                            masjistaSeleccionado = mostrarMasajistas(masajistas, in);
                            masjistaSeleccionado.Viajar();
                            break;

                        case 3:
                            break;

                        default:
                            System.out.println("Opcion fuera de rango");
                            break;
                    }
                    break;
                //--------------------------------------------------------
                case 8:

                    System.out.println("Imprimir Datos");
                    m2.Imprimir(futbolistas, esposas, aguateros, entrenadores, medicos, jefesm, masajistas);
                    break;

                case 9:
                    //ingresar nueva persona
                    Ingresopersona(m1, in, futbolistas, esposas, aguateros, entrenadores, medicos, jefesm, masajistas);

                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opcion fuera de rango");
                    break;

            }

        }

        in.close();
    }

    public static Futbolistas mostrarJugadores(ArrayList<Futbolistas> futbolistas, Scanner in) {
        System.out.println("----- Lista de Futbolistas -----");
        for (int i = 0; i < futbolistas.size(); i++) {
            Futbolistas futbolista = futbolistas.get(i);
            System.out.println(i + ")" + " Nombre " + futbolista.getNombreFutbolista() + "dorsal " + futbolista.getNumeroCamisa());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del jugador : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Futbolistas jugadorSeleccionado = futbolistas.get(posicion);
        return jugadorSeleccionado;
    }

    public static Esposas mostrarEsposas(ArrayList<Esposas> esposas, Scanner in) {
        System.out.println("----- Lista de Esposas -----");
        for (int i = 0; i < esposas.size(); i++) {
            Esposas esposa = esposas.get(i);
            System.out.println(i + ")" + " Nombre " + esposa.getNombreEsposa());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion de la esposa : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Esposas esposaSeleccionado = esposas.get(posicion);
        return esposaSeleccionado;
    }

    public static Aguateros mostrarAguateros(ArrayList<Aguateros> aguateros, Scanner in) {
        System.out.println("----- Lista de Aguateros -----");
        for (int i = 0; i < aguateros.size(); i++) {
            Aguateros aguatero = aguateros.get(i);
            System.out.println(i + ")" + " Nombre " + aguatero.getNombreAguatero());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del aguatero : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Aguateros aguateroSeleccionado = aguateros.get(posicion);
        return aguateroSeleccionado;
    }

    public static Entrenadores mostrarEntrenadores(ArrayList<Entrenadores> entrenadores, Scanner in) {
        System.out.println("----- Lista de Entrenadores -----");
        for (int i = 0; i < entrenadores.size(); i++) {
            Entrenadores entrenador = entrenadores.get(i);
            System.out.println(i + ")" + " Nombre " + entrenador.getNombreEntrenador());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del entrenador : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Entrenadores entrenadorSeleccionado = entrenadores.get(posicion);
        return entrenadorSeleccionado;
    }

    public static Medicos mostrarMedicos(ArrayList<Medicos> medicos, Scanner in) {
        System.out.println("----- Lista de Medicos -----");
        for (int i = 0; i < medicos.size(); i++) {
            Medicos medico = medicos.get(i);
            System.out.println(i + ")" + " Nombre " + medico.getNombreMedico());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del medico : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Medicos medicoSeleccionado = medicos.get(posicion);
        return medicoSeleccionado;
    }

    public static Jefe_masajista mostrarJefesm(ArrayList<Jefe_masajista> jefesm, Scanner in) {
        System.out.println("----- Lista de Jefes de masajistas -----");
        for (int i = 0; i < jefesm.size(); i++) {
            Jefe_masajista jefem = jefesm.get(i);
            System.out.println(i + ")" + " Nombre " + jefem.getNombreJefeM());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del jefe : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Jefe_masajista jefemSeleccionado = jefesm.get(posicion);
        return jefemSeleccionado;
    }

    public static Masajista mostrarMasajistas(ArrayList<Masajista> masajistas, Scanner in) {
        System.out.println("----- Lista de Masajistas -----");
        for (int i = 0; i < masajistas.size(); i++) {
            Masajista masjista = masajistas.get(i);
            System.out.println(i + ")" + " Nombre " + masjista.getNombreMasajista());
            System.out.println("------------------------");
        }
        // Pedir la posición del jugador para la concentración
        System.out.print("Ingrese la posicion del masajista : ");
        int posicion = in.nextInt();
        // Obtener la instancia del jugador seleccionado
        Masajista masjistaSeleccionado = masajistas.get(posicion);
        return masjistaSeleccionado;
    }

    public static void Ingresopersona(Registrar m1, Scanner in, ArrayList<Futbolistas> futbolistas, ArrayList<Esposas> esposas, ArrayList<Aguateros> aguateros, ArrayList<Entrenadores> entrenadores, ArrayList<Medicos> medicos, ArrayList<Jefe_masajista> jefesm, ArrayList<Masajista> masajistas) {
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("Ingrese el tipo de persona:");
                System.out.println("1- Futbolista");
                System.out.println("2- Aguatero");
                System.out.println("3- Entrenador");
                System.out.println("4- Medico");
                System.out.println("5- Jefe masajista");
                System.out.println("6- Masajista");

                int tipoPersona = in.nextInt();

                switch (tipoPersona) {
                    case 1:

                        Futbolistas futbolista = m1.RegistrarFutbolista(in, futbolistas);
                        futbolistas.add(futbolista);
                        System.out.println("Insersion exitosa");

                        Esposas esposa = m1.RegistrarEsposa(in, esposas, futbolistas);
                        esposas.add(esposa);
                        System.out.println("Insersion exitosa");
                        break;

                    case 2:
                        Aguateros aguatero = m1.RegistrarAguatero(in, aguateros);
                        aguateros.add(aguatero);
                        System.out.println("Insersion exitosa");
                        break;

                    case 3:
                        Entrenadores entrenador = m1.RegistrarEntrenador(in, entrenadores);
                        entrenadores.add(entrenador);
                        System.out.println("Insersion exitosa");
                        break;

                    case 4:
                        Medicos medico = m1.RegistrarMedico(in, medicos);
                        medicos.add(medico);
                        System.out.println("Insersion exitosa");
                        break;

                    case 5:
                        Jefe_masajista jefem = m1.RegistrarJefeM(in, jefesm);
                        jefesm.add(jefem);
                        System.out.println("Insersion exitosa");
                        break;

                    case 6:
                        Masajista masajista = m1.RegistrarMasajista(in, masajistas);
                        masajistas.add(masajista);
                        System.out.println("Insersion exitosa");
                        break;

                    default:
                        System.out.println("Tipo de persona no valido");

                }

                System.out.println("Desea agregar otra persona? (Si: 1 , No:0)");
                int opcion = in.nextInt();
                continuar = (opcion == 1); //Asigna true si el valor es uno, caso contrario será false

            } catch (InputMismatchException e) {
                System.out.println("Tipo de persona inválido. Por favor, ingrese un número entero válido.");
                in.nextLine(); // Limpiar el buffer de entrada
            }

        }
    }
}
