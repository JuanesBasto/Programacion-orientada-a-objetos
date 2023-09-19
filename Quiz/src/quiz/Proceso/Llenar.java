/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.Proceso;

import java.util.Scanner;
import quiz.Validar;

/**
 *
 * @author basto
 */
public class Llenar {
    public void llevarvec(int Vec[],String Vec2[]){
        Scanner in = new Scanner(System.in);
        Validar v1= new Validar();
        int num=0;
        for (int i=0; i<Vec.length;i++){
            System.out.println("Digite un numero para la posicion "+(i+1));
            
            boolean vcifras=false;
            do{
                System.out.println("El numero debe ser mayor a 6 cifras");
            num = in.nextInt();
            vcifras = v1.ingresar(num,Vec);
            }while(vcifras==false);
            Vec[i]= num;
        }
        in.nextLine();
        System.out.println("Llenar el siguiente vector con una letra y un numero");
        for (int j=0; j<Vec2.length;j++){
            System.out.println("Digite la letra de la posicion "+j);
            String pos =in.nextLine();
            Vec2[j]= pos;
            
        }
        int cnum= Integer.parseInt(Vec2[1]);
                for (int i=0;i<=cnum;i++){
                    System.out.println(Vec2[0].repeat(i));
                }
    }
    public int convertir(String Vec2[]){
        int piramide= Integer.parseInt(Vec2[1]);
        return piramide;
    }
}
