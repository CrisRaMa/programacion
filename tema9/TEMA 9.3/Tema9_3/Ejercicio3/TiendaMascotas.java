package Ejercicio3;

import java.util.Scanner;

public class TiendaMascotas {
    private static Scanner scanner = new Scanner(System.in);
    private static Inventario inventario = new Inventario();

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("========== Menú ==========");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar datos de un animal");
            System.out.println("3. Mostrar todos los datos de los animales");
            System.out.println("4. Insertar animal en el inventario");
            System.out.println("5. Eliminar animal del inventario");
            System.out.println("6. Vaciar el inventario");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarListaAnimales();
                    break;
                case 2:
                    mostrarDatosAnimal();
                    break;
                case 3:
                    mostrarTodosLosDatos();
                    break;
                case 4:
                    insertarAnimal();
                    break;
                case 5:
                    eliminarAnimal();
                    break;
                case 6:
                    vaciarInventario();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }

            System.out.println();
            // Creamos instancias de cada clase con fecha de nacimiento en formato Date
            Perro perro1 = new Perro("Fido", 3, true, 2020, "Chihuahua", false);
            Perro perro2 = new Perro("Rex", 5, false, 2019, "Labrador", true);

            Gato gato1 = new Gato("Garfield", 2, true, 2021, "Naranja", true);
            Gato gato2 = new Gato("Salem", 4, true, 2017, "Negro", false);

            Aves loro1 = new Loro("Paco", 1, false, 2009, 10, true, "España", true);
            Aves loro2 = new Loro("Kiko", 2, true, 2012, 13, false, "Sudafrica", false );

            Aves canario1 = new Canario("Tweety", 4, true, 2019, 2, true, "Corto", true);
            Aves canario2 = new Canario("Piolín", 1, false, 2016, 1, false, "Largo", false);

            // Agregamos las instancias al inventario
            Inventario inventario = new Inventario();
            inventario.insertarAnimal(perro1);
            inventario.insertarAnimal(perro2);
            inventario.insertarAnimal(gato1);
            inventario.insertarAnimal(gato2);
            inventario.insertarAnimal(loro1);
            inventario.insertarAnimal(loro2);
            inventario.insertarAnimal(canario1);
            inventario.insertarAnimal(canario2);

        }
    }

    private static void mostrarListaAnimales() {
        System.out.println("========== Lista de Animales ==========");
        inventario.mostrarListaAnimales();
    }

    private static void mostrarDatosAnimal() {
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.println("========== Datos del Animal ==========");
        inventario.mostrarDatosAnimal(nombre);
    }

    private static void mostrarTodosLosDatos() {
        System.out.println("========== Datos de Todos los Animales ==========");
        inventario.mostrarTodosLosDatos();
    }

    private static void insertarAnimal() {
        System.out.println("Ingrese el tipo de animal que desea insertar:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Loro");
        System.out.println("4. Canario");
        int tipo = scanner.nextInt();

        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del animal: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el estado del animal (true o false): ");
        boolean estado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento del animal (año de nacimiento): ");
        String fechaNacimientoString = scanner.nextLine();
        int fechaNacimiento = 0;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese la raza del perro:");
                String raza = scanner.nextLine();
    
                System.out.println("¿Tiene pulgas el perro? (s/n): ");
                boolean pulgas = scanner.nextLine().equalsIgnoreCase("s");
    
                Perro perro = new Perro(nombre, edad, estado, fechaNacimiento, raza, pulgas);
                inventario.insertarAnimal(perro);
                break;
            case 2:
                System.out.println("Ingrese el color del gato:");
                String color = scanner.nextLine();
    
                System.out.println("¿El gato tiene pelo largo? (s/n)");
                boolean peloLargo = scanner.nextLine().equalsIgnoreCase("s");
    
                Gato gato = new Gato(nombre, edad, estado, fechaNacimiento, color, peloLargo);
                inventario.insertarAnimal(gato);
                break;
            case 3:
                System.out.println("Ingrese el tamaño del pico del loro:");
                int pico = scanner.nextInt();
    
                System.out.println("¿El loro puede volar? (s/n)");
                boolean vuela = scanner.nextLine().equalsIgnoreCase("s");

                System.out.println("Ingrese el país de origen del loro:");
                String origen = scanner.nextLine();

                System.out.println("¿El loro puede hablar? (s/n)");
                boolean habla = scanner.nextLine().equalsIgnoreCase("s");

    
                Loro loro = new Loro(nombre, edad, estado, fechaNacimiento, pico, vuela, origen, habla);
                inventario.insertarAnimal(loro);
                break;
            case 4:
                System.out.println("Ingrese el tamaño del pico del canario:");
                int picoCanario = scanner.nextInt();
    
                System.out.println("¿El canario puede volar? (s/n)");
                boolean vuelaCanario = scanner.nextLine().equalsIgnoreCase("s");

                System.out.println("¿De que color es el canario?");
                String colorCanario = scanner.nextLine();

                System.out.println("¿El canario puede cantar? (s/n)");
                boolean cantaCanario = scanner.nextLine().equalsIgnoreCase("s");
    
                Canario canario = new Canario(nombre, edad, estado, fechaNacimiento, picoCanario, vuelaCanario, colorCanario,cantaCanario);
                inventario.insertarAnimal(canario);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void eliminarAnimal() {
            System.out.println("Seleccione el tipo de animal que desea eliminar:");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Loro");
            System.out.println("4. Canario");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del perro a eliminar: ");
                    String nombrePerro = scanner.nextLine();
                    inventario.eliminarAnimal(nombrePerro + "perro");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del gato a eliminar: ");
                    String nombreGato = scanner.nextLine();
                    inventario.eliminarAnimal(nombreGato + "gato");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del loro a eliminar: ");
                    String nombreLoro = scanner.nextLine();
                    inventario.eliminarAnimal(nombreLoro + "loro");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del canario a eliminar: ");
                    String nombreCanario = scanner.nextLine();
                    inventario.eliminarAnimal(nombreCanario + "canario");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
    }

        
    public static void vaciarInventario() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Está seguro que desea vaciar el inventario? (S/N)");
            String opcion = scanner.nextLine();
            if(opcion.equalsIgnoreCase("S")) {
                inventario.vaciarInventario();
                System.out.println("El inventario ha sido vaciado exitosamente.");
            } else if(opcion.equalsIgnoreCase("N")) {
                System.out.println("El inventario no ha sido vaciado.");
            } else {
                System.out.println("Opción no válida. El inventario no ha sido vaciado.");
            }
    }

}        