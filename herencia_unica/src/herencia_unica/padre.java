package herencia_unica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Interblink
 */
public class padre {
    long numero_cedula_papa;
    String email_papa;
    String Modelo_casa_papa;
    long nu_cel_papa;
    
    public padre(){
        super();
    }
    
    public padre(long numero_cedula_papa,String email_papa,String Modelo_casa_papa,long nu_cel_papa){
        this.numero_cedula_papa = numero_cedula_papa;
        this.email_papa = email_papa;
        this.Modelo_casa_papa = Modelo_casa_papa;
        this.nu_cel_papa = nu_cel_papa;
    }
    
    public String informacion_papa(){
      
        return "\nNumero cedula: "+this.numero_cedula_papa + "\nEmail: "+this.email_papa + "\nModelo Casa: "+this.Modelo_casa_papa + "\nNumero celular: "+this.nu_cel_papa;
        
    }

    @Override
    public String toString() {
        return "padre{" + "numero_cedula_papa=" + numero_cedula_papa + ", email_papa=" + email_papa + ", Modelo_casa_papa=" + Modelo_casa_papa + ", nu_cel_papa=" + nu_cel_papa + '}';
    }
    
}
