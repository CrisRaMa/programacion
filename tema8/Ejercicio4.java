package tema8;

public class Ejercicio4 {
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
        return 1;
        }
        if (exponente < 0) {
        return 1/potencia(base, -exponente);
        }
        int n = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
        n = n * base;
        }
        return n;
        }
        
}
