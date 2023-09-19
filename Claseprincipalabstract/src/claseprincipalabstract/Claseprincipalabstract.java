/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public class Claseprincipalabstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hyundai car = new Hyundai();
        
        System.out.println("-------------------------------");
        System.out.println("Informacion de Hyundai:");
        car.director_ejecutivo();
        car.taller();
        car.vendedores();
        car.puntodepago();
        car.Garantia();

        System.out.println("------------------------------");
        System.out.println("Informacion de Renault:");

        Renault car1 = new Renault();
        car1.director_ejecutivo();
        car1.taller();
        car1.vendedores();
        car1.puntodepago();
        car1.Garantia();

        System.out.println("------------------------------");
        System.out.println("Informacion de Chevrolet:");
        Chevrolet car2 = new Chevrolet();
        car2.director_ejecutivo();
        car2.taller();
        car2.puntodepago();
        car2.SalaDeEspera();
        car2.promocion();
        
    }

}
