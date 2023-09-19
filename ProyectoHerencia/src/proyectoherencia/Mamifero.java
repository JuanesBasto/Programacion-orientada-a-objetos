/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoherencia;

/**
 *
 * @author basto
 */
public class Mamifero {
    private int canMamas;

    public Mamifero(int canMamas) {
        this.canMamas = canMamas;
    }

    public int getCanMamas() {
        return canMamas;
    }

    public void setCanMamas(int canMamas) {
        this.canMamas = canMamas;
    }
    
    public void nacer(){
        System.out.println("Nacio un mamifero");
    }
    
    public void mamar(){
        System.out.println("Darle de comer por mama a un mamífero");
    }
}
