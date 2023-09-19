/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public class Chevrolet extends Camiones{
    
    public Chevrolet(){
        super();
        setNombre_director("Claudia Diaz");
    }

    @Override
    public void taller() {
        System.out.println("Entrar a la segunda puerta de chevrolet");
    }

    @Override
    public void puntodepago() {
        System.out.println("Tiene un costo de 200000");
    }

    @Override
    public void SalaDeEspera() {
        System.out.println("Tiempo de aarglo del camion es de 2 horas");
    }
    
    public void promocion(){
        System.out.println("Descuento del 15%");
    }
}
