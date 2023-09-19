/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoherencia;

/**
 *
 * @author basto
 */
public class Pez extends Cetaceo implements AnimalMarino{
    private String tipo_pez;
    private int edad_pez;

    public Pez(String tipo_pez, int edad_pez, String tipo_cetaceo, int edad_cetaceo, int canMamas) {
        super(tipo_cetaceo, edad_cetaceo, canMamas);
        this.tipo_pez = tipo_pez;
        this.edad_pez = edad_pez;
    }

    

    public String getTipo_pez() {
        return tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        this.tipo_pez = tipo_pez;
    }

    public int getEdad_pez() {
        return edad_pez;
    }

    public void setEdad_pez(int edad_pez) {
        this.edad_pez = edad_pez;
    }
    
    
    
    @Override
    public void nadar(){
        System.out.println("El que nada es un pez");
    }
     
    public void obtenerTipo(int CONBRANQUIAS){
        if (CONBRANQUIAS ==1){
            System.out.println("El tipo de pez es con branquias");
        }
    }
}
