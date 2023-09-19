/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author basto
 */
public abstract class automovil {
    private String color="rojo";
    private String placa="RTL789";
    private long soat = 68576111;

    public automovil() {
        super();
    }

    public automovil(String color, String placa, long soat) {
        this.color = color;
        this.placa = placa;
        this.soat = soat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getSoat() {
        return soat;
    }

    public void setSoat(long soat) {
        this.soat = soat;
    }

    @Override
    public String toString() {
        return "automovil{" + "color=" + this.getColor() + ", placa=" + this.getPlaca() + ", soat=" + this.getSoat() + '}';
    }
    
    
    
    public abstract int verificar();  
}
