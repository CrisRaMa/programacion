package Ejercicio3;

public class Gato extends Mascotas {
    private String color;
    private boolean peloLargo;
    
    // Constructor
    public Gato(String nombre, int edad, boolean estado, int fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    
    // Métodos de instancia
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Soy un gato de color " + this.color + " y " + (this.peloLargo ? "tengo" : "no tengo") + " pelo largo");
    }
    
    @Override
    public void habla() {
        System.out.println("Miau! Soy " + this.getNombre() + ", un gato de color " + this.color);
    }
    
    // Métodos getter y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
}
