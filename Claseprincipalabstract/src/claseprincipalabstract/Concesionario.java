/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipalabstract;

/**
 *
 * @author basto
 */
public abstract class Concesionario {

    private String nombre_director;

    public Concesionario( ) {
    }

    public String getNombre_director() {
        return nombre_director;
    }

    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

    public abstract void taller();

    public abstract void puntodepago();

    public void director_ejecutivo() {
        System.out.println("EL director ejecutivo se llama "+getNombre_director());
    }

}
