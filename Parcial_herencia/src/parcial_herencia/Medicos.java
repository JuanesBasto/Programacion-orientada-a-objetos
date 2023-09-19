/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Medicos extends Campo_entrenamiento {

    private long IdMedico;
    private String NombreMedico;
    private String ApellidoMedico;
    private int EdadMedico;
    private String FechaAtencion;
    private String HoraAtencion;

    Scanner in = new Scanner(System.in);

    public Medicos() {
        super();
    }

    public Medicos(long IdMedico, String NombreMedico, String ApellidoMedico, int EdadMedico, String FechaAtencion, String HoraAtencion) {
        this.IdMedico = IdMedico;
        this.NombreMedico = NombreMedico;
        this.ApellidoMedico = ApellidoMedico;
        this.EdadMedico = EdadMedico;
        this.FechaAtencion = FechaAtencion;
        this.HoraAtencion = HoraAtencion;
    }

    public Medicos(long IdMedico, String NombreMedico, String ApellidoMedico, int EdadMedico, String FechaAtencion, String HoraAtencion, long Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.IdMedico = IdMedico;
        this.NombreMedico = NombreMedico;
        this.ApellidoMedico = ApellidoMedico;
        this.EdadMedico = EdadMedico;
        this.FechaAtencion = FechaAtencion;
        this.HoraAtencion = HoraAtencion;
    }

    public long getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(long IdMedico) {
        this.IdMedico = IdMedico;
    }

    public String getNombreMedico() {
        return NombreMedico;
    }

    public void setNombreMedico(String NombreMedico) {
        this.NombreMedico = NombreMedico;
    }

    public String getApellidoMedico() {
        return ApellidoMedico;
    }

    public void setApellidoMedico(String ApellidoMedico) {
        this.ApellidoMedico = ApellidoMedico;
    }

    public int getEdadMedico() {
        return EdadMedico;
    }

    public void setEdadMedico(int EdadMedico) {
        this.EdadMedico = EdadMedico;
    }

    public String getFechaAtencion() {
        return FechaAtencion;
    }

    public void setFechaAtencion(String FechaAtencion) {
        this.FechaAtencion = FechaAtencion;
    }

    public String getHoraAtencion() {
        return HoraAtencion;
    }

    public void setHoraAtencion(String HoraAtencion) {
        this.HoraAtencion = HoraAtencion;
    }

    public void Concentracion(ArrayList<Futbolistas> futbolistas) {
        System.out.println("Realizando un chequeo medico previo al partido o entrenamiento");
        for (Futbolistas futbolista : futbolistas) {
            System.out.println("Realizando chequeo  a " + futbolista.getNombreFutbolista());
        }
        System.out.println("Tratando lesiones o dolencias de los jugadores");
        System.out.println("Brindando consejos y recomendaciones para mantener la salud y prevenir lesiones");
        System.out.println("___________________________________________");
    }

    @Override
    public void Viajar() {
        String nom = this.getNombreMedico();
        System.out.println("A que destino va a viajar?");
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

    public void Historial() {
        ArrayList<String> registrosmedicos = new ArrayList<>();
        if (registrosmedicos.isEmpty()) {
            System.out.println("No hay registros medicos disponibles.");
            return;
        }
    }

    @Override
    public void Concentracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
