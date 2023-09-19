/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaabstract;

/**
 *
 * @author Virtutienda
 */
public abstract class persona {
    private String nombre;
    private long cedula;
    private String color;
    private int edad;
    
    public persona(){
        super();
    }

    public persona(String nombre, long cedula, String color, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.color = color;
        this.edad = edad;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + this.getNombre() + ", cedula=" + this.getCedula() + ", color=" + this.getColor() + ", edad=" + this.getEdad() + '}';
    }
    
    public abstract int age();
    
}
