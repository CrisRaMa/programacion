package Ejercicio3;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    // Constructor
    public Loro(String nombre, int edad, boolean estado, int fechaNacimiento, int pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    // Métodos de instancia
    public void saluda() {
        System.out.println("Hola! Soy " + this.getNombre() + ", un loro " + this.getOrigen() + " que sabe hablar.");
    }

    // Override de método volar para loros
    @Override
    public void volar() {
        System.out.println("Soy " + this.getNombre() + ", un loro " + this.getOrigen() + " y estoy volando.");
    }

    // Métodos getter y setter
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
}