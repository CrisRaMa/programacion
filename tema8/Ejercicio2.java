package tema8;

public class Ejercicio2{

public static boolean esPrimo(long n) {
    if (n < 2) {
    return false;
    } else {
    for (long i = n / 2; i >= 2; i--) {
    if (n % i == 0) {
    return false;
    }
    }
    }
    return true;
    }}