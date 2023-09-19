/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panaderia.validaciones;

/**
 *
 * @author basto
 */
public class Validar {

    public boolean valdim(int dim) {
        if (dim < 0 || dim > 5) {
            return false;// ingreso de dimension incorrecta
        } else {
            return true;//ingreso de dimension correcta
        }
    }

    public boolean valdproducto(String producto) {
        if (producto.equalsIgnoreCase("pan de leche")) {
            return true;
        } else if (producto.equalsIgnoreCase("brazo de reina")) {
            return true;
        } else if (producto.equalsIgnoreCase("palmerita")) {
            return true;
        } else if (producto.equalsIgnoreCase("croissant")) {
            return true;
        } else {
            return false;
        }
    }
}
