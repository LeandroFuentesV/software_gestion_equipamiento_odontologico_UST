package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/sistemalabotaristadental1"; // URL de la base de datos
    private static final String USER = "root"; // Usuario
    private static final String PASSWORD = "1234"; // Contraseña

    public static Connection conectar() {
        Connection con = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); // Asegúrate de tener el driver correcto

            // Establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: controlador no encontrado: " + e.getMessage());
            throw new RuntimeException("Controlador no encontrado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
            throw new RuntimeException("Error al crear la conexión");
        }
        return con; 
    }
}
