/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismoestaticomain;

/**
 *
 * @author basto
 */
public class PolimorfismoEstaticomain {

    public static int sumar(int x, int y) {
        return x + y;
    }

    public static int sumar(int x, int y, int z) {
        return x + y + z;
    }
    
    public static int sumar(double x, double y, int z) {
        int total= (int) x + (int) y + z;
        return total;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //@overload
        int u = sumar(5,4);
        System.out.println("La suma es "+u);
            
        //@overload
        int u1 = sumar(1,2,3);
        System.out.println("La suma es "+u1);
        
        //@overload
        int u2 = sumar(1.2,2.1,3);
        System.out.println("La suma es "+u2);
    }

}
