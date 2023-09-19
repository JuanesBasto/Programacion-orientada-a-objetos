/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismodinamicomain;

/**
 *
 * @author basto
 */
public class PolimorfismoDinamicomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        clasevehiculo tec = new clasevehiculo();
        tec.mover();
        
        System.out.println("***************************");
        
        clasevehiculo tec1 = new clasemotocicleta();
        tec1.mover();
        
    }

}
