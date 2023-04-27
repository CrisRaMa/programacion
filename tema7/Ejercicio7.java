package tema7;

public class Ejercicio7 {
  public static void main(String[] args) {
    int[] numero = new int[100];
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    for (int i = 0; i < numero.length; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + " ");
    }
    
    System.out.print("\nIntroduzca un número de los que se han mostrado: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
    int valor2 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    for (int num : numero) {
      System.out.print(num == valor1 ? verde + "\"" + valor2 + "\" " : blanco + num + " ");
    }
    
    System.out.println();
  }
}
