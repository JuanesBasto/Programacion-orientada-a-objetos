/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class AguaterosModel extends Campo_entrenamientoModel {

    private long IdAguatero;
    private String NombreAguatero;
    private String ApellidoAguatero;
    private int EdadAguatero;
    private int NumeroChaleco;

    Scanner in = new Scanner(System.in);

    public AguaterosModel() {
    }

    public AguaterosModel(long IdAguatero, String NombreAguatero, String ApellidoAguatero, int EdadAguatero, int NumeroChaleco) {
        this.IdAguatero = IdAguatero;
        this.NombreAguatero = NombreAguatero;
        this.ApellidoAguatero = ApellidoAguatero;
        this.EdadAguatero = EdadAguatero;
        this.NumeroChaleco = NumeroChaleco;
    }

    public AguaterosModel(long IdAguatero, String NombreAguatero, String ApellidoAguatero, int EdadAguatero, int NumeroChaleco, long Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.IdAguatero = IdAguatero;
        this.NombreAguatero = NombreAguatero;
        this.ApellidoAguatero = ApellidoAguatero;
        this.EdadAguatero = EdadAguatero;
        this.NumeroChaleco = NumeroChaleco;
    }

    public long getIdAguatero() {
        return IdAguatero;
    }

    public void setIdAguatero(long IdAguatero) {
        this.IdAguatero = IdAguatero;
    }

    public String getNombreAguatero() {
        return NombreAguatero;
    }

    public void setNombreAguatero(String NombreAguatero) {
        this.NombreAguatero = NombreAguatero;
    }

    public String getApellidoAguatero() {
        return ApellidoAguatero;
    }

    public void setApellidoAguatero(String ApellidoAguatero) {
        this.ApellidoAguatero = ApellidoAguatero;
    }

    public int getEdadAguatero() {
        return EdadAguatero;
    }

    public void setEdadAguatero(int EdadAguatero) {
        this.EdadAguatero = EdadAguatero;
    }

    public int getNumeroChaleco() {
        return NumeroChaleco;
    }

    public void setNumeroChaleco(int NumeroChaleco) {
        this.NumeroChaleco = NumeroChaleco;
    }

    @Override
    public void Concentracion() {
        System.out.println("El aguatero está en modo de concentración");
        System.out.println("Revisando y preparando las botellas de agua y bebidas isotónicas...");
        System.out.println("Preparando el área de hidratación con los suministros necesarios...");
        System.out.println("Consultando los requerimientos de hidratación de cada jugador...");
        System.out.println("El aguatero ha completado su concentración");
        System.out.println("___________________________________________");

    }

    @Override
    public void Viajar() {
        String nom = this.getNombreAguatero();
        System.out.println("A que destino va a viajar?");
        String dest = in.nextLine();
        System.out.println("Viajando con destino a " + dest);
        System.out.println("...");
        System.out.println("En que hotel se va a alojar?");
        String hotel = in.nextLine();
        System.out.println("Llegando al hotel " + hotel);
        System.out.println("Que disfrute su estancia en " + dest + " sr " + nom);
        System.out.println("___________________________________________");
    }

    public void ServirAgua(ArrayList<FutbolistaModel> futbolistas) {
        for (FutbolistaModel futbolista : futbolistas) {
            System.out.println("Sirviendo agua a " + futbolista.getNombreFutbolista());
        }
        System.out.println("___________________________________________");

    }
}
