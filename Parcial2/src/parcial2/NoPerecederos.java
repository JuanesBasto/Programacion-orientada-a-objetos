/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author basto
 */
public class NoPerecederos extends Productos {

    private int Tipo;

    public NoPerecederos() {
        super();
    }

    public NoPerecederos(int Tipo) {
        this.Tipo = Tipo;
    }

    public NoPerecederos(int Tipo, long Codigo, String Nombre, float Precio) {
        super(Codigo, Nombre, Precio);
        this.Tipo = Tipo;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "NoPerecederos{" + "Tipo=" + Tipo + '}';
    }

    
    public double Calcular(int Tipo, float Precio) {
        double preciofinal = 0;
        
        if (Tipo == 1) {
            preciofinal = Precio -(Precio*0.05);
        } else if (Tipo == 2) {
            preciofinal = Precio -(Precio*0.07);
        } else if (Tipo == 3) {
            preciofinal = Precio -(Precio*0.23);
        }
        return  preciofinal;
    }

    @Override
    public double Calcular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String listar(){
        return "Codigo: "+super.getCodigo()+ " Nombre: "+super.getNombre();
    }

}
