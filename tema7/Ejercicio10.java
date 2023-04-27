package tema7;

import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] n = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int pares = 0, impares = 0;

        // Inicializa el array n con números aleatorios
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 101);
        }

        for (int i = 0; i < 20; i++) {
            if (n[i] % 2 == 0) {
                par[pares++] = n[i];
            } else {
                impar[impares++] = n[i];
            }
        }
        
        System.out.println("Array original:\n" + Arrays.toString(n));

        for (int i = 0; i < pares; i++) {
            n[i] = par[i];
        }
        
        for (int i = pares; i < 20; i++) {
            n[i] = impar[i - pares];
        }
        
        System.out.println("Array con los pares al principio:\n" + Arrays.toString(n));
    }
}
