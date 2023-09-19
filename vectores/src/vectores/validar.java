package vectores;

/**
 *
 * @author basto
 */
public class validar {
    //validar que la dimensión no sea negativa
    public boolean valdim(int dim){
        if (dim <0){
            return false;// ingreso de dimension incorrecta
        }else{
            return true;//ingreso de dimension correcta
        }
    }
    // validar que la edad sea posible (no que sea menor que uno ni mayor que 100)
    public boolean limage(int age){
        if (age<0 || age>101){
            return false;// ingreso de edad negativa
        }else {
            return true;//ingreso de edad correcta
        }
    }
        
    
}
