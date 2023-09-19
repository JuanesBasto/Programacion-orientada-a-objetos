package herencia_unica;


import herencia_unica.hijo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Interblink
 */
public class hijodeb extends hijo{
    
    long numero_cedula_hijo_b;
    String email_hijo_b;
    String Modelo_casa_hijo_b;
    long nu_cel_hijo_b;

   public hijodeb(){
       super();
   }

    public hijodeb(long numero_cedula_hijo_b, String email_hijo_b, String Modelo_casa_hijo_b, long nu_cel_hijo_b) {
        this.numero_cedula_hijo_b = numero_cedula_hijo_b;
        this.email_hijo_b = email_hijo_b;
        this.Modelo_casa_hijo_b = Modelo_casa_hijo_b;
        this.nu_cel_hijo_b = nu_cel_hijo_b;
    }

    public hijodeb(long numero_cedula_hijo_b, String email_hijo_b, String Modelo_casa_hijo_b, long nu_cel_hijo_b, long numero_cedula_hijo, String email_hijo, String Modelo_casa_hijo, long nu_cel_hijo) {
        super(numero_cedula_hijo, email_hijo, Modelo_casa_hijo, nu_cel_hijo);
        this.numero_cedula_hijo_b = numero_cedula_hijo_b;
        this.email_hijo_b = email_hijo_b;
        this.Modelo_casa_hijo_b = Modelo_casa_hijo_b;
        this.nu_cel_hijo_b = nu_cel_hijo_b;
    }

    public hijodeb(long numero_cedula_hijo_b, String email_hijo_b, String Modelo_casa_hijo_b, long nu_cel_hijo_b, long numero_cedula_hijo, String email_hijo, String Modelo_casa_hijo, long nu_cel_hijo, long numero_cedula_papa, String email_papa, String Modelo_casa_papa, long nu_cel_papa) {
        super(numero_cedula_hijo, email_hijo, Modelo_casa_hijo, nu_cel_hijo, numero_cedula_papa, email_papa, Modelo_casa_papa, nu_cel_papa);
        this.numero_cedula_hijo_b = numero_cedula_hijo_b;
        this.email_hijo_b = email_hijo_b;
        this.Modelo_casa_hijo_b = Modelo_casa_hijo_b;
        this.nu_cel_hijo_b = nu_cel_hijo_b;
    }
    
    public String informacion_papa(){
        System.out.println("******************************");
        System.out.println("Informacion Papa");
        System.out.println("******************************");
        return  super.informacion_papa();  
    }
    
      public String informacion_hijo(){
        System.out.println("******************************");
        System.out.println("Informacion Hijo");
        System.out.println("******************************");
        return  super.informacion_hijo();
        
    }
    
    
    
    public String informacion_hijo_b(){
        System.out.println("******************************");
        System.out.println("Informacion Hijo de B");
        System.out.println("******************************");
        return  "Cedula: "+this.numero_cedula_hijo_b+"\nEmail: "+ this.email_hijo_b + "\nModelo Casa: "+this.Modelo_casa_hijo_b + "\nNumero Celular: "+this.nu_cel_hijo_b;
        
    }
    
    
    
    
}
