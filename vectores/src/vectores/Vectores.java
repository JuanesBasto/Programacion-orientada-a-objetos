/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;
import java.util.Scanner;
import vectores.validar;
/**
 *
 * @author basto
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //instanciar variables
        boolean valdim;
        int dim;
        
        //realizar un menu que permita llenar datos, imprimir , buscar edad,modificar y eliminar 
        
        System.out.println("Digite la dimension");
        //lectura de dimension validando que no sea un numero negativo
        do {
            System.out.println("La dimensión debe ser un valor positivo (+0)");
            dim = in.nextInt();
            //instancia del objeto para validar la dim
            validar dimension = new validar();
            valdim = dimension.valdim(dim);
            
        }while (valdim==false);
        llenar tam = new llenar();
        tam.llen(dim);
    }
    
}
