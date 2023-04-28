package Ejercicio3;

public class Canario extends Aves {
    private String color;
    private boolean canta;

    // Constructor
    public Canario(String nombre, int edad, boolean estado, int fechaNacimiento, int pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    // Métodos de instancia
    public void habla() {
        System.out.println("Soy " + this.getNombre() + ", un canario de color " + this.getColor() + ", y " + (this.canta ? "sé cantar." : "no sé cantar."));
    }

    // Override de método volar para canarios
    @Override
    public void volar() {
        System.out.println("Soy " + this.getNombre() + ", un canario de color " + this.getColor() + " y estoy volando.");
    }

    // Métodos getter y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
}