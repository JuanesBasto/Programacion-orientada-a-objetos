/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public class Hyundai extends Automoviles {

    public Hyundai() {
        super();
        setNombre_director("Juan Basto");

    }

    @Override
    public void taller() {
        System.out.println("Entrar a la tercera puerta de hyundai");
    }

    @Override
    public void puntodepago() {
        System.out.println("Tiene un costo de 300000");
    }

    @Override
    public void vendedores() {
        System.out.println("El carro lo vende una mujer");
    }

    public void Garantia() {
        System.out.println("30 dias calendario por arreglar el carro marca hyundai");
    }

}
