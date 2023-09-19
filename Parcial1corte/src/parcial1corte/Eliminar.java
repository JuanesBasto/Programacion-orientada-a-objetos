/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1corte;

/**
 *
 * @author basto
 */
public class Eliminar {
    public boolean vDelete(String delete, String Nombre[]){
        for (int i = 0; i < Nombre.length; i++) {
            if (delete.equalsIgnoreCase(Nombre[i])){
                return true;
            }
        }
        return false;
    }
}
