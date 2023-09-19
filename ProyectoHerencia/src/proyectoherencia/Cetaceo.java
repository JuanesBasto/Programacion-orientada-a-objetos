/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoherencia;

/**
 *
 * @author basto
 */
public class Cetaceo extends Mamifero implements AnimalMarino{
    private String tipo_cetaceo;
    private int edad_cetaceo;

    public Cetaceo(String tipo_cetaceo, int edad_cetaceo, int canMamas) {
        super(canMamas);
        this.tipo_cetaceo = tipo_cetaceo;
        this.edad_cetaceo = edad_cetaceo;
    }

    

    public String getTipo_cetaceo() {
        return tipo_cetaceo;
    }

    public void setTipo_cetaceo(String tipo_cetaceo) {
        this.tipo_cetaceo = tipo_cetaceo;
    }

    public int getEdad_cetaceo() {
        return edad_cetaceo;
    }

    public void setEdad_cetaceo(int edad_cetaceo) {
        this.edad_cetaceo = edad_cetaceo;
    }
    
    public void nacer(){
        System.out.println("Nacio un cetaceo");
    }
    
    public void obtenerTipo(int SINBRANQUIAS){
        if (SINBRANQUIAS ==1){
            System.out.println("El cetaceo es sin branquias");
        }
    }
    
    @Override
    public void nadar(){
        System.out.println("El que nada es un cetaceo");
    }
}
