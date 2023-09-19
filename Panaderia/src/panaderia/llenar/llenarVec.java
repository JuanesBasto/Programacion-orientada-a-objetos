/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia.llenar;

import java.util.Scanner;
import panaderia.validaciones.Validar;
import productos.Productos;

/**
 *
 * @author basto
 */
public class llenarVec {

    public void llenar(int dim) {
        int[] Clientes = new int[dim];
        int[] Cedulas = new int[dim];
        String[] Nombres = new String[dim];
        int totaltienda = 0;
        int mayorcompra = 0;
        int totalcliente = 0;
        Validar v1 = new Validar();
        Productos p1 = new Productos();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {
            System.out.println("Digite su numero de cedula:");
            int cc = in.nextInt();
            Cedulas[i] = cc;

            in.nextLine();
            System.out.println("Ingrese su nombre:");
            String name = in.nextLine();
            Nombres[i] = name;

            p1.comprar();

            System.out.println("");
            System.out.println("Digite la cantidad de productos que desea comprar");
            System.out.println("");
            int cant = in.nextInt();
            String[] Productos = new String[cant];
            int[] Precios = new int[cant];

            for (int j = 0; j < cant; j++) {
                System.out.println("Ingrese el nombre del producto que desea comprar:");
                boolean vprod = true;
                String prod;
                do {
                    System.out.println("Debe ingresar el nombre como sale en el menu");
                    prod = in.nextLine();
                    Productos[j] = prod;
                    vprod = v1.valdproducto(prod);
                } while (vprod == false);

                System.out.println("Digite el precio del producto:");
                int price = in.nextInt();
                Precios[j] = price;

                p1.llenarcompra(prod);
                

                for (int l = 0; l < Precios.length; l++) {
                    totalcliente += Precios[l];
                }

                

                /*for (i = 0; i < Clientes.length; i++) {
                    totaltienda += totalcliente;
                    if (totalcliente > mayorcompra) {
                        mayorcompra = totalcliente;
                    }
                }*/

            }
            System.out.println("Señor " + name + " el valor a pagar por su compra es de $" + totalcliente);
            totaltienda += totalcliente;
            if (totalcliente> mayorcompra){
                mayorcompra = totalcliente;
            }
        }
        System.out.println("El total de ventas fueron $" + mayorcompra);
        p1.masvendido();
    }

}
