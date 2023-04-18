public class Ejercicio2 {
    private static int vehiculosCreados = 0;
    private static double kilometrosTotales = 0;
    
    private double kilometrosRecorridos = 0;
    
    public Vehiculo() {
        vehiculosCreados++;
    }
    
    public void recorrer(double km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }
    
    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
    
    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }
}

public class Bicicleta extends Vehiculo {
    public void anda(double km) {
        recorrer(km);
    }
    
    public void caballito() {
        System.out.println("¡Caballito!");
    }
}

public class Coche extends Vehiculo {
    public void anda(double km) {
        recorrer(km);
    }
    
    public void quemaRueda() {
        System.out.println("¡Quemando rueda!");
    }
}
