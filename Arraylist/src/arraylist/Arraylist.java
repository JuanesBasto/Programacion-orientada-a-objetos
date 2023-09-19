/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author basto
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList <String> arrylis = new ArrayList <>();
        arrylis.add("Juan");
        arrylis.add("Esteban");
        arrylis.add("Basto");
        System.out.println("Segundo nombre: "+arrylis.get(1));
        arrylis.add("Inge");
        System.out.println("Rol: "+arrylis.get(3));
        arrylis.remove(3);
        System.out.println("Rol: "+arrylis.get(3));*/
        
        String nombre;
        int edad, i;
        long numero_tlf ;
        Scanner in = new Scanner(System.in);
        ArrayList<classarray> arrylis = new ArrayList<classarray>();
        for (i=0; i<1;i++){
            System.out.println("digite nombre");
            nombre=in.nextLine();
            System.out.println("digite edad");
            edad=in.nextInt();
            System.out.println("numero de telefono");
            numero_tlf=in.nextLong();
            classarray method = new classarray( nombre,  edad,  numero_tlf);
            in.nextLine();
        }
        System.out.println("jjjjjjj");
        for(i=0;i<=arrylis.size();i++){
            System.out.println(arrylis.get(i).nombre);
        }
    }
    
}
