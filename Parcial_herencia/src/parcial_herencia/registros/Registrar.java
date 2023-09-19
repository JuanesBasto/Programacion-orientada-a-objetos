package parcial_herencia.registros;

import java.util.ArrayList;
import java.util.Scanner;
import parcial_herencia.Aguateros;
import parcial_herencia.Entrenadores;
import parcial_herencia.Esposas;
import parcial_herencia.Futbolistas;
import parcial_herencia.Jefe_masajista;
import parcial_herencia.Masajista;
import parcial_herencia.Medicos;

/**
 *
 * @author basto
 */
public class Registrar {

    Validaciones m3 = new Validaciones();
    boolean val;

    public Futbolistas RegistrarFutbolista(Scanner in, ArrayList<Futbolistas> futbolistas) {
        long IdFutbolista = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID del jugador: ");
            IdFutbolista = in.nextInt();

            //validar que el id no esté repetido
            if (m3.validarJugadorDuplicado(futbolistas, IdFutbolista)) {
                System.out.println("El jugador ya está registrado, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del jugador: ");
        String NombreFutbolista = in.nextLine();

        System.out.println("Ingrese el apellido del jugador: ");
        String ApellidoFutbolista = in.nextLine();

        System.out.println("Ingrese la edad del jugador: ");
        int EdadFutbolista = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadFutbolista);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad del jugador: ");
            EdadFutbolista =in.nextInt();
            valEdad = m3.validarEdades(EdadFutbolista);

        }
        
        int NumeroCamisa = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el dorsal del jugador:");
            NumeroCamisa = in.nextInt();

            //validar que el dorsal no se repita
            if (m3.validarDorsalRepetido(futbolistas, NumeroCamisa)) {
                System.out.println("El dorsal ya está en uso. No se puede ingresar.");
                val = false;
            } else {
                val = true;
            }
        }

        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el puesto en el campo: ");
        String PuestoEnElCampo = in.nextLine();
        in.nextLine(); // Limpiar el buffer de entrada

        return new Futbolistas(IdFutbolista, NombreFutbolista, ApellidoFutbolista, EdadFutbolista, NumeroCamisa, PuestoEnElCampo);
    }

    public Esposas RegistrarEsposa(Scanner in, ArrayList<Esposas> esposas, ArrayList<Futbolistas> futbolistas) {
        long IdEsposa = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID de la esposa: ");
            IdEsposa = in.nextInt();

            //validar que el id no esté repetido
            if (m3.validarEsposaDuplicado(esposas, IdEsposa)) {
                System.out.println("La esposa ya está registrada, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre de la esposa: ");
        String NombreEsposa = in.nextLine();

        System.out.println("Ingrese el apellido de la esposa: ");
        String ApellidoEsposa = in.nextLine();

        System.out.println("Ingrese la edad: ");
        int EdadEsposa = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadEsposa);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadEsposa =in.nextInt();
            valEdad = m3.validarEdades(EdadEsposa);

        }
        
        int DorsalLigado = m3.LigarDorsal(futbolistas);

        String NombreEsposo = m3.LigarEsposo(futbolistas);

        in.nextLine(); // Limpiar el buffer de entrada

        return new Esposas(IdEsposa, NombreEsposa, ApellidoEsposa, EdadEsposa, DorsalLigado, NombreEsposo);
    }

    public Aguateros RegistrarAguatero(Scanner in, ArrayList<Aguateros> aguateros) {
        long IdAguatero = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID del aguatero: ");
            IdAguatero = in.nextInt();

            if (m3.validarAguateroDuplicado(aguateros, IdAguatero)) {
                System.out.println("Id ya registrado No se puede ingresar");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del aguatero: ");
        String NombreAguatero = in.nextLine();

        System.out.println("Ingrese el apellido del aguatero: ");
        String ApellidoAguatero = in.nextLine();

        System.out.println("Ingrese la edad: ");
        int EdadAguatero = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadAguatero);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadAguatero =in.nextInt();
            valEdad = m3.validarEdades(EdadAguatero);

        }
        
        int NumeroChaleco = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el numero del chaleco: ");
            NumeroChaleco = in.nextInt();

            //validar que el dorsal no se repita
            if (m3.validarChalecoRepetido(aguateros, NumeroChaleco)) {
                System.out.println("El dorsal ya está en uso. No se puede ingresar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        return new Aguateros(IdAguatero, NombreAguatero, ApellidoAguatero, EdadAguatero, NumeroChaleco);
    }

    public Entrenadores RegistrarEntrenador(Scanner in, ArrayList<Entrenadores> entrenadores) {
        long IdEntrenador = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID del entrenador: ");
            IdEntrenador = in.nextInt();

            // Validar que el ID no esté repetido
            if (m3.validarEntrenadorDuplicado(entrenadores, IdEntrenador)) {
                System.out.println("El ID del entrenador ya está registrado, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del entrenador: ");
        String NombreEntrenador = in.nextLine();

        System.out.println("Ingrese el apellido del entrenador: ");
        String ApellidoEntrenador = in.nextLine();


        System.out.println("Ingrese la edad: ");
        int EdadEntrenador = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadEntrenador);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadEntrenador =in.nextInt();
            valEdad = m3.validarEdades(EdadEntrenador);

        }

        long CedulaDondeViene = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese la cedula de donde viene: ");
            CedulaDondeViene = in.nextLong();

            // Validar que el ID no esté repetido
            if (m3.validarEntrenadorCedulaDuplicado(entrenadores, CedulaDondeViene)) {
                System.out.println("La cedula ya está en uso, no se puede ingrear");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); //limpiar buffer de entrada

        long NumeroInternoFederacionFutbol = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese la cedula de donde viene: ");
            NumeroInternoFederacionFutbol = in.nextLong();

            // Validar que el ID no esté repetido
            if (m3.validarEntrenadorFederacionDuplicado(entrenadores, NumeroInternoFederacionFutbol)) {
                System.out.println("El numero interno de la federacion ya está en uso, no se puede ingrear");
                val = false;
            } else {
                val = true;
            }
        }

        in.nextLine(); // Limpiar el buffer de entrada

        return new Entrenadores(IdEntrenador, NombreEntrenador, ApellidoEntrenador, EdadEntrenador, CedulaDondeViene, NumeroInternoFederacionFutbol);
    }

    public Medicos RegistrarMedico(Scanner in, ArrayList<Medicos> medicos) {
        long IdMedico = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID del médico: ");
            IdMedico = in.nextLong();

            // Validar que el ID no esté repetido
            if (m3.validarMedicoDuplicado(medicos, IdMedico)) {
                System.out.println("El ID del médico ya está registrado, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del médico: ");
        String NombreMedico = in.nextLine();

        System.out.println("Ingrese el apellido del médico: ");
        String ApellidoMedico = in.nextLine();

        System.out.println("Ingrese la edad: ");
        int EdadMedico = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadMedico);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadMedico =in.nextInt();
            valEdad = m3.validarEdades(EdadMedico);

        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese la fecha de atención del médico: (FORMATO DD/MM/YYYY) ");
        String FechaAtencion = in.nextLine();

        System.out.println("Ingrese la hora de atención del médico: (sistema horario de 24 horas)");
        String HoraAtencion = in.nextLine();

        return new Medicos(IdMedico, NombreMedico, ApellidoMedico, EdadMedico, FechaAtencion, HoraAtencion);

    }

    public Jefe_masajista RegistrarJefeM(Scanner in, ArrayList<Jefe_masajista> jefesm) {
        long IdJefe = 0;
        val = false;
        while (val == false) {
            System.out.println("Ingrese el ID del Jefe: ");
            IdJefe = in.nextInt();

            // Validar que el ID no esté repetido
            if (m3.validarJefeDuplicado(jefesm, IdJefe)) {
                System.out.println("El ID del jefe ya está registrado, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        System.out.println("Ingrese el ID del Jefe: ");
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del Jefe: ");
        String NombreJefeM = in.nextLine();

        System.out.println("Ingrese el apellido del Jefe: ");
        String ApellidoJefeM = in.nextLine();

        System.out.println("Ingrese la edad: ");
        int EdadJefeMAguatero = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadJefeMAguatero);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadJefeMAguatero =in.nextInt();
            valEdad = m3.validarEdades(EdadJefeMAguatero);

        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese las observaciones: ");
        String Observaciones = in.nextLine();

        in.nextLine(); // Limpiar el buffer de entrada

        return new Jefe_masajista(IdJefe, NombreJefeM, ApellidoJefeM, EdadJefeMAguatero, Observaciones);
    }

    public Masajista RegistrarMasajista(Scanner in, ArrayList<Masajista> masajistas) {
        val = false;
        long IdMasajista = 0;
        while (val == false) {
            System.out.println("Ingrese el ID del masajista: ");
            IdMasajista = in.nextInt();

            // Validar que el ID no esté repetido
            if (m3.validarMasajistaDuplicado(masajistas, IdMasajista)) {
                System.out.println("El ID del masajista ya está registrado, no se puede agregar.");
                val = false;
            } else {
                val = true;
            }
        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del masajista: ");
        String NombreMasajista = in.nextLine();

        System.out.println("Ingrese el apellido del masajista: ");
        String ApellidoMasajista = in.nextLine();

        System.out.println("Ingrese la edad: ");
        int EdadMasajista = in.nextInt();
        boolean valEdad = false;
        valEdad = m3.validarEdades(EdadMasajista);
        while (valEdad == false) {
            System.out.println("Datos de edad incorrectos");
            System.out.println("Ingrese la edad : ");
            EdadMasajista =in.nextInt();
            valEdad = m3.validarEdades(EdadMasajista);

        }
        in.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese que titulo universitario tiene: ");
        String TituloUniversitario = in.nextLine();

        System.out.println("Cuantos años de experiencia tiene: ");
        int AñosDeExperiencia = in.nextInt();

        in.nextLine(); // Limpiar el buffer de entrada
        return new Masajista(IdMasajista, NombreMasajista, ApellidoMasajista, EdadMasajista, TituloUniversitario, AñosDeExperiencia);
    }
}
