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
public class MasajistaModel extends Jefe_masajistaModel {

    private long IdMasajista;
    private String NombreMasajista;
    private String ApellidoMasajista;
    private int EdadMasajista;
    private String TituloUniversitario;
    private int AñosDeExperiencia;

    Scanner in = new Scanner(System.in);

    public MasajistaModel() {
    }

    public MasajistaModel(long IdMasajista, String NombreMasajista, String ApellidoMasajista, int EdadMasajista, String TituloUniversitario, int AñosDeExperiencia) {
        this.IdMasajista = IdMasajista;
        this.NombreMasajista = NombreMasajista;
        this.ApellidoMasajista = ApellidoMasajista;
        this.EdadMasajista = EdadMasajista;
        this.TituloUniversitario = TituloUniversitario;
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    public MasajistaModel(long IdMasajista, String NombreMasajista, String ApellidoMasajista, int EdadMasajista, String TituloUniversitario, int AñosDeExperiencia, long IdJefe, String NombreJefeM, String ApellidoJefeM, int EdadJefeMAguatero, String Observaciones) {
        super(IdJefe, NombreJefeM, ApellidoJefeM, EdadJefeMAguatero, Observaciones);
        this.IdMasajista = IdMasajista;
        this.NombreMasajista = NombreMasajista;
        this.ApellidoMasajista = ApellidoMasajista;
        this.EdadMasajista = EdadMasajista;
        this.TituloUniversitario = TituloUniversitario;
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    public MasajistaModel(long IdMasajista, String NombreMasajista, String ApellidoMasajista, int EdadMasajista, String TituloUniversitario, int AñosDeExperiencia, long IdJefe, String NombreJefeM, String ApellidoJefeM, int EdadJefeMAguatero, String Observaciones, long Id, String Nombre, String Apellido, int Edad) {
        super(IdJefe, NombreJefeM, ApellidoJefeM, EdadJefeMAguatero, Observaciones, Id, Nombre, Apellido, Edad);
        this.IdMasajista = IdMasajista;
        this.NombreMasajista = NombreMasajista;
        this.ApellidoMasajista = ApellidoMasajista;
        this.EdadMasajista = EdadMasajista;
        this.TituloUniversitario = TituloUniversitario;
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    public long getIdMasajista() {
        return IdMasajista;
    }

    public void setIdMasajista(long IdMasajista) {
        this.IdMasajista = IdMasajista;
    }

    public String getNombreMasajista() {
        return NombreMasajista;
    }

    public void setNombreMasajista(String NombreMasajista) {
        this.NombreMasajista = NombreMasajista;
    }

    public String getApellidoMasajista() {
        return ApellidoMasajista;
    }

    public void setApellidoMasajista(String ApellidoMasajista) {
        this.ApellidoMasajista = ApellidoMasajista;
    }

    public int getEdadMasajista() {
        return EdadMasajista;
    }

    public void setEdadMasajista(int EdadMasajista) {
        this.EdadMasajista = EdadMasajista;
    }

    public String getTituloUniversitario() {
        return TituloUniversitario;
    }

    public void setTituloUniversitario(String TituloUniversitario) {
        this.TituloUniversitario = TituloUniversitario;
    }

    public int getAñosDeExperiencia() {
        return AñosDeExperiencia;
    }

    public void setAñosDeExperiencia(int AñosDeExperiencia) {
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    @Override
    public void Viajar() {
        String nom = this.getNombreMasajista();
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

    @Override
    public void Concentracion() {
        System.out.println("El masajista está en la concentración.");
        System.out.println("Realiza los masajes de acuerdo a las indicaciones recibidas.");
        System.out.println("Se asegura de brindar un servicio de calidad a los deportistas.");
    }

}
