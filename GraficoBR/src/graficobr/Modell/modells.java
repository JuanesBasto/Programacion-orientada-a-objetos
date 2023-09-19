/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficobr.Modell;

/**
 *
 * @author Virtutienda
 */
public class modells {
    public modells(){
        super();
    }
    
    public String suma(String rtasuma1,String rtasuma2 ){
        int n1 = Integer.parseInt(rtasuma1);
        int n2 = Integer.parseInt(rtasuma2);      
        int sumatotal = n1+n2;
        String rtasumatotal1 = String.valueOf(sumatotal);
        return rtasumatotal1;
    }
    
      public String restar(String rtaresta1,String rtaresta2 ){
        int n1 = Integer.parseInt(rtaresta1);
        int n2 = Integer.parseInt(rtaresta2);      
        int rtaresta = n1-n2;
        String rtarestatotal = String.valueOf(rtaresta);
        return rtarestatotal;
    }
    
}
