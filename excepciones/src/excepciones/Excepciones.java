/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        int i = 0, j = 0;
        do {
            try {
                System.out.println("Digite un numero");
                int num = in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("No puede ingresar letras solo numeros");
                System.out.println(ex.getMessage() + "");
                j = 1;
            }

            if (j == 1) {
                i = 0;
            } else {
                i = 1;
            }
            in.nextLine();
        } while (i == 0);
        System.out.println("Siguio");
    }

}
