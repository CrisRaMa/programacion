package Ejercicio2_Astros;
import java.util.List;
import java.util.ArrayList;

// Clase Planeta, subclase de Astro
public class Planeta extends Astro {
    private List<Satelite> satelites;

    // Constructor
    public Planeta(double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new ArrayList<Satelite>();
    }

    // Métodos para recuperar y almacenar atributos
    public List<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(List<Satelite> satelites) {
        this.satelites = satelites;
    }

    // Método para mostrar la información del objeto
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Satélites:");
        for (Satelite satelite : satelites) {
            satelite.mostrarInformacion();
        }
    }
}

