package Ejercicio3;

public abstract class Aves extends Mascotas {
    private int pico;
    private boolean vuela;
    
    // Constructor
    public Aves(String nombre, int edad, boolean estado, int fechaNacimiento, int pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    // Métodos de instancia
    public void volar() {
        if (this.vuela) {
            System.out.println("Soy " + this.getNombre() + " y estoy volando.");
        } else {
            System.out.println("Soy " + this.getNombre() + " y no puedo volar.");
        }
    }
    
    // Métodos getter y setter
    public int getPico() {
        return pico;
    }

    public void setPico(int pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
