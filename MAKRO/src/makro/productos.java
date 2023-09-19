/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makro;

import java.util.Scanner;

/**
 *
 * @author basto
 */
public class productos {
    public int cproductos(int nump, int dia){
        
        Scanner in = new Scanner (System.in);
        boolean vnum;
        int compra = 0;
        int ddia= dia;
        validaciones m3 = new validaciones();
        for (int i=0; i<nump; i++){
            do{
                System.out.println("Digite el codigo del producto");
                System.out.println("(este debe tener 4 digitos y comenzar en impar");
                int cprod = in.nextInt();
                vnum =m3.codproducto(cprod);
            }while(vnum==false);
            System.out.println("Ingrese el precio del producto");
            System.out.print("$");
            int price = in.nextInt();
            descuentos d1 = new descuentos();
            int pfinal= d1.descuentopromo(price, price, ddia);
            compra = compra + pfinal; 
            
        }
        return compra;
    }
    
}
