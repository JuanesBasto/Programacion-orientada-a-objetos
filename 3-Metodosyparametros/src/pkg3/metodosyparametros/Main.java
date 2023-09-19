/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.metodosyparametros;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
     public float divi(int a, int b){
         float divi1= (float)a/(float)b;
         return divi1;
     }
    
     public void multiplicacion (int a, int b){
         int multipli= a*b;
         System.out.println("La multiplicacion es : "+multipli);
     }
    
    public void suma(int a, int b){
        operaciones b1 = new operaciones();
        int suma = a+b;
        System.out.println("La suma de los numeros es: "+suma);
        b1.raiz(suma);
    }
    
    public static void resta(int a, int b){
        
        int resta = a-b;
        System.out.println("La resta de los numeros es : "+resta);
        
        Main a2 =new Main();
        a2.multiplicacion(a, b);
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Main a1 = new Main();
        System.out.println("Digite numero a");
        int a = in.nextInt();
        System.out.println("Digite el numero b");
        int b= in.nextInt();
        a1.suma(a,b);
        resta(a,b);
        
        float divi1= a1.divi(a, b);
        System.out.println("La division es: "+divi1);
        
    }
    
}
