/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author basto
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double [] ventas = new double [12];
        for (int i=0;i<ventas.length;i++){
            System.out.println("Digite las ventas del mes "+(i+1));
            ventas[i]= in.nextInt();
        }
        
        mostrarDatosVentas(ventas);
    }
      
    public static void mostrarDatosVentas(double[] ventas) {
        double maxVentas = ventas[0];
        int mesMaxVentas = 1;
        double totalVentas = 0.0;
        double promedioVentas;
    
        // Obtener el mes con las ventas máximas y el total de las ventas
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        
            if (ventas[i] > maxVentas) {
                maxVentas = ventas[i];
                mesMaxVentas = i + 1;
            }
        }
    
        // Calcular el promedio de las ventas
        promedioVentas = totalVentas / ventas.length;
    
        // Mostrar los resultados
        System.out.println("El mes con las ventas maximas fue: " + mesMaxVentas);
        System.out.println("Las ventas maximas fueron: " + maxVentas);
        System.out.println("El total de las ventas fue: " + totalVentas);
        System.out.println("El promedio de las ventas fue: " + promedioVentas);
    }

    
}
