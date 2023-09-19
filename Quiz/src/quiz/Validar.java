/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author basto
 */
public class Validar {

    public boolean valdim(int dim) {
        if (dim <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean valopc(int opc) {
        if (opc == 1 || opc == 2 || opc == 3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ingresar(int numero, int Vec[]) {
        int aux = numero;
        int cifras = 0;
        
        boolean ccifras=false, repetido=false, posicion=false;
        while (aux != 0) {
            aux = aux / 10;
            cifras += 1;
        }
        if (cifras>=6){
            ccifras=true;
        }else{
            ccifras=false;
        }
        
        if (cifras>=6){
            int terceracifra= (numero/100)%10;
            int sextacifra= (numero/10000)%10;
            if ((terceracifra%2==0 && sextacifra%2!=0) || (terceracifra%2!=0 && sextacifra%2==0)){
                posicion=true;
            }
            for (int i =0; i <Vec.length;i++){
                if (numero != Vec[i]){
                    repetido= true;
                }
            }
            posicion=false;
            repetido=false;
        }
        
        if (ccifras==true && posicion==true && repetido==true){
            return true;
        }
        return false;

    }
}
