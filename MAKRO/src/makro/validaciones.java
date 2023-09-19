/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makro;

/**
 *
 * @author basto
 */
public class validaciones {
    
    public boolean validardia(int a){
        /*acá validamos que el dia que se digito por teclado sea un numero
          entre 1 y 31 que son los días que puede tener un mes*/
        if (a<0 || a>32){
            return false;
        }else{
            return true;
        }
    }
    public boolean validarsexo( String sexo){
        /*validamos que los que se haya leido por teclado sea una letra
        correspondiente al genero*/
        if (sexo=="F" || sexo =="M" || sexo=="Femenino" || sexo=="Masculino"){
            return true;
        } else {
            return false;
        }
    }
    public boolean codproducto (int nump){
        /*primero creamos un contador que nos ayudará a saber cuantas cifras
        tiene el producto que el cliente va a comprar y si es un codigo valido
        (para que sea valido debe tener 4 cifras y su primera cifra debe ser impar*/
        int i=0;
        while (nump!=0){
            int j=nump/10;
            i++;
        }
        if (i==4){
            int fnum = nump/1000;
            if (fnum % 2 != 0){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
}
