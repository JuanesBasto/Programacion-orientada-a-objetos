/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class EntrenadoresModel extends Campo_entrenamientoModel {

    private long IdEntrenador;
    private String NombreEntrenador;
    private String ApellidoEntrenador;
    private int EdadEntrenador;
    private long CedulaDondeViene;
    private long NumeroInternoFederacionFutbol;

    Scanner in = new Scanner(System.in);

    public EntrenadoresModel() {
        super();
    }

    public EntrenadoresModel(long IdEntrenador, String NombreEntrenador, String ApellidoEntrenador, int EdadEntrenador, long CedulaDondeViene, long NumeroInternoFederacionFutbol) {
        this.IdEntrenador = IdEntrenador;
        this.NombreEntrenador = NombreEntrenador;
        this.ApellidoEntrenador = ApellidoEntrenador;
        this.EdadEntrenador = EdadEntrenador;
        this.CedulaDondeViene = CedulaDondeViene;
        this.NumeroInternoFederacionFutbol = NumeroInternoFederacionFutbol;
    }

    public EntrenadoresModel(long IdEntrenador, String NombreEntrenador, String ApellidoEntrenador, int EdadEntrenador, long CedulaDondeViene, long NumeroInternoFederacionFutbol, long Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.IdEntrenador = IdEntrenador;
        this.NombreEntrenador = NombreEntrenador;
        this.ApellidoEntrenador = ApellidoEntrenador;
        this.EdadEntrenador = EdadEntrenador;
        this.CedulaDondeViene = CedulaDondeViene;
        this.NumeroInternoFederacionFutbol = NumeroInternoFederacionFutbol;
    }

    public long getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(long IdEntrenador) {
        this.IdEntrenador = IdEntrenador;
    }

    public String getNombreEntrenador() {
        return NombreEntrenador;
    }

    public void setNombreEntrenador(String NombreEntrenador) {
        this.NombreEntrenador = NombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return ApellidoEntrenador;
    }

    public void setApellidoEntrenador(String ApellidoEntrenador) {
        this.ApellidoEntrenador = ApellidoEntrenador;
    }

    public int getEdadEntrenador() {
        return EdadEntrenador;
    }

    public void setEdadEntrenador(int EdadEntrenador) {
        this.EdadEntrenador = EdadEntrenador;
    }

    public long getCedulaDondeViene() {
        return CedulaDondeViene;
    }

    public void setCedulaDondeViene(long CedulaDondeViene) {
        this.CedulaDondeViene = CedulaDondeViene;
    }

    public long getNumeroInternoFederacionFutbol() {
        return NumeroInternoFederacionFutbol;
    }

    public void setNumeroInternoFederacionFutbol(long NumeroInternoFederacionFutbol) {
        this.NumeroInternoFederacionFutbol = NumeroInternoFederacionFutbol;
    }

    @Override
    public void Concentracion() {
        System.out.println("Realizando concentración y preparación antes del partido");
        System.out.println("Visualizando tácticas y estrategias");
        System.out.println("Analizando al equipo rival");
        System.out.println("Motivando al equipo");
        System.out.println("Planificando estrategias de juego");
        System.out.println("Preparación y concentración completadas");
        System.out.println("___________________________________________");

    }

    @Override
    public void Viajar() {
        String nom = this.getNombreEntrenador();
        System.out.println("A qué destino va a viajar?");
        String dest = in.nextLine();
        System.out.println("Viajando con destino a " + dest);
        System.out.println("...");
        System.out.println("En qué hotel se va a alojar?");
        String hotel = in.nextLine();
        System.out.println("Llegando al hotel " + hotel);
        System.out.println("Que disfrute su estancia en " + dest + " señora " + nom);
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
    }

    public void SeguirPartido() {
        System.out.println("Contra que esquipo se van a enfrentar: ");
        String rival = in.nextLine();
        String equipo = super.getNombre();
        System.out.println("Comienzo  del partido ");
        System.out.println("Observando el desempeño de los jugadores");
        System.out.println("Dando instrucciones y ajustando la táctica del equipo");
        System.out.println("Motivando al equipo y manteniendo la concentración");
        Random random = new Random();
        int rivalrandom = random.nextInt(0, 6);
        int equiporandom = random.nextInt(0, 6);
        if (equiporandom > rivalrandom) {
            System.out.println("Felicitar al equipo por ganar");
        } else {
            System.out.println("Reuniendo al equipo para ofrecer retroalimentación");
            System.out.println("Identificando áreas de mejora");
            System.out.println("Brindando motivación para futuros partidos");
            System.out.println("...");
            System.out.println("Manteniendo una actitud positiva y motivadora para superar la derrota");
        }
        System.out.println("___________________________________________");

    }

    public void SeguirEntrenamiento() {
        System.out.println("Preparando el entrenamiento del equipo");
        System.out.println("Estableciendo objetivos y metas para el entrenamiento");
        System.out.println("...");
        System.out.println("Diseñando y planificando las actividades y ejercicios");
        System.out.println("...");
        System.out.println("Dirigiendo y supervisando el desarrollo del entrenamiento");
        System.out.println("Brindando instrucciones y correcciones técnicas a los jugadores");
        System.out.println("Fomentando la comunicación y la cohesión del equipo durante el entrenamiento");
        System.out.println("Realizando ejercicios tácticos y estratégicos");
        System.out.println("Observando el desempeño individual y colectivo de los jugadores");
        System.out.println("...");
        System.out.println("Brindando retroalimentación y evaluación a los jugadores");
        System.out.println("Motivando y manteniendo la concentración del equipo durante el entrenamiento");
        System.out.println("Evaluando el rendimiento del entrenamiento y realizando ajustes si es necesario");
        System.out.println("...");
        System.out.println("___________________________________________");
    }

}
