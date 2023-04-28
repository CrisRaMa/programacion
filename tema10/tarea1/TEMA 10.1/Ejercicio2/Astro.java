package Ejercicio2_Astros;

public class Astro {
    // Clase base Astro
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;

    // Constructor
    public Astro(double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    // Métodos para recuperar y almacenar atributos
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    // Método para mostrar la información del objeto
    public void mostrarInformacion() {
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Periodo de rotación: " + periodoRotacion);
        System.out.println("Periodo de traslación: " + periodoTraslacion);
        System.out.println("Distancia media: " + distanciaMedia);
    }
}
