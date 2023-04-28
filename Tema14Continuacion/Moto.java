package Tema14Continuacion;
public class Moto extends Vehiculo {
    private int numMarchas; // número de marchas
    
    public Moto(int nm) {
        super();
        this.numMarchas = nm;
    }
    
    public void haceCaballito() {
        System.out.println("Haciendo caballito...");
    }
}