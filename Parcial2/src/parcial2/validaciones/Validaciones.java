/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.validaciones;

import java.util.ArrayList;
import parcial2.NoPerecederos;
import parcial2.Perecederos;

/**
 *
 * @author basto
 */
public class Validaciones {

    public boolean validarcodigo(ArrayList<Perecederos> perecederos, ArrayList<NoPerecederos> noperecederos, long codigo) {
        for (Perecederos perecedero : perecederos) {
            if (codigo==perecedero.getCodigo()){
                return false;
            }
            for (NoPerecederos noperecedero: noperecederos){
            if (codigo==noperecedero.getCodigo()){
                return false;
            }
        }
        }
        return true;
    }

}
