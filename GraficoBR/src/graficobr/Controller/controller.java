/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficobr.Controller;

import graficobr.Modell.modells;

/**
 *
 * @author Virtutienda
 */
public class controller {
    public controller(){
        super();
    }
    public String controllers(String rtasuma1,String rtasuma2,int op){
         modells meth = new modells();
         
         switch(op){
             case 1 -> {
                 String rtasuma = meth.suma(rtasuma1, rtasuma2);
                 return rtasuma;
            }
             
             case 2 -> {
                 String rtarestar = meth.restar(rtasuma1, rtasuma2);
                 return rtarestar;
            }
         }
        return null;
              
    }
    
}
