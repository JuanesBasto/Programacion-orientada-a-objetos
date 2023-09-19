/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.metodosyparametros;

import static java.lang.Math.sqrt;

/**
 *
 * @author basto
 */
public class operaciones {
    
    public void raiz(int sumar){
        
        double raiz1 = sqrt(sumar);
        System.out.println("La raiz del numero es: "+raiz1);
        operaciones1 b2 = new operaciones1();
        double sumaraiz=b2.sumaraiz(raiz1);
        System.out.println("La suma de la raiz mas 10 es :"+sumaraiz);
        
    }
    
}
