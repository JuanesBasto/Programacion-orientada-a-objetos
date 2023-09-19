/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaabstract;

/**
 *
 * @author Virtutienda
 */
public class hijo2 extends hijo1{
    private String nombrehijo2;
    private long cedulahijo2;
    private String colorhijo2;
    
    int edadhijo2 =20;
    @Override
    public int age() {
        return this.edadhijo2 * super.age(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

     public hijo2(){
         super();
     }
    public hijo2(String nombrehijo2, long cedulahijo2, String colorhijo2) {
        this.nombrehijo2 = nombrehijo2;
        this.cedulahijo2 = cedulahijo2;
        this.colorhijo2 = colorhijo2;
    }

    public hijo2(String nombrehijo2, long cedulahijo2, String colorhijo2, String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1) {
        super(nombrehijo1, cedulahijo1, colorhijo1, edadhijo1);
        this.nombrehijo2 = nombrehijo2;
        this.cedulahijo2 = cedulahijo2;
        this.colorhijo2 = colorhijo2;
    }

    public hijo2(String nombrehijo2, long cedulahijo2, String colorhijo2, String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1, String nombre, long cedula, String color, int edad) {
        super(nombrehijo1, cedulahijo1, colorhijo1, edadhijo1, nombre, cedula, color, edad);
        this.nombrehijo2 = nombrehijo2;
        this.cedulahijo2 = cedulahijo2;
        this.colorhijo2 = colorhijo2;
    }

    public String getNombrehijo2() {
        return nombrehijo2;
    }

    public void setNombrehijo2(String nombrehijo2) {
        this.nombrehijo2 = nombrehijo2;
    }

    public long getCedulahijo2() {
        return cedulahijo2;
    }

    public void setCedulahijo2(long cedulahijo2) {
        this.cedulahijo2 = cedulahijo2;
    }

    public String getColorhijo2() {
        return colorhijo2;
    }

    public void setColorhijo2(String colorhijo2) {
        this.colorhijo2 = colorhijo2;
    }

    public int getEdadhijo2() {
        return edadhijo2;
    }

    public void setEdadhijo2(int edadhijo2) {
        this.edadhijo2 = edadhijo2;
    }

    @Override
    public String toString() {
        return "hijo2{" + "nombrehijo2=" + this.getNombrehijo2() + ", cedulahijo2=" + this.getCedulahijo2() + ", colorhijo2=" + this.getColorhijo2() + ", edadhijo2=" + this.getEdadhijo2() +super.toString()+ '}';
    }
    
    
}
