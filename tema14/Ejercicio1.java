package tema14;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Conexión a la base de datos
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_base_de_datos", "usuario", "contraseña");
            Statement stmt = conn.createStatement();
            
            // Verificación de credenciales
            boolean accesoPermitido = false;
            do {
                String usuario = pedirUsuario();
                String contrasena = pedirContrasena();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE nombre_usuario='" + usuario + "' AND contrasena='" + contrasena + "'");
                if (rs.next()) {
                    accesoPermitido = true;
                } else {
                    System.out.println("Usuario o contraseña incorrectos. Vuelve a intentarlo.");
                }
            } while (!accesoPermitido);

            // Programa protegido por acceso de usuario
            int altura = pedirAltura();
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String pedirUsuario() {
        System.out.print("Introduce tu nombre de usuario: ");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        scanner.close();
        return usuario;
    }


    public static String pedirContrasena() {
        System.out.print("Introduce tu contraseña: ");
        Scanner scanner = new Scanner(System.in);
        String contrasena = scanner.nextLine();
        scanner.close();
        return contrasena;
    }

    public static int pedirAltura() {
        System.out.print("Introduce la altura de la pirámide: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        scanner.close();
        return altura;
    }
}
