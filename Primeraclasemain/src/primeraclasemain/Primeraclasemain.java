/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraclasemain;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Primeraclasemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int u = 0;
        /*try {
            System.out.println("Digitar un numero");
            u = in.nextInt();
        } catch (java.util.InputMismatchException ex) {
            System.out.println("No debe digitar letras, solo numeros " + ex.getMessage());
        }
        if (u != 0) {
            System.out.println("El resultado es " + u);
        }
        System.out.println("Corrio hasta aca");*/
        int j, j1;
        int[] Vec = new int[5];
        //llenar
        for (j = 0; j < 5; j++) {
            System.out.println("Digite la posicion  " + j);
            try{
            Vec[j] = in.nextInt();
            }catch(java.util.InputMismatchException ex){
                System.out.println("No debe digitar letras, solo numeros ");
                in.nextLine();
                j--;
            }
        }
        //imprimir
        System.out.println("Imprimir vector");
        try {
            for (j1 = 0; j1 < 7; j1++) {
                System.out.println("" + Vec[j1]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println("Se supero la dimension del vector al imprimira");
            System.out.println(""+ex.toString());
        }

        System.out.println("paso");
    }

}
