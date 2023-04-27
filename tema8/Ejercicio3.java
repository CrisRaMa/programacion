package tema8;

public class Ejercicio3 {
    public static int siguientePrimo(int x) {
        while (!Ejercicio2.esPrimo(++x)) {};
        return x;
        }
        
}
