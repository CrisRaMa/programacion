package tema14;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Provocar StackOverflowError");
            System.out.println("2. Provocar NumberFormatException");
            System.out.println("3. Provocar ArrayIndexOutOfBoundsException");
            System.out.println("4. Provocar FileNotFoundException");
            System.out.println("5. Provocar ArithmeticException");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            try {
                switch (opcion) {
                    case 1:
                        funcion1();
                        break;
                    case 2:
                        funcion2();
                        break;
                    case 3:
                        funcion3();
                        break;
                    case 4:
                        funcion4();
                        break;
                    case 5:
                        funcion5();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (StackOverflowError e) {
                System.out.println("Excepción capturada: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Excepción capturada: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Excepción capturada: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("Excepción capturada: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Excepción capturada: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
        } while (opcion != 6);
    }

    private static void funcion1() {
        funcion1();
    }

    private static void funcion2() {
        String cadena = "abc";
        int numero = Integer.parseInt(cadena);
    }

    private static void funcion3() {
        int[] arreglo = {1, 2, 3};
        int numero = arreglo[3];
    }

    private static void funcion4() throws FileNotFoundException {
        throw new FileNotFoundException("Archivo no encontrado");
    }

    private static void funcion5() {
        int a = 1;
        int b = 0;
        int resultado = a / b;
    }
}
