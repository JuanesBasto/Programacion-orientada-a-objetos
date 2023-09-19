/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makro;

/**
 *
 * @author basto
 */
public class descuentos {
    public int descuentopromo(int cprod, int price, int dia){
        int ultimosdigitos = cprod % 100;
        if (ultimosdigitos == dia){
            int descuento = (int) (price *0.1);
            int pdescuento= price-descuento;
            return pdescuento;
        }else{
        return price;
        }
    }
    public int cedulaganadora(int doc, int dia){
        int sum = 0;
        int numerotemporal = doc;
        
        while (numerotemporal!=0){
            int digito = numerotemporal % 10;// obtenemos el ultimo digito
            sum += digito; //agrega el ultimo digito a la sumatoria
            numerotemporal /=10; //elimina el ultimo digito
        }
        if(sum==dia){
            return 0;
        }else{
            return 1;
        }
        
    }
}
