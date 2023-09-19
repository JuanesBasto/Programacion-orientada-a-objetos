package parcial_herencia.registros;

import java.util.ArrayList;
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
public class Validaciones {

    // Validar jugador duplicado por ID
    public boolean validarJugadorDuplicado(ArrayList<Futbolistas> futbolistas, long id) {
        for (Futbolistas futbolista : futbolistas) {
            if (futbolista.getIdFutbolista() == id) {
                return true; // El jugador ya existe en la lista
            }
        }
        return false; // El jugador no existe en la lista
    }

    // Validar número de dorsal repetido
    public boolean validarDorsalRepetido(ArrayList<Futbolistas> futbolistas, int dorsal) {
        for (Futbolistas futbolista : futbolistas) {
            if (futbolista.getNumeroCamisa() == dorsal) {
                return true; // El número de dorsal ya está en uso
            }
        }
        return false; // El número de dorsal no está en uso
    }

    // Validar jugador duplicado por ID
    public boolean validarEsposaDuplicado(ArrayList<Esposas> esposas, long id) {
        for (Esposas esposa : esposas) {
            if (esposa.getIdEsposa() == id) {
                return true; // La esposa ya está en la lista
            }
        }
        return false; // La esposa no está en la lista
    }

    //validar que no se repitan las esposas
    public int LigarDorsal(ArrayList<Futbolistas> futbolistas) {
        Futbolistas ultimoFutbolista = futbolistas.get(futbolistas.size() - 1);
        int ultimodorsal = ultimoFutbolista.getNumeroCamisa();
        return ultimodorsal;
    }

    public String LigarEsposo(ArrayList<Futbolistas> futbolistas) {
        Futbolistas ultimoFutbolista = futbolistas.get(futbolistas.size() - 1);
        String ultimoFutbolistaAgg = ultimoFutbolista.getNombreFutbolista();
        return ultimoFutbolistaAgg;
    }

    public boolean validarAguateroDuplicado(ArrayList<Aguateros> aguateros, long id) {
        for (Aguateros aguatero : aguateros) {
            if (aguatero.getIdAguatero() == id) {
                return true; //El aguatero ya está ingresado
            }
        }
        return false;

    }

    public boolean validarChalecoRepetido(ArrayList<Aguateros> aguateros, int NumeroChaleco) {
        for (Aguateros aguatero : aguateros) {
            if (aguatero.getNumeroChaleco() == NumeroChaleco) {
                return true; // El número de chaleco ya está en uso
            }
        }
        return false; // El número de chaleco no está en uso
    }

    public boolean validarEntrenadorDuplicado(ArrayList<Entrenadores> entrenadores, long id) {
        for (Entrenadores entrenador : entrenadores) {
            if (entrenador.getIdEntrenador() == id) {
                return true; //El entrenador ya está ingresado
            }
        }
        return false;

    }

    public boolean validarEntrenadorCedulaDuplicado(ArrayList<Entrenadores> entrenadores, long CedulaDondeViene) {
        for (Entrenadores entrenador : entrenadores) {
            if (entrenador.getCedulaDondeViene() == CedulaDondeViene) {
                return true; //La cedula ya está en uso
            }
        }
        return false;

    }

    public boolean validarEntrenadorFederacionDuplicado(ArrayList<Entrenadores> entrenadores, long NumeroInternoFederacionFutbol) {
        for (Entrenadores entrenador : entrenadores) {
            if (entrenador.getNumeroInternoFederacionFutbol() == NumeroInternoFederacionFutbol) {
                return true; //La cedula ya está en uso
            }
        }
        return false;

    }

    public boolean validarMedicoDuplicado(ArrayList<Medicos> medicos, long id) {
        for (Medicos medico : medicos) {
            if (medico.getIdMedico() == id) {
                return true; //El medico ya está ingresado
            }
        }
        return false;

    }

    public boolean validarJefeDuplicado(ArrayList<Jefe_masajista> jefesm, long id) {
        for (Jefe_masajista jefem : jefesm) {
            if (jefem.getIdJefe() == id) {
                return true; //El jefe ya está ingresado
            }
        }
        return false;

    }

    public boolean validarMasajistaDuplicado(ArrayList<Masajista> masajistas, long id) {
        for (Masajista masajista : masajistas) {
            if (masajista.getIdMasajista() == id) {
                return true; //El jefe ya está ingresado
            }
        }
        return false;

    }
    
    public boolean validarEdades( int edad){
        return edad >=18 && edad <100;
    }

}
