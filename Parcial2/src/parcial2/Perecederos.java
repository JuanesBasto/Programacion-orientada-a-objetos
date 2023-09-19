/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author basto
 */
public class Perecederos extends Productos {

    private int DiasACaducar;

    public Perecederos() {
        super();
    }

    public Perecederos(int DiasACaducar) {
        this.DiasACaducar = DiasACaducar;
    }

    public Perecederos(int DiasACaducar, long Codigo, String Nombre, float Precio) {
        super(Codigo, Nombre, Precio);
        this.DiasACaducar = DiasACaducar;
    }

    public int getDiasACaducar() {
        return DiasACaducar;
    }

    public void setDiasACaducar(int DiasACaducar) {
        this.DiasACaducar = DiasACaducar;
    }

    @Override
    public String toString() {
        return "Perecederos{" + "DiasACaducar=" + DiasACaducar + '}';
    }
    
    
    public double Calcular(int DiasACaducar, float Precio) {
        double preciofinal = 0;
        if (DiasACaducar == 1) {
            preciofinal = Precio / 4;
        } else if (DiasACaducar == 2) {
            preciofinal = Precio / 3;
        } else if (DiasACaducar == 3) {
            preciofinal = Precio / 2;
        }else{
            preciofinal= Precio;
        }
        return preciofinal;
    }

    @Override
    public double Calcular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String listar(){
        return "Codigo: "+super.getCodigo()+ " Nombre: "+super.getNombre();
    }


}
