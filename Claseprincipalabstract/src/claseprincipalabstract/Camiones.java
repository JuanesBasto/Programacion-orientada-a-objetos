/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public abstract class Camiones  extends Concesionario{
    
    public Camiones(){
        super();
    }
    
    @Override
    public abstract void taller();

    @Override
    public abstract void puntodepago();

    public abstract void SalaDeEspera();
}
