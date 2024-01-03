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

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class validacionSQL {

// instancias
    conexionSQL SQL = new conexionSQL();

    private String usuario;
    private Connection conexion;
    private PreparedStatement consulta = null;
    private ResultSet resultado = null;

    public boolean verificarSiExiste() {
        String consultaExiste = "SELECT usuario FROM Login WHERE usuario = ?";
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(consultaExiste);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (usuario.isBlank()) {
                return false;
                //System.out.println("No se escribio usuario");
            } else if (resultado.next()) {
                return true;
                //System.out.println("Usuario ya existe");
            } else {
                return false;
                //System.out.println("Usuario no existe");
            }
        } catch (SQLException ex) {
            return false;
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

    public boolean materiaRepetida(String nombre_materia, String curso) {
        try {
            String solicitarMateria = "SELECT nombre_materia FROM Materia WHERE nombre_materia= ? AND curso= ?";
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(solicitarMateria);
            consulta.setString(1, nombre_materia);
            consulta.setString(2, curso);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(validacionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    public void guardarUsuario(String usuario) {
        this.usuario = usuario;
    }
}
