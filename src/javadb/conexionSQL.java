package javadb;

import java.sql.*;


public class conexionSQL {

    private final String sqlUrl = "jdbc:mysql://localhost:3306/Institucion";
    private final String sqlUser = "root";
    private final String sqlPassword = "admin";
    private Connection conexion = null;

    public void conectar() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                //System.out.println("Falló la carga del driver JDBC MySQL");
            }
            conexion = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            //System.out.println("Conexión entre Java y MySQL con éxito");
            //JOptionPane.showMessageDialog(null, "Base de datos conectada con éxito");
        } catch (SQLException ex) {
            //System.out.println("Usuario o contraseña incorrecto de MySQL");
            //JOptionPane.showMessageDialog(null, "BD: Fallo el login del servidor");
        }
    }
    public Connection getConexion() {
        return conexion;
    }
}
