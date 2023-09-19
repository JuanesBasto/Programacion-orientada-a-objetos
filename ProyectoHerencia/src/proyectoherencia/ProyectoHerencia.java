/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoherencia;

/**
 *
 * @author basto
 */
public class ProyectoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cetaceo ballena = new Cetaceo("Azul", 50, 2);
        System.out.println("********************************");
        System.out.println("La info pertenece a un cetaceo");
        // ballena.getEdad_cetaceo();
        //ballena.getTipo_cetaceo();
        ballena.obtenerTipo(0);
        ballena.nacer();
        ballena.nadar();
        System.out.println("********************************");
        System.out.println("La info pertenece a un pez");

        Pez tec = new Pez("Escalar", 1, "Azul", 50, 2);
        tec.nadar();
        tec.obtenerTipo(1);
        System.out.println("********************************");
        System.out.println("La info pertenece a un mamifero");
        Mamifero tec2 = new Mamifero(3);
        tec2.mamar();
        tec2.nacer();

    }

}
