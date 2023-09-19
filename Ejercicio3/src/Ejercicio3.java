import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] numeros;
        int[] primos;
        int[] perfectos;
        int cantidadPrimos = 0;
        int cantidadPerfectos = 0;
        
        // Pedir al usuario que ingrese el valor de n
        do {
            System.out.print("Ingrese la cantidad de numeros a clasificar (1 < n < 200): ");
            n = sc.nextInt();
        } while (n <= 1 || n >= 200);
        
        // Inicializar los arreglos de acuerdo a n
        numeros = new int[n];
        primos = new int[n];
        perfectos = new int[n];
        
        // Pedir al usuario que ingrese los valores del arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Clasificar los números en primos o perfectos
        for (int i = 0; i < n; i++) {
            if (esPrimo(numeros[i])) {
                primos[cantidadPrimos] = numeros[i];
                cantidadPrimos++;
            }
            
            if (esPerfecto(numeros[i])) {
                perfectos[cantidadPerfectos] = numeros[i];
                cantidadPerfectos++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Numeros primos:");
        for (int i = 0; i < cantidadPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        
        System.out.println("\nNumeros perfectos:");
        for (int i = 0; i < cantidadPerfectos; i++) {
            System.out.print(perfectos[i] + " ");
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
    
    // Función para determinar si un número es perfecto
    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;
        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        
        return sumaDivisores == numero;
    }
}
