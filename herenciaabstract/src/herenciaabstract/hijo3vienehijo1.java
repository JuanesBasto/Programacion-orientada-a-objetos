/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaabstract;

/**
 *
 * @author Virtutienda
 */
public class hijo3vienehijo1 extends hijo1{
     String nombrehijo3;
     long cedulahijo3;
     String colorhijo3;
     
     public hijo3vienehijo1(){
      //super.age();
         System.out.println("Edad hijo1: "+super.age());
    }

    public hijo3vienehijo1(String nombrehijo3, long cedulahijo3, String colorhijo3) {
        this.nombrehijo3 = nombrehijo3;
        this.cedulahijo3 = cedulahijo3;
        this.colorhijo3 = colorhijo3;
    }

    public hijo3vienehijo1(String nombrehijo3, long cedulahijo3, String colorhijo3, String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1) {
        super(nombrehijo1, cedulahijo1, colorhijo1, edadhijo1);
        this.nombrehijo3 = nombrehijo3;
        this.cedulahijo3 = cedulahijo3;
        this.colorhijo3 = colorhijo3;
    }

    public hijo3vienehijo1(String nombrehijo3, long cedulahijo3, String colorhijo3, String nombrehijo1, long cedulahijo1, String colorhijo1, int edadhijo1, String nombre, long cedula, String color, int edad) {
        super(nombrehijo1, cedulahijo1, colorhijo1, edadhijo1, nombre, cedula, color, edad);
        this.nombrehijo3 = nombrehijo3;
        this.cedulahijo3 = cedulahijo3;
        this.colorhijo3 = colorhijo3;
    }

    @Override
    public int age() {
        return super.age(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "hijo3vienehijo1{" + "nombrehijo3=" + this.nombrehijo3 + ", cedulahijo3=" + this.cedulahijo3 + ", colorhijo3=" + this.colorhijo3 + '}';
    }
     
     
    
}
