package Tema9_2.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Relámpago", 5, 1.6, 600, "Blanco", "Pura Sangre Inglés", 'M', "Saludable", "Nervioso", 2);
        Caballo caballo2 = new Caballo("Estrella", 7, 1.4, 550, "Negro", "Frisón", 'H', "Saludable", "Tranquilo", 4);
        Caballo caballo3 = new Caballo("Fuego", 4, 1.7, 700, "Marrón", "Andaluz", 'M', "Enfermo", "Asustadizo", 1);
        
        System.out.println(caballo1.toString());
        caballo1.caminar();
        caballo1.competir();
        
        System.out.println(caballo2.toString());
        caballo2.trotar();

        System.out.println(caballo3.toString());
        caballo3.serAlimentado();

        



    }
}    