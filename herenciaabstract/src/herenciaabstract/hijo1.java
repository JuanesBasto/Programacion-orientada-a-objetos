/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaabstract;

/**
 *
 * @author Virtutienda
 */
public class hijo1 extends persona {
    private String nombrehijo1;
    private long cedulahijo1;
    private String colorhijo1;
    private int edadhijo1;
    @Override
    public int age() {
        return 10;
    }
    public hijo1(){
        super();
    }

    public hijo1(String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1) {
        this.nombrehijo1 = nombrehijo1;
        this.cedulahijo1 = cedulahijo1;
        this.colorhijo1 = colorhijo1;
        this.edadhijo1 = edadhijo1;
    }

    public hijo1(String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1, String nombre, long cedula, String color, int edad) {
        super(nombre, cedula, color, edad);
        this.nombrehijo1 = nombrehijo1;
        this.cedulahijo1 = cedulahijo1;
        this.colorhijo1 = colorhijo1;
        this.edadhijo1 = edadhijo1;
    }

    public String getNombrehijo1() {
        return nombrehijo1;
    }

    public void setNombrehijo1(String nombrehijo1) {
        this.nombrehijo1 = nombrehijo1;
    }

    public long getCedulahijo1() {
        return cedulahijo1;
    }

    public void setCedulahijo1(long cedulahijo1) {
        this.cedulahijo1 = cedulahijo1;
    }

    public String getColorhijo1() {
        return colorhijo1;
    }

    public void setColorhijo1(String colorhijo1) {
        this.colorhijo1 = colorhijo1;
    }

    public int getEdadhijo1() {
        return edadhijo1;
    }

    public void setEdadhijo1(int edadhijo1) {
        this.edadhijo1 = edadhijo1;
    }

    @Override
    public String toString() {
        return "hijo1{" + "nombrehijo1=" + this.getNombrehijo1() + ", cedulahijo1=" + this.getCedulahijo1() + ", colorhijo1=" + this.getColorhijo1() + ", edadhijo1=" + this.getEdadhijo1() + super.toString()+'}';
    }
    
    
}
