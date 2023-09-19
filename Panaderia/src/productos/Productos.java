/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author basto
 */
public class Productos {

    String[] productos = {"pan de leche", "brazo de reina", "palmerita", "croissant"};
    int[] price = {200, 1500, 600, 3000};
    int[] cantidad = {0, 0, 0, 0};

    public void comprar() {
        System.out.println("Los prodcutos que tenemos son:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " a $" + price[i]);
        }
    }

    public void llenarcompra(String produc) {

        if (produc.equalsIgnoreCase(productos[0])) {
            cantidad[0] = cantidad[0] + 1;
        } else if (produc.equalsIgnoreCase(productos[1])) {
            cantidad[1] = cantidad[1] + 1;
        } else if (produc.equalsIgnoreCase(productos[2])) {
            cantidad[2] = cantidad[2] + 1;
        } else if (produc.equalsIgnoreCase(productos[3])) {
            cantidad[3] = cantidad[3] + 1;
        }

    }

    public void masvendido() {
        int mvend = 0;
        int indice = 0;
        for (int i = 0; i < cantidad.length; i++) {
            if (cantidad[i] > mvend) {
                mvend = cantidad[i];
                indice = i;
            }
        }
        System.out.println("El producto mas vendido fue " + productos[indice] + " con " + mvend + " vendidos");
    }

}
