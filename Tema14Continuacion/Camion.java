package Tema14Continuacion;
public class Camion extends Vehiculo {
    private int capacidadCarga; // capacidad de carga en toneladas
    
    public Camion(int cc) {
        super();
        this.capacidadCarga = cc;
    }
    
    public void transportaMercancias() {
        System.out.println("Transportando mercancías...");
    }
}