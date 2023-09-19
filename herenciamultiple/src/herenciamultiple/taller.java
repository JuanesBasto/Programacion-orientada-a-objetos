/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author basto
 */
public class taller extends automovil implements camion {

    String placa;

    @Override
    public int verificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void lavado() {
        if (PLACACOLOMBIANA.equalsIgnoreCase("0")) {
            System.out.println("Por ser colombiana tiene un descuento del 5 porciento");
            System.out.println("placa: "+super.toString());
        } else {
            System.out.println("Debe pagar la tarifa plena");
        }
    }

}
