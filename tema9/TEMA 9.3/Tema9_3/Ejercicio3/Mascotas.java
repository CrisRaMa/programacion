package Ejercicio3;


public abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected boolean estado;
    protected int fechaNacimiento;
    protected String tipo; 
    
    // Constructor
    public Mascotas(String nombre, int edad, boolean estado, int fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Métodos de instancia
    public void mostrarDatos() {
        System.out.println("Soy " + this.nombre + ", tengo " + this.edad + " años y estoy " + (this.estado ? "vivo" : "muerto"));
    }
    
    public void cumpleanos() {
        this.edad++;
        System.out.println("Feliz cumpleaños, " + this.nombre + "! Ahora tienes " + this.edad + " años");
    }
    
    public void morir() {
        this.estado = false;
        System.out.println("Lamentamos informar que " + this.nombre + " ha fallecido");
    }
    
    public void habla() {
        System.out.println("Hola, soy " + this.nombre);
    }
    
    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}