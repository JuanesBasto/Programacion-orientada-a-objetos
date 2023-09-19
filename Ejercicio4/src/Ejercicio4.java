import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[50];
        int cantidadNumeros = 0;
        int cantidadPrimos = 0;
        int cantidadImpares = 0;
        boolean repetido = false;
        
        // Llenar el vector con números enteros
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero entero para la posicion " + (i+1) + ": ");
            int numero = sc.nextInt();
            
            // Verificar si el número ya está en el vector
            for (int j = 0; j < cantidadNumeros; j++) {
                if (vector[j] == numero) {
                    repetido = true;
                    break;
                }
            }
            
            // Si el número está repetido, salir del ciclo
            if (repetido) {
                break;
            }
            
            // Agregar el número al vector y actualizar las estadísticas
            vector[cantidadNumeros] = numero;
            cantidadNumeros++;
            
            if (esPrimo(numero)) {
                cantidadPrimos++;
            }
            
            if (terminaEnImpar(numero)) {
                cantidadImpares++;
            }
        }
        
        // Mostrar las estadísticas
        System.out.println("\nEstadisticas del vector:");
        System.out.println("Cantidad de numeros insertados: " + cantidadNumeros);
        System.out.println("Cantidad de numeros primos: " + cantidadPrimos);
        System.out.println("Cantidad de numeros que terminan en cifra impar: " + cantidadImpares);
        
        if (repetido) {
            System.out.println("El programa se detuvo porque se intento insertar un número que ya estaba en el vector.");
        } else {
            System.out.println("El programa termino porque se llenó el vector sin insertar numeros repetidos.");
        }
    }
    
    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // Función para determinar si un número termina en cifra impar
    public static boolean terminaEnImpar(int numero) {
        return numero % 10 % 2 != 0;
    }
}
