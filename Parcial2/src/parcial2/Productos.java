/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author basto
 */
public abstract class Productos {
    private long Codigo;
    private String Nombre;
    private float Precio;
    
    
    public Productos(){
        super();
    }

    public Productos(long Codigo, String Nombre, float Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public long getCodigo() {
        return Codigo;
    }

    public void setCodigo(long Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "Codigo=" + this.getCodigo() + ", Nombre=" + this.getNombre() + ", Precio=" + this.getPrecio() + '}';
    }
    
    public abstract double Calcular();
    
    
    
}
