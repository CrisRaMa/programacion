package tema7;

public class Ejercicio9 {
    public static void main(String[] args) {
    int[] numero = new int[8];
    for (int i = 0; i < 8; i++) {
    System.out.println("Introduzca un número entero:");
    numero[i] = Integer.parseInt(System.console().readLine());
    System.out.println(numero[i] + (numero[i] % 2 == 0 ? " par" : " impar"));
    }
    }
    }