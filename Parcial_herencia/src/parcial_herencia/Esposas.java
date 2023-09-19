/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Esposas extends Futbolistas {

    private long IdEsposa;
    private String NombreEsposa;
    private String ApellidoEsposa;
    private int EdadEsposa;
    private int DorsalLigado;
    private String NombreEsposo;

    Scanner in = new Scanner(System.in);

    public Esposas() {
    }

    public Esposas(long IdEsposa, String NombreEsposa, String ApellidoEsposa, int EdadEsposa, int DorsalLigado, String NombreEsposo) {
        this.IdEsposa = IdEsposa;
        this.NombreEsposa = NombreEsposa;
        this.ApellidoEsposa = ApellidoEsposa;
        this.EdadEsposa = EdadEsposa;
        this.DorsalLigado = DorsalLigado;
        this.NombreEsposo = NombreEsposo;
    }

    public Esposas(long IdEsposa, String NombreEsposa, String ApellidoEsposa, int EdadEsposa, int DorsalLigado, String NombreEsposo, long IdFutbolista, String NombreFutbolista, String ApellidoFutbolista, int EdadFutbolista, int NumeroCamisa, String PuestoEnElCampo) {
        super(IdFutbolista, NombreFutbolista, ApellidoFutbolista, EdadFutbolista, NumeroCamisa, PuestoEnElCampo);
        this.IdEsposa = IdEsposa;
        this.NombreEsposa = NombreEsposa;
        this.ApellidoEsposa = ApellidoEsposa;
        this.EdadEsposa = EdadEsposa;
        this.DorsalLigado = DorsalLigado;
        this.NombreEsposo = NombreEsposo;
    }

    public Esposas(long IdEsposa, String NombreEsposa, String ApellidoEsposa, int EdadEsposa, int DorsalLigado, String NombreEsposo, long IdFutbolista, String NombreFutbolista, String ApellidoFutbolista, int EdadFutbolista, int NumeroCamisa, String PuestoEnElCampo, long Id, String Nombre, String Apellido, int Edad) {
        super(IdFutbolista, NombreFutbolista, ApellidoFutbolista, EdadFutbolista, NumeroCamisa, PuestoEnElCampo, Id, Nombre, Apellido, Edad);
        this.IdEsposa = IdEsposa;
        this.NombreEsposa = NombreEsposa;
        this.ApellidoEsposa = ApellidoEsposa;
        this.EdadEsposa = EdadEsposa;
        this.DorsalLigado = DorsalLigado;
        this.NombreEsposo = NombreEsposo;
    }

    public long getIdEsposa() {
        return IdEsposa;
    }

    public void setIdEsposa(long IdEsposa) {
        this.IdEsposa = IdEsposa;
    }

    public String getNombreEsposa() {
        return NombreEsposa;
    }

    public void setNombreEsposa(String NombreEsposa) {
        this.NombreEsposa = NombreEsposa;
    }

    public String getApellidoEsposa() {
        return ApellidoEsposa;
    }

    public void setApellidoEsposa(String ApellidoEsposa) {
        this.ApellidoEsposa = ApellidoEsposa;
    }

    public int getEdadEsposa() {
        return EdadEsposa;
    }

    public void setEdadEsposa(int EdadEsposa) {
        this.EdadEsposa = EdadEsposa;
    }

    public int getDorsalLigado() {
        return DorsalLigado;
    }

    public void setDorsalLigado(int DorsalLigado) {
        this.DorsalLigado = DorsalLigado;
    }

    public String getNombreEsposo() {
        return NombreEsposo;
    }

    public void setNombreEsposo(String NombreEsposo) {
        this.NombreEsposo = NombreEsposo;
    }

    @Override
    public void Viajar() {
        String nomEsposa = this.getNombreEsposa();
        System.out.println("A qué destino va a viajar?");
        String dest = in.nextLine();
        System.out.println("Viajando con destino a " + dest);
        System.out.println("...");
        System.out.println("En qué hotel se va a alojar?");
        String hotel = in.nextLine();
        System.out.println("Llegando al hotel " + hotel);
        System.out.println("Que disfrute su estancia en " + dest + " señora " + nomEsposa);
        System.out.println("___________________________________________");
    }

    @Override
    public void Concentracion() {
        System.out.println("La esposa está en modo de concentración");
        System.out.println("Realizando ejercicios de relajación...");
        System.out.println("Visualizando el partido y apoyando a su esposo...");
        System.out.println("Realizando técnicas de respiración para mantener la calma...");
        System.out.println("La esposa ha completado su concentración");
        System.out.println("___________________________________________");

    }

}
