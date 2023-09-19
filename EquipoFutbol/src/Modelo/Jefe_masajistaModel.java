/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Jefe_masajistaModel extends Campo_entrenamientoModel {

    private long IdJefe;
    private String NombreJefeM;
    private String ApellidoJefeM;
    private int EdadJefeMAguatero;
    private String Observaciones;

    Scanner in = new Scanner(System.in);

    public Jefe_masajistaModel() {
    }

    public Jefe_masajistaModel(long IdJefe, String NombreJefeM, String ApellidoJefeM, int EdadJefeMAguatero, String Observaciones) {
        this.IdJefe = IdJefe;
        this.NombreJefeM = NombreJefeM;
        this.ApellidoJefeM = ApellidoJefeM;
        this.EdadJefeMAguatero = EdadJefeMAguatero;
        this.Observaciones = Observaciones;
    }

    public Jefe_masajistaModel(long IdJefe, String NombreJefeM, String ApellidoJefeM, int EdadJefeMAguatero, String Observaciones, long Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.IdJefe = IdJefe;
        this.NombreJefeM = NombreJefeM;
        this.ApellidoJefeM = ApellidoJefeM;
        this.EdadJefeMAguatero = EdadJefeMAguatero;
        this.Observaciones = Observaciones;
    }

    public long getIdJefe() {
        return IdJefe;
    }

    public void setIdJefe(long IdJefe) {
        this.IdJefe = IdJefe;
    }

    public String getNombreJefeM() {
        return NombreJefeM;
    }

    public void setNombreJefeM(String NombreJefeM) {
        this.NombreJefeM = NombreJefeM;
    }

    public String getApellidoJefeM() {
        return ApellidoJefeM;
    }

    public void setApellidoJefeM(String ApellidoJefeM) {
        this.ApellidoJefeM = ApellidoJefeM;
    }

    public int getEdadJefeMAguatero() {
        return EdadJefeMAguatero;
    }

    public void setEdadJefeMAguatero(int EdadJefeMAguatero) {
        this.EdadJefeMAguatero = EdadJefeMAguatero;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public void Concentracion() {
        System.out.println("El jefe de masajistas está en la concentración.");
        System.out.println("Coordina y supervisa el trabajo de los masajistas.");
        System.out.println("Brinda indicaciones y se asegura de que todo funcione correctamente.");
    }

    @Override
    public void Viajar() {
        String nom = this.getNombreJefeM();
        System.out.println("A qué destino va a viajar?");
        String dest = in.nextLine();
        System.out.println("Viajando con destino a " + dest);
        System.out.println("...");
        System.out.println("En qué hotel se va a alojar?");
        String hotel = in.nextLine();
        System.out.println("Llegando al hotel " + hotel);
        System.out.println("Que disfrute su estancia en " + dest + " señora " + nom);
        System.out.println("___________________________________________");
    }
}
