package Modelo;

import java.util.Scanner;
import java.util.Random;

public class FutbolistaModel extends Campo_entrenamientoModel {

    private long IdFutbolista;
    private String NombreFutbolista;
    private String ApellidoFutbolista;
    private int EdadFutbolista;
    private int NumeroCamisa;
    private String PuestoEnElCampo;

    Scanner in = new Scanner(System.in);

    public FutbolistaModel() {
    }

    public FutbolistaModel(long IdFutbolista, String NombreFutbolista, String ApellidoFutbolista, int EdadFutbolista, int NumeroCamisa, String PuestoEnElCampo) {
        this.IdFutbolista = IdFutbolista;
        this.NombreFutbolista = NombreFutbolista;
        this.ApellidoFutbolista = ApellidoFutbolista;
        this.EdadFutbolista = EdadFutbolista;
        this.NumeroCamisa = NumeroCamisa;
        this.PuestoEnElCampo = PuestoEnElCampo;
    }

    public FutbolistaModel(long IdFutbolista, String NombreFutbolista, String ApellidoFutbolista, int EdadFutbolista, int NumeroCamisa, String PuestoEnElCampo, long Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.IdFutbolista = IdFutbolista;
        this.NombreFutbolista = NombreFutbolista;
        this.ApellidoFutbolista = ApellidoFutbolista;
        this.EdadFutbolista = EdadFutbolista;
        this.NumeroCamisa = NumeroCamisa;
        this.PuestoEnElCampo = PuestoEnElCampo;
    }

    public long getIdFutbolista() {
        return IdFutbolista;
    }

    public void setIdFutbolista(long IdFutbolista) {
        this.IdFutbolista = IdFutbolista;
    }

    public String getNombreFutbolista() {
        return NombreFutbolista;
    }

    public void setNombreFutbolista(String NombreFutbolista) {
        this.NombreFutbolista = NombreFutbolista;
    }

    public String getApellidoFutbolista() {
        return ApellidoFutbolista;
    }

    public void setApellidoFutbolista(String ApellidoFutbolista) {
        this.ApellidoFutbolista = ApellidoFutbolista;
    }

    public int getEdadFutbolista() {
        return EdadFutbolista;
    }

    public void setEdadFutbolista(int EdadFutbolista) {
        this.EdadFutbolista = EdadFutbolista;
    }

    public int getNumeroCamisa() {
        return NumeroCamisa;
    }

    public void setNumeroCamisa(int NumeroCamisa) {
        this.NumeroCamisa = NumeroCamisa;
    }

    public String getPuestoEnElCampo() {
        return PuestoEnElCampo;
    }

    public void setPuestoEnElCampo(String PuestoEnElCampo) {
        this.PuestoEnElCampo = PuestoEnElCampo;
    }

    @Override
    public void Concentracion() {
        System.out.println("Realizando ejercicio de visualización...");
        System.out.println("Imaginando jugadas");
        System.out.println("...");
        System.out.println("Imaginando movimientos");
        System.out.println("...");
        System.out.println("Imaginando goles");
        System.out.println("...");
        System.out.println("Ejercicio de visualización completado.");
        System.out.println("...");
        System.out.println("___________________________________________");
    }

    @Override
    public void Viajar() {
        String nom = this.getNombreFutbolista();
        System.out.println("A qué destino va a viajar?");
        String dest = in.nextLine();
        System.out.println("Viajando con destino a " + dest);
        System.out.println("...");
        System.out.println("En qué hotel se va a alojar?");
        String hotel = in.nextLine();
        System.out.println("Llegando al hotel " + hotel);
        System.out.println("Que disfrute su estancia en " + dest + " Sr. " + nom);
        System.out.println("___________________________________________");
    }

    public void JugarPartido() {
        Random random = new Random();

        System.out.println("Contra qué equipo se van a enfrentar: ");
        String rival = in.nextLine();
        String equipo = super.getNombre();
        int random1 = random.nextInt(7);
        int random2 = random.nextInt(7);
        System.out.println("Jugando partido");
        System.out.println("...");
        System.out.println("Marcador Final:");
        System.out.println(equipo + ": " + random1 + " - " + rival + ": " + random2);
        System.out.println("___________________________________________");

    }

    public void Entrenar() {
        System.out.println("Haciendo ejercicio físico...");
        System.out.println("...");
        System.out.println("Practicando tiros al arco...");
        System.out.println("...");
        System.out.println("Realizando ejercicios tácticos...");
        System.out.println("...");
        System.out.println("___________________________________________");
    }

}
