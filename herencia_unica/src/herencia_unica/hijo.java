/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_unica;

/**
 *
 * @author Interblink
 */
public class hijo extends padre{
    long numero_cedula_hijo;
    String email_hijo;
    String Modelo_casa_hijo;
    long nu_cel_hijo;

    public hijo() {
        super();
    }

    public hijo(long numero_cedula_hijo, String email_hijo, String Modelo_casa_hijo, long nu_cel_hijo) {
        this.numero_cedula_hijo = numero_cedula_hijo;
        this.email_hijo = email_hijo;
        this.Modelo_casa_hijo = Modelo_casa_hijo;
        this.nu_cel_hijo = nu_cel_hijo;
    }

    public hijo(long numero_cedula_hijo, String email_hijo, String Modelo_casa_hijo, long nu_cel_hijo, long numero_cedula_papa, String email_papa, String Modelo_casa_papa, long nu_cel_papa) {
        super(numero_cedula_papa, email_papa, Modelo_casa_papa, nu_cel_papa);
        this.numero_cedula_hijo = numero_cedula_hijo;
        this.email_hijo = email_hijo;
        this.Modelo_casa_hijo = Modelo_casa_hijo;
        this.nu_cel_hijo = nu_cel_hijo;
    }

 
    
    public String informacion_hijo_papa(){
        System.out.println("******************************");
        System.out.println("Informacion Papa");
        System.out.println("******************************");
        return  super.informacion_papa();
        
    }
    
    public String informacion_hijo(){
        System.out.println("******************************");
        System.out.println("Informacion Hijo");
        System.out.println("******************************");
        return  "Cedula: "+this.numero_cedula_hijo +"\nEmail: "+ this.email_hijo + "\nModelo Casa: "+this.Modelo_casa_hijo + "\nNumero Celular: "+this.nu_cel_hijo;
        
    }
    
    
    
    
    
}
