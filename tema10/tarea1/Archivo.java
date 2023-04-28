package tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nGESTISIMAL");
            System.out.println("===========");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    listado();
                    break;
                case 2:
                    alta();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificacion();
                    break;
                case 5:
                    entradaMercancia();
                    break;
                case 6:
                    salidaMercancia();
                    break;
                case 7:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("La opción introducida no es válida.");
            }

        } while (opcion != 7);
    }

    public static void listado() {
        System.out.println("\nListado");
        System.out.println("=======");
        for (Articulo a : articulos) {
            System.out.println(a);
        }
    }

    public static void alta() {
        System.out.println("\nAlta");
        System.out.println("=====");
        String codigo, descripcion;
        double precioCompra, precioVenta;
        int stock;

        System.out.print("Introduzca el código del artículo: ");
        codigo = sc.nextLine();
        System.out.print("Introduzca la descripción del artículo: ");
        descripcion = sc.nextLine();
        System.out.print("Introduzca el precio de compra: ");
        precioCompra = Double.parseDouble(sc.nextLine());
        System.out.print("Introduzca el precio de venta: ");
        precioVenta = Double.parseDouble(sc.nextLine());
        System.out.print("Introduzca el stock del artículo: ");
        stock = Integer.parseInt(sc.nextLine());

        articulos.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
        System.out.println("Artículo dado de alta correctamente.");
    }

    public static void baja() {
        System.out.println("\nBaja");
        System.out.println("=====");
        String codigo;
        System.out.print("Introduzca el código del artículo a dar de baja: ");
        codigo = sc.nextLine();
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getCodigo().equals(codigo)) {
                articulos.remove(i);
                System.out.println("Artículo eliminado correctamente.");
                return;
            }
        }
        System.out.println("El artículo con el código " + codigo + " no existe.");
    }

    public static void modificacion() {
        System.out.println("\nModificación");
        System.out.println("============");
        String codigo, descripcion;
        double precioCompra, precioVenta;
        int stock;
        System.out.print("Introduzca el código del artículo a modificar: ");
       
        public static void listarArticulos(ArrayList<Articulo> articulos) {
            System.out.println("Listado de artículos:");
            System.out.println("====================");
            for (Articulo articulo : articulos) {
                System.out.println(articulo);
            }
        }
    
        public static void borrarArticulo(ArrayList<Articulo> articulos, Scanner scanner) {
            System.out.print("Introduce el código del artículo que deseas borrar: ");
            String codigo = scanner.nextLine();
            boolean encontrado = false;
            for (Articulo articulo : articulos) {
                if (articulo.getCodigo().equals(codigo)) {
                    articulos.remove(articulo);
                    System.out.println("Artículo borrado correctamente.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se ha encontrado ningún artículo con ese código.");
            }
        }
    
        public static void main(String[] args) {
            ArrayList<Articulo> articulos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int opcion;
            do {
                mostrarMenu();
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        anyadirArticulo(articulos, scanner);
                        break;
                    case 2:
                        modificarPrecio(articulos, scanner);
                        break;
                    case 3:
                        listarArticulos(articulos);
                        break;
                    case 4:
                        borrarArticulo(articulos, scanner);
                        break;
                    case 5:
                        System.out.println("Fin del programa.");
                        break;
                    default:
                        System.out.println("Opción incorrecta. Introduce una opción del 1 al 5.");
                }
            } while (opcion != 5);
            scanner.close();
        }
    }
    