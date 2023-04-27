package tema14;


import java.sql.*;
import java.util.Scanner;

public class Ejercicio2 {

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
                    System.out.println("¡Bienvenido " + usuario + "!");
                    if (usuario.equals("admin")) {
                        gestionarUsuarios(stmt);
                    } else {
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
                    }
                } else {
                    System.out.println("Usuario o contraseña incorrectos. Vuelve a intentarlo.");
                }
            } while (!accesoPermitido);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String pedirUsuario() {
        System.out.print("Introduce tu nombre de usuario: ");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        return usuario;
    }

    public static String pedirContrasena() {
        System.out.print("Introduce tu contraseña: ");
        Scanner scanner = new Scanner(System.in);
        String contrasena = scanner.nextLine();
        return contrasena;
    }

    public static int pedirAltura() {
        System.out.print("Introduce la altura de la pirámide: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        return altura;
    }

    public static void gestionarUsuarios(Statement stmt) throws SQLException {
        System.out.println("Bienvenido al gestor de usuarios");
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Añadir usuario");
            System.out.println("2. Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre de usuario: ");
                    String nuevoUsuario = scanner.next();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE nombre_usuario='" + nuevoUsuario + "'");
                    if (rs.next()) {
                        System.out.println("El nombre de usuario ya existe. Introduce otro.");
                    } else {
                        System.out.print("Introduce la contraseña: ");
                        String contrasena = scanner.next();
                        stmt.executeUpdate("INSERT INTO usuarios VALUES ('" + nuevoUsuario + "', '" + contrasena + "')");
                        System.out.println("Usuario añadido correctamente.");
                    }
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Introduce otra.");
                    break;
            }
        }
    }
}
