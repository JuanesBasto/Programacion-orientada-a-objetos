/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author basto
 */
public abstract class Campo_entrenamientoModel {

    private long Id=0001;
    private String Nombre ="Deportivo tachira";
    private String Apellido;
    private int Edad;

    public Campo_entrenamientoModel() {
    }

    public Campo_entrenamientoModel(long Id, String Nombre, String Apellido, int Edad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Campo_entrenamiento{" + "Id=" + this.Id + ", nombre=" + this.Nombre + ", Apellido=" + this.Apellido + ", Edad=" + this.Edad + '}';
    }

    public abstract void Concentracion();

    public abstract void Viajar();

}
