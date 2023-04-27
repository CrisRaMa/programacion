package Tema9_2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        PilotoFormula1 piloto = new PilotoFormula1("Lewis Hamilton", 36, "Mercedes", 44);
        PilotoFormula1 piloto1 = new PilotoFormula1("Max Verstappen", 24, "Red Bull Racing", 33);
        PilotoFormula1 piloto2 = new PilotoFormula1("Valtteri Bottas", 32, "Mercedes", 77);
        PilotoFormula1 piloto3 = new PilotoFormula1("Charles Leclerc", 24, "Ferrari", 16);

        System.out.println("Nombre: "+piloto.getNombre()); 
        System.out.println("Edad: "+piloto.getEdad()); 
        System.out.println("Equipo: "+piloto.getEquipo()); 
        System.out.println("Número: "+piloto.getNumero()); 
        System.out.println("----------------------------");

        System.out.println("Nombre: "+piloto1.getNombre()); 
        System.out.println("Edad: "+piloto1.getEdad()); 
        System.out.println("Equipo: "+piloto1.getEquipo()); 
        System.out.println("Número: "+piloto1.getNumero()); 
        System.out.println("----------------------------");


        System.out.println("Nombre: "+piloto2.getNombre()); 
        System.out.println("Edad: "+piloto2.getEdad()); 
        System.out.println("Equipo: "+piloto2.getEquipo()); 
        System.out.println("Número: "+piloto2.getNumero()); 
        System.out.println("----------------------------");


        System.out.println("Nombre: "+piloto3.getNombre()); 
        System.out.println("Edad: "+piloto3.getEdad()); 
        System.out.println("Equipo: "+piloto3.getEquipo()); 
        System.out.println("Número: "+piloto3.getNumero()); 

    }
}
