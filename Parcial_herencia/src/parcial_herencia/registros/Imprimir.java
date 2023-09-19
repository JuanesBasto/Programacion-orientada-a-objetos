/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Imprimir {

    public void Imprimir(ArrayList<Futbolistas> futbolistas, ArrayList<Esposas> esposas, ArrayList<Aguateros> aguateros, ArrayList<Entrenadores> entrenadores, ArrayList<Medicos> medicos, ArrayList<Jefe_masajista> jefesm, ArrayList<Masajista> masajistas) {
        // Imprimir futbolistas 
        System.out.println("----- Futbolistas -----");
        for (Futbolistas futbolista : futbolistas) {
            System.out.println("ID: " + futbolista.getIdFutbolista());
            System.out.println("Nombre: " + futbolista.getNombreFutbolista());
            System.out.println("Apellido: " + futbolista.getApellidoFutbolista());
            System.out.println("Edad: " + futbolista.getEdadFutbolista());
            System.out.println("Numero camisa: " + futbolista.getNumeroCamisa());
            System.out.println("Posicion: " + futbolista.getPuestoEnElCampo());
            System.out.println("------------------------");
        }

        // Imprimir esposas
        System.out.println("----- Esposas -----");
        for (Esposas esposa : esposas) {
            System.out.println("ID: " + esposa.getIdEsposa());
            System.out.println("Nombre: " + esposa.getNombreEsposa());
            System.out.println("Apellido: " + esposa.getApellidoEsposa());
            System.out.println("Edad: " + esposa.getEdadEsposa());
            System.out.println("Esposo: " + esposa.getNombreEsposo());
            System.out.println("Dorsal esposo: " +esposa.getDorsalLigado());
            System.out.println("-------------------");
        }

        // Imprimir aguateros
        System.out.println("----- Aguateros -----");
        for (Aguateros aguatero : aguateros) {
            System.out.println("ID: " + aguatero.getId());
            System.out.println("Nombre: " + aguatero.getNombreAguatero());
            System.out.println("Apellido: " + aguatero.getApellidoAguatero());
            System.out.println("Edad: " + aguatero.getEdadAguatero());
            System.out.println("Numero en el chaleco " + aguatero.getNumeroChaleco());
            System.out.println("---------------------");
        }

        // Imprimir entrenadores
        System.out.println("----- Entrenadores -----");
        for (Entrenadores entrenador : entrenadores) {
            System.out.println("ID: " + entrenador.getIdEntrenador());
            System.out.println("Nombre: " + entrenador.getNombreEntrenador());
            System.out.println("Apellido: " + entrenador.getApellidoEntrenador());
            System.out.println("Edad: " + entrenador.getEdadEntrenador());
            System.out.println("Cedula donde viene: " + entrenador.getCedulaDondeViene());
            System.out.println("Numero de la federacion: " + entrenador.getNumeroInternoFederacionFutbol());
            System.out.println("-----------------------");
        }

        // Imprimir medicos
        System.out.println("----- Medicos -----");
        for (Medicos medico : medicos) {
            System.out.println("ID: " + medico.getIdMedico());
            System.out.println("Nombre: " + medico.getNombreMedico());
            System.out.println("Apellido: " + medico.getApellidoMedico());
            System.out.println("Edad: " + medico.getEdadMedico());
            System.out.println("Fecha de atencion: " + medico.getFechaAtencion());
            System.out.println("Hora de atencion: " + medico.getHoraAtencion());
            System.out.println("-----------------------");
        }

        // Imprimir Jefes de masajista
        System.out.println("----- Jefes de masajista -----");
        for (Jefe_masajista jefem : jefesm) {
            System.out.println("ID: " + jefem.getIdJefe());
            System.out.println("Nombre: " + jefem.getNombreJefeM());
            System.out.println("Apellido: " + jefem.getApellidoJefeM());
            System.out.println("Edad: " + jefem.getEdadJefeMAguatero());
            System.out.println("Observaciones: " + jefem.getObservaciones());
            System.out.println("-----------------------");
        }

        // Imprimir Masajistas
        System.out.println("-----Masajista -----");
        for (Masajista masajista : masajistas) {
            System.out.println("ID: " + masajista.getIdMasajista());
            System.out.println("Nombre: " + masajista.getNombreMasajista());
            System.out.println("Apellido: " + masajista.getApellidoMasajista());
            System.out.println("Edad: " + masajista.getEdadMasajista());
            System.out.println("Titulo universitario: " + masajista.getTituloUniversitario());
            System.out.println("Años de experiencia: " + masajista.getAñosDeExperiencia());
            System.out.println("-----------------------");
        }

    }
}
