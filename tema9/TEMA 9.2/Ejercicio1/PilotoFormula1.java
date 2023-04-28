package Tema9_2.Ejercicio1;
public class PilotoFormula1 {
    private String nombre;
    private int edad;
    private String equipo;
    private int numero;

    public PilotoFormula1(String nombre, int edad, String equipo, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}