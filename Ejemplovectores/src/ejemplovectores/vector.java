/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovectores;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class vector {
    
    public void imprimir(int vec[]){
        for (int po=0; po<vec.length;po++){
            System.out.println("El numero de la posicion ["+po+"] es "+vec[po]);
        }        
    }
    public void llenar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite la dimension del vector");
        int n= in.nextInt();
        int [] vec = new int[n];
        
        
        for (int i=0;i<vec.length;i++){
            System.out.println("DIgite la posicion ["+ i+"]");
            int num = in.nextInt();
            vec[i]= num;
        }
        vector v = new vector();
        v.imprimir(vec);
        
        
    }
}
