package tema7;


import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }
        
        int[] cuadrados = Arrays.stream(numeros).map(n -> n * n).toArray();
        int[] cubos = Arrays.stream(numeros).map(n -> n * n * n).toArray();
        
        System.out.println("n | n² | n³\n--|----|-----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%2d|%3d |%4d\n", numeros[i], cuadrados[i], cubos[i]);
        }
    }
}

