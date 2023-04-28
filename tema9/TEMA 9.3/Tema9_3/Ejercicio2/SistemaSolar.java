package Ejercicio2_Astros;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemaSolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear algunos planetas y satélites
        Planeta mercurio = new Planeta(3.285E23, 4.880E3, 58.65, 87.97, 5.790E7);
        Satelite luna = new Satelite(7.342E22, 3.474E3, 27.32, 27.32, 3.844E5);
        mercurio.getSatelites().add(luna);

        Planeta venus = new Planeta(4.867E24, 12.104E3, -243.02, 224.70, 1.082E8);

        Planeta tierra = new Planeta(5.972E24, 12.742E3, 0.99, 365.25, 1.496E8);
        Satelite lunaTierra = new Satelite(7.342E22, 3.474E3, 27.32, 27.32, 3.844E5);
        tierra.getSatelites().add(lunaTierra);

        Planeta marte = new Planeta(6.390E23, 6.779E3, 1.03, 686.98, 2.279E8);

        // Agregar los planetas a una lista
        List<Astro> astros = new ArrayList<Astro>();
        astros.add(mercurio);
        astros.add(venus);
        astros.add(tierra);
        astros.add(marte);

        boolean salir = false;

        while (!salir) {
            // Mostrar el menú principal
            System.out.println("Seleccione una opción:");
            System.out.println("1) Mostrar información de un astro");
            System.out.println("2) Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar un menú para que el usuario elija un planeta o satélite
                    System.out.println("Seleccione un astro:");
                    for (int i = 0; i < astros.size(); i++) {
                        System.out.println((i + 1) + ") " + astros.get(i).getClass().getSimpleName());
                    }
                    int opcionAstro = scanner.nextInt();
                    Astro astroSeleccionado = astros.get(opcionAstro - 1);

                    // Mostrar la información del astro seleccionado
                    astroSeleccionado.mostrarInformacion();
                    break;
                case 2:
                    // Salir del programa
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        scanner.close();
    }
}
