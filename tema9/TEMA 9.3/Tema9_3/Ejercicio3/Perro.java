package Ejercicio3;

public class Perro extends Mascotas {
    private String raza;
    private boolean pulgas;
    
    // Constructor
    public Perro(String nombre, int edad, boolean estado, int fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    // Métodos de instancia
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Soy un perro de raza " + this.raza + " y " + (this.pulgas ? "tengo" : "no tengo") + " pulgas");
    }
    
    @Override
    public void habla() {
        System.out.println("Guau guau! Soy " + this.getNombre() + ", un perro de raza " + this.raza);
    }
    
    // Métodos getter y setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
