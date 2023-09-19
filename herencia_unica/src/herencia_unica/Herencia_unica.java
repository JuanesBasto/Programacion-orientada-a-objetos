/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_unica;

import java.util.Scanner;

/**
 *
 * @author Interblink
 */

public class Herencia_unica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        long cedu_papa,numero_cel_papa, cedu_hijo,numero_cel_hijo;
        String email_papa,modelo_casa_papa, email_hijo,modelo_casa_hijo;
        
        long cedu_hijo_b,numero_cel_hijo_b;
        String email_hijo_b, modelo_casa_hijo_b;
        
        System.out.println("******************************");
        System.out.println("Datos Papa");
        System.out.println("******************************");
        
        System.out.println("Digite numero de cedula: ");
        cedu_papa = tec.nextLong();
        tec.nextLine();
        System.out.println("Digite el email: ");
        email_papa = tec.nextLine();
      
        System.out.println("Digite modelo casa: ");
        modelo_casa_papa = tec.nextLine();
      
        System.out.println("Digite numero de celular: ");
        numero_cel_papa = tec.nextLong();
        
       // padre metodo=new padre(cedu_papa,email_papa,modelo_casa_papa,numero_cel_papa);
        
       // System.out.println(metodo.informacion_papa()); 
        
        System.out.println("******************************");
        System.out.println("Datos Hijo");
        System.out.println("******************************");
        
        System.out.println("Digite numero de cedula: ");
        cedu_hijo = tec.nextLong();
        tec.nextLine();
        System.out.println("Digite el email: ");
        email_hijo = tec.nextLine();
      
        System.out.println("Digite modelo casa: ");
        modelo_casa_hijo = tec.nextLine();
      
        System.out.println("Digite numero de celular: ");
        numero_cel_hijo = tec.nextLong();
        
        hijo metodohijo= new hijo(cedu_hijo,email_hijo,modelo_casa_hijo,numero_cel_hijo,cedu_papa,email_papa,modelo_casa_papa,numero_cel_papa);
       // System.out.println(metodohijo.informacion_hijo_papa());
       // System.out.println(metodohijo.informacion_hijo());
        
        
        System.out.println("******************************");
        System.out.println("Datos Hijo B");
        System.out.println("******************************");
        
        System.out.println("Digite numero de cedula: ");
        cedu_hijo_b = tec.nextLong();
        tec.nextLine();
        System.out.println("Digite el email: ");
        email_hijo_b = tec.nextLine();
      
        System.out.println("Digite modelo casa: ");
        modelo_casa_hijo_b = tec.nextLine();
      
        System.out.println("Digite numero de celular: ");
        numero_cel_hijo_b = tec.nextLong();
        
        hijodeb metodo_hijodeb = new hijodeb(cedu_hijo_b,email_hijo_b , modelo_casa_hijo_b, numero_cel_hijo_b, cedu_hijo,email_hijo,modelo_casa_hijo,numero_cel_hijo,cedu_papa,email_papa,modelo_casa_papa,numero_cel_papa );
        System.out.println(metodo_hijodeb.informacion_papa());
        System.out.println(metodo_hijodeb.informacion_hijo());
        System.out.println(metodo_hijodeb.informacion_hijo_b());
        
    }
    
}
