package Tema14Continuacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Vehiculo vehiculo = null;
        
        while (!salir) {
            System.out.println("1. Crear coche");
            System.out.println("2. Crear camion");
            System.out.println("3. Crear moto");
            System.out.println("4. Salir");

            try {
                System.out.print("Introduce una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce la cilindrada: ");
                        int cilindrada = getIntInput(sc);
                        vehiculo = new Coche(cilindrada);
                        break;
                    case 2:
                        System.out.print("Introduce la capacidad de carga: ");
                        int capacidadCarga = getIntInput(sc);
                        vehiculo = new Camion(capacidadCarga);
                        break;
                    case 3:
                        System.out.print("Introduce el número de marchas: ");
                        int numMarchas = getIntInput(sc);
                        vehiculo = new Moto(numMarchas);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
                
                if (vehiculo != null) {
                    System.out.println("Has creado un " + vehiculo.getClass().getSimpleName() + " con éxito");
                    vehiculo.arrancar();
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido");
                sc.nextLine(); // Limpiar buffer de entrada
            }
        }
        sc.close();
    }

    private static int getIntInput(Scanner sc) {
        String input = sc.next();
        while (!isNumeric(input)) {
            System.out.println("Introduce un número válido");
            input = sc.next();
        }
        return Integer.parseInt(input);
    }

    // comprueba si la cadena es un número
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
    
    public void arrancar() {
        System.out.println("Arrancando " + this.getClass().getSimpleName() + "...");
    }
}
