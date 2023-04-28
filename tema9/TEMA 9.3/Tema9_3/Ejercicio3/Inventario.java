package Ejercicio3;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Mascotas> animales;
    // Constructor
    public Inventario() {
        animales = new ArrayList<Mascotas>();
    }
    // Método para mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)
    public void mostrarListaAnimales() {
        System.out.println("Lista de animales:");
        for (Mascotas animal : animales) {
            System.out.println(animal.getTipo() + " - " + animal.getNombre());
        }
    }
    // Método para mostrar todos los datos de un animal concreto
    public void mostrarDatosAnimal(String nombreAnimal) {
        for (Mascotas animal : animales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                System.out.println("Datos del animal:");
                animal.mostrarDatos();
                return;
            }
        }
        System.out.println("No se encontró el animal con el nombre especificado.");
    }
    // Método para mostrar todos los datos de todos los animales
    public void mostrarTodosLosDatos() {
        System.out.println("Datos de todos los animales:");
        for (Mascotas animal : animales) {
            animal.mostrarDatos();
        }
    }
    // Método para insertar un animal en el inventario
    public void insertarAnimal(Mascotas animal) {
        animales.add(animal);
        System.out.println("Se ha insertado el animal " + animal.getNombre() + " en el inventario.");
    }
    // Método para eliminar un animal del inventario
    public void eliminarAnimal(String nombreAnimal) {
        for (Mascotas animal : animales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                animales.remove(animal);
                System.out.println("Se ha eliminado el animal " + animal.getNombre() + " del inventario.");
                return;
            }
        }
        System.out.println("No se encontró el animal con el nombre especificado.");
    }
    // Método para vaciar el inventario
    public void vaciarInventario() {
        animales.clear();
        System.out.println("Se ha vaciado el inventario.");
    }
}
