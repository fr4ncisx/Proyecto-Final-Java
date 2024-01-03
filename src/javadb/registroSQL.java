/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class registroSQL {

    // instancias
    conexionSQL SQL = new conexionSQL();
    
    private String usuario, password, nombre, apellido, correo, curso, nombreTutor, apellidoTutor, tipo_Profe, materia;
    private long DNI, telefono, CUIL;
    private PreparedStatement consulta = null;
    private ResultSet resultado = null;
    private Connection conexion;

    public void registrarEstudiante() {
        String insertarAlumnoLogin = "INSERT INTO Login (usuario, password, rol) VALUES (?, ?, ?)";
        String insertarAlumno = "INSERT INTO Estudiante (usuario_estudiante, nombre, apellido, DNI, correo, telefono, curso_estudiante, nTutor, aTutor) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            // Tabla Estudiante
            consulta = conexion.prepareStatement(insertarAlumno);
            consulta.setString(1, usuario);
            consulta.setString(2, nombre);
            consulta.setString(3, apellido);
            consulta.setLong(4, DNI);
            consulta.setString(5, correo);
            consulta.setLong(6, telefono);
            consulta.setString(7, curso);
            consulta.setString(8, nombreTutor);
            consulta.setString(9, apellidoTutor);
            consulta.executeUpdate();

            // Tabla Login
            consulta = conexion.prepareStatement(insertarAlumnoLogin);
            consulta.setString(1, usuario);
            consulta.setString(2, password);
            consulta.setString(3, "Estudiante");
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente :)");

        } catch (SQLException ex) {
            //ex.printStackTrace();
            System.out.println("Error al registrar el usuario en la base de datos.");
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (consulta != null) {
                    consulta.close();
                }
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(validacionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void registrarProfesor() {
        String insertProfeLogin = "INSERT INTO Login (usuario, password, rol) VALUES (?, ?, ?)";
        String insertProfe = "INSERT INTO Profesor (usuario_profesor, nombre, apellido, CUIL, correo, telefono, tProfesor, materia, curso_profe) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
        String insertMateria = "INSERT INTO Materia (nombre_materia, curso) VALUES (?, ?)";
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            // Tabla Profesor
            consulta = conexion.prepareStatement(insertProfe);
            consulta.setString(1, usuario);
            consulta.setString(2, nombre);
            consulta.setString(3, apellido);
            consulta.setLong(4, CUIL);
            consulta.setString(5, correo);
            consulta.setLong(6, telefono);
            consulta.setString(7, tipo_Profe);
            consulta.setString(8, materia);
            consulta.setString(9, curso);
            consulta.executeUpdate();
            // Tabla Login
            consulta = conexion.prepareStatement(insertProfeLogin);
            consulta.setString(1, usuario);
            consulta.setString(2, password);
            consulta.setString(3, "Profesor");
            consulta.executeUpdate();
            //Tabla Materia
            consulta = conexion.prepareStatement(insertMateria);
            consulta.setString(1, materia);
            consulta.setString(2, curso);
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente :)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (consulta != null) {
                    consulta.close();
                }
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(validacionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void guardarUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void guardarDatosEstudiante(String usuario, String password, String nombre, String apellido, long DNI, long telefono, String correo, String curso, String nombreTutor, String apellidoTutor) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.correo = correo;
        this.curso = curso;
        this.nombreTutor = nombreTutor;
        this.apellidoTutor = apellidoTutor;

    }

    public void guardarDatosProfe(String usuario, String password, String nombre, String apellido, String correo, String curso, String tipo_Profe, String materia, long telefono, long CUIL) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.curso = curso;
        this.tipo_Profe = tipo_Profe;
        this.materia = materia;
        this.telefono = telefono;
        this.CUIL = CUIL;
    }
}
