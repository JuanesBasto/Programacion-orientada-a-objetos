/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author basto
 */
public class classarray {
    String nombre;
    int edad; 
    long numero_tlf;
    
    public classarray(){
        super();
    }

    public classarray(String nombre, int edad, long numero_tlf){
        this.nombre = nombre;
        this.edad = edad;
        this.numero_tlf = numero_tlf;
    }
    
    public classarray(String nombre, int edad){
        this.nombre= nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " +this.nombre+" Edad: "+this.edad+" Numero telefonico: "+this.numero_tlf;
    }
}
