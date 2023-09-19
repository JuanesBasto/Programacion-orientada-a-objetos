/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public class Renault extends Automoviles {

    public Renault() {
        super();
        setNombre_director("Cesar C");

    }

    @Override
    public void taller() {
        System.out.println("Entrar a la tercera puerta de renault");
    }

    @Override
    public void puntodepago() {
        System.out.println("Tiene un costo de 350000");
    }

    @Override
    public void vendedores() {
        System.out.println("El carro lo vende un hombre");
    }

    public void Garantia() {
        System.out.println("30 días calendario por arreglar el carro marca Renault");
    }
}
