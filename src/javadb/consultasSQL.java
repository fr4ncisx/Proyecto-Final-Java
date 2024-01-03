package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemaescolar.MostrarDatosEstudiante;

import sistemaescolar.MostrarDatosProfesor;
import sistemaescolar.iniciarInstanciaEstudiante;
import sistemaescolar.iniciarInstanciaProfesor;

public class consultasSQL implements iniciarInstanciaProfesor, iniciarInstanciaEstudiante {

    conexionSQL SQL = new conexionSQL();

    private String usuario, password, nombre, apellido, correo, curso, nombreTutor, apellidoTutor, rol, materia_tabla, cursoMateria, nombreAlumno, apellidoAlumno, tutorNombreCompleto;
    private long DNI, CUIL, CUILProfe;
    private String nombreProfe, apellidoProfe, correoProfe, cursoProfe, tipoProfe, materia, usuarioProfe, passwordProfe;
    private int telefonoProfe, telefono;
    private Connection conexion;
    private PreparedStatement consulta = null;
    private ResultSet resultado = null;
    private boolean sesionCorrecta = false;
    private String tipo_Profe;

    public void mostrarDatosEstudianteLogin() {
        try {
            String mostrarSQL = "SELECT nombre, apellido, DNI, correo, telefono, curso_estudiante, nTutor, aTutor, usuario_estudiante, password FROM Login, Estudiante WHERE rol='Estudiante' AND usuario=? AND usuario_estudiante=?";
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(mostrarSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                String nombreEstudiante = resultado.getString("nombre");
                String apellidoEstudiante = resultado.getString("apellido");
                int dniEstudiante = resultado.getInt("DNI");
                String correoEstudiante = resultado.getString("correo");
                int telefonoEstudiante = resultado.getInt("telefono");
                String cursoEstudiante = resultado.getString("curso_estudiante");
                String nom_Tutor = resultado.getString("nTutor");
                String ape_Tutor = resultado.getString("aTutor");
                String usuarioEstudiante = resultado.getString("usuario_estudiante");
                String passwordEstudiante = resultado.getString("password");
                estudiante.cargarDatosPersonales(usuarioEstudiante, passwordEstudiante, nombreEstudiante, apellidoEstudiante, correoEstudiante, cursoEstudiante, dniEstudiante, telefonoEstudiante, nom_Tutor, ape_Tutor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public void mostrarDatosProfesorLogin() {
        try {
            String mostrarSQL = "SELECT nombre, apellido, CUIL, correo, telefono, tProfesor, materia, curso_profe, usuario_profesor, password FROM Login, Profesor WHERE rol='Profesor' AND usuario_profesor=? AND usuario=?";
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(mostrarSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombreProfe = resultado.getString("nombre");
                apellidoProfe = resultado.getString("apellido");
                CUILProfe = resultado.getLong("CUIL");
                correoProfe = resultado.getString("correo");
                telefonoProfe = resultado.getInt("telefono");
                cursoProfe = resultado.getString("curso_profe");
                tipoProfe = resultado.getString("tProfesor");
                materia = resultado.getString("materia");
                usuarioProfe = resultado.getString("usuario_profesor");
                passwordProfe = resultado.getString("password");
                profesor.cargarDatosPersonales(usuarioProfe, passwordProfe, nombreProfe, apellidoProfe, correoProfe, materia, tipoProfe, cursoProfe, CUILProfe, telefonoProfe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarDatosEstudianteRegistro() {
        try {
            MostrarDatosEstudiante registroEstudiante = new MostrarDatosEstudiante();
            String mostrarSQL = "SELECT nombre, apellido, DNI, correo, telefono, curso_estudiante, nTutor, aTutor, usuario_estudiante, password FROM Login, Estudiante WHERE rol='Estudiante' AND usuario=? AND usuario_estudiante=?";
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(mostrarSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                String nombreEstudiante = resultado.getString("nombre");
                String apellidoEstudiante = resultado.getString("apellido");
                int dniEstudiante = resultado.getInt("DNI");
                String correoEstudiante = resultado.getString("correo");
                int telefonoEstudiante = resultado.getInt("telefono");
                String cursoEstudiante = resultado.getString("curso_estudiante");
                String nom_Tutor = resultado.getString("nTutor");
                String ape_Tutor = resultado.getString("aTutor");
                String usuarioEstudiante = resultado.getString("usuario_estudiante");
                String passwordEstudiante = resultado.getString("password");
                registroEstudiante.guardarDatosConsulta(usuarioEstudiante, passwordEstudiante, nombreEstudiante, apellidoEstudiante, dniEstudiante, telefonoEstudiante, correoEstudiante, cursoEstudiante, nom_Tutor, ape_Tutor);
                registroEstudiante.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public void mostrarDatosProfesorRegistro() {
        try {
            MostrarDatosProfesor registroProfe = new MostrarDatosProfesor();
            String mostrarSQL = "SELECT nombre, apellido, CUIL, correo, telefono, tProfesor, materia, curso_profe, usuario_profesor, password FROM Login, Profesor WHERE rol='Profesor' AND usuario_profesor=? AND usuario=?";
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(mostrarSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombreProfe = resultado.getString("nombre");
                apellidoProfe = resultado.getString("apellido");
                CUILProfe = resultado.getLong("CUIL");
                correoProfe = resultado.getString("correo");
                telefonoProfe = resultado.getInt("telefono");
                cursoProfe = resultado.getString("curso_profe");
                tipoProfe = resultado.getString("tProfesor");
                materia = resultado.getString("materia");
                usuarioProfe = resultado.getString("usuario_profesor");
                passwordProfe = resultado.getString("password");
                registroProfe.guardarDatosConsulta(usuarioProfe, passwordProfe, nombreProfe, apellidoProfe, CUILProfe, telefonoProfe, correoProfe, cursoProfe, materia, tipoProfe);
                registroProfe.setVisible(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String nombreApellidoEstudiante(String usuario) {
        String nombreSQL = "SELECT nombre,apellido FROM Estudiante WHERE usuario_estudiante=?";
        SQL.conectar();
        conexion = SQL.getConexion();
        try {
            consulta = conexion.prepareStatement(nombreSQL);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
                apellido = resultado.getString("apellido");
                String nombreCompuesto = nombre + "-" + apellido;
                return nombreCompuesto;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
        return null;
    }

    public String cursoEstudiante() {
        String nombreSQL = "SELECT curso_estudiante FROM Estudiante WHERE usuario_estudiante=?";
        SQL.conectar();
        conexion = SQL.getConexion();
        try {
            consulta = conexion.prepareStatement(nombreSQL);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                curso = resultado.getString("curso_estudiante");
                return curso;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
        return null;
    }

    public String nombreProfesor() {
        String nombreSQL = "SELECT nombre FROM Profesor WHERE usuario_profesor=?";
        SQL.conectar();
        conexion = SQL.getConexion();
        try {
            consulta = conexion.prepareStatement(nombreSQL);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
                return nombre;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
        return null;
    }

    public void loginEstudiante() {
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            String consultaSQL = "SELECT usuario,password FROM Login WHERE usuario = ? AND password = ? AND rol='Estudiante'";
            consulta = conexion.prepareStatement(consultaSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, String.valueOf(password));
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                sesionCorrecta = true;
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Usuario o contraseña incorrecto", "ERROR", 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(conexionSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public void loginProfesor() {
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            String consultaSQL = "SELECT usuario,password FROM Login WHERE usuario = ? AND password = ? AND rol='Profesor'";
            consulta = conexion.prepareStatement(consultaSQL);
            consulta.setString(1, usuario);
            consulta.setString(2, String.valueOf(password));
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                sesionCorrecta = true;
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Usuario o contraseña incorrecto", "ERROR", 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(conexionSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public String comprobarRol() {
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            String validarRol = "SELECT rol FROM Login WHERE usuario=?";
            consulta = conexion.prepareStatement(validarRol);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                rol = resultado.getString("rol");
                return rol;
            } else {
                rol = "No tiene rol";
                return rol;
            }
        } catch (SQLException ex) {
            Logger.getLogger(conexionSQL.class.getName()).log(Level.SEVERE, null, ex);
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
        return null;
    }

    public void loginRegistradoProfe() {
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            String validarUsuario = "SELECT usuario_profesor FROM Profesor WHERE usuario_profesor = ?";
            String buscarNombre = "SELECT nombre FROM Profesor WHERE usuario_profesor=?";
            // Buscar usuario en la base de datos
            consulta = conexion.prepareStatement(validarUsuario);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                sesionCorrecta = true;
                //System.out.println("Inicio de sesión exitoso");
            }
            // Pasar nombre a la ventana Login Correcto
            consulta = conexion.prepareStatement(buscarNombre);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
                enviarDatosProfesor();
            }
            mostrarVentanaProfesor(true);
        } catch (SQLException ex) {
            Logger.getLogger(conexionSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public void loginRegistradoEstu() {
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            String validarUsuario = "SELECT usuario_estudiante FROM Estudiante WHERE usuario_estudiante = ?";
            String buscarNombre = "SELECT nombre FROM Estudiante WHERE usuario_estudiante=?";
            // Buscar usuario en la base de datos
            consulta = conexion.prepareStatement(validarUsuario);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                sesionCorrecta = true;
                //System.out.println("Inicio de sesión exitoso");
            }
            // Pasar nombre de bienvenida a la ventana Login Correcto
            consulta = conexion.prepareStatement(buscarNombre);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
                enviarNombreEstudiante();
                enviarDatosEstudiante();
                estudiante.obtenerCurso(curso, usuario);
            }
            mostrarVentanaEstudiante(true);
        } catch (SQLException ex) {
            Logger.getLogger(conexionSQL.class.getName()).log(Level.SEVERE, null, ex);
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

    public void enviarMateriasTablaEstu(String curso) {
        String consultaMaterias = "SELECT nombre_materia FROM Materia WHERE curso=?";
        boolean hayResultados = false;
        try {

            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(consultaMaterias);
            consulta.setString(1, curso);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                hayResultados = true;
                materia = resultado.getString(1);
                enviarDatosTablaMateria(materia, curso);
            }
            if (!hayResultados) {
                enviarDatosTablaMateria("No hay materias en este curso", "");
                //System.out.println("No hay resultados");
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (consulta != null) {
                    consulta.close();
                }
                //conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarProfesoresTablaEstu(String curso) {
        String consultaProfesores = "SELECT nombre,apellido FROM Profesor WHERE curso_profe=?";
        boolean hayResultados = false;
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(consultaProfesores);
            consulta.setString(1, curso);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                hayResultados = true;
                nombreProfe = resultado.getString(1);
                apellidoProfe = resultado.getString(2);
                String nombreCompleto = nombreProfe + " " + apellidoProfe;
                enviarDatosTablaProfesor(nombreCompleto, curso);
            }
            if (!hayResultados) {
                enviarDatosTablaProfesor("No hay profesores en este curso", "");
                //System.out.println("No hay resultados");
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarAulaTablaEstu(String curso, String usuario) {
        String consultaAula = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante=? AND (NOT nombre=? AND NOT apellido=?)";
        boolean hayResultados = false;
        String nombreString = nombreApellidoEstudiante(usuario);
        String[] nombreSeparado = nombreString.split("-");
        nombre = nombreSeparado[0];
        apellido = nombreSeparado[1];
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(consultaAula);
            consulta.setString(1, curso);
            consulta.setString(2, nombre);
            consulta.setString(3, apellido);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                hayResultados = true;
                nombreAlumno = resultado.getString(1);
                apellidoAlumno = resultado.getString(2);
                String nombreCompleto = nombreAlumno + " " + apellidoAlumno;
                enviarDatosTablaAula(nombreCompleto, curso);
            }
            if (!hayResultados) {
                enviarDatosTablaAula("No hay compañeros en tu clase", " ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*public void consultarNombreApellido() {
        String consultaAula = "SELECT nombre,apellido FROM Estudiante WHERE usuario_estudiante=?";
        try {
            SQL.conectar();
            conexion = SQL.getConexion();
            consulta = conexion.prepareStatement(consultaAula);
            consulta.setString(1, usuario);
            System.out.println(usuario);
            resultado = consulta.executeQuery();
            if(resultado.next()) {
                nombreAlumno = resultado.getString(1);
                apellidoAlumno = resultado.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
    public void consultarMaterias(int Anio) {
        try {
            boolean hayResultados = false;
            String consulta_1 = "SELECT nombre_materia FROM Materia WHERE curso='1º Año'";
            String consulta_2 = "SELECT nombre_materia FROM Materia WHERE curso='2º Año'";
            String consulta_3 = "SELECT nombre_materia FROM Materia WHERE curso='3º Año'";
            String consulta_4 = "SELECT nombre_materia FROM Materia WHERE curso='4º Año'";
            String consulta_5 = "SELECT nombre_materia FROM Materia WHERE curso='5º Año'";
            String consulta_6 = "SELECT nombre_materia FROM Materia WHERE curso='6º Año'";
            SQL.conectar();
            conexion = SQL.getConexion();
            switch (Anio) {
                case 1:
                    consulta = conexion.prepareStatement(consulta_1);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("1º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 1º Año</html>", "ERROR", 2);
                    }
                    break;
                case 2:
                    consulta = conexion.prepareStatement(consulta_2);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("2º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 2º Año</html>", "ERROR", 2);
                    }
                    break;
                case 3:
                    consulta = conexion.prepareStatement(consulta_3);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("3º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 3º Año</html>", "ERROR", 2);
                    }
                    break;
                case 4:
                    consulta = conexion.prepareStatement(consulta_4);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("4º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 4º Año</html>", "ERROR", 2);
                    }
                    break;
                case 5:
                    consulta = conexion.prepareStatement(consulta_5);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("5º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 5º Año</html>", "ERROR", 2);
                    }
                    break;
                case 6:
                    consulta = conexion.prepareStatement(consulta_6);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        materia_tabla = resultado.getString("nombre_materia");
                        enviarCursoMateria("6º Año", materia_tabla);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay materias en 6º Año</html>", "ERROR", 2);
                    }
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarEstudiantes(int Anio) {
        try {
            boolean hayResultados = false;
            String consulta_1 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='1º Año'";
            String consulta_2 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='2º Año'";
            String consulta_3 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='3º Año'";
            String consulta_4 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='4º Año'";
            String consulta_5 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='5º Año'";
            String consulta_6 = "SELECT nombre,apellido FROM Estudiante WHERE curso_estudiante='6º Año'";
            SQL.conectar();
            conexion = SQL.getConexion();
            switch (Anio) {
                case 1:
                    consulta = conexion.prepareStatement(consulta_1);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "1º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 1º Año</html>", "ERROR", 2);
                    }
                    break;
                case 2:
                    consulta = conexion.prepareStatement(consulta_2);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "2º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 2º Año</html>", "ERROR", 2);
                    }
                    break;
                case 3:
                    consulta = conexion.prepareStatement(consulta_3);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "3º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 3º Año</html>", "ERROR", 2);
                    }
                    break;
                case 4:
                    consulta = conexion.prepareStatement(consulta_4);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "4º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 4º Año</html>", "ERROR", 2);
                    }
                    break;
                case 5:
                    consulta = conexion.prepareStatement(consulta_5);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "5º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 5º Año</html>", "ERROR", 2);
                    }
                    break;
                case 6:
                    consulta = conexion.prepareStatement(consulta_6);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "6º Año";
                        enviarEstudiantes(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 6º Año</html>", "ERROR", 2);
                    }
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarProfesores(int Anio) {
        try {
            boolean hayResultados = false;
            String consulta_1 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='1º Año'";
            String consulta_2 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='2º Año'";
            String consulta_3 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='3º Año'";
            String consulta_4 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='4º Año'";
            String consulta_5 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='5º Año'";
            String consulta_6 = "SELECT nombre,apellido FROM Profesor WHERE curso_profe='6º Año'";
            SQL.conectar();
            conexion = SQL.getConexion();
            switch (Anio) {
                case 1:
                    consulta = conexion.prepareStatement(consulta_1);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "1º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 1º Año</html>", "ERROR", 2);
                    }
                    break;
                case 2:
                    consulta = conexion.prepareStatement(consulta_2);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "2º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 2º Año</html>", "ERROR", 2);
                    }
                    break;
                case 3:
                    consulta = conexion.prepareStatement(consulta_3);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "3º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 3º Año</html>", "ERROR", 2);
                    }
                    break;
                case 4:
                    consulta = conexion.prepareStatement(consulta_4);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "4º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 4º Año</html>", "ERROR", 2);
                    }
                    break;
                case 5:
                    consulta = conexion.prepareStatement(consulta_5);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "5º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 5º Año</html>", "ERROR", 2);
                    }
                    break;
                case 6:
                    consulta = conexion.prepareStatement(consulta_6);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombre = nombre + " " + apellido;
                        curso = "6º Año";
                        enviarProfesores(nombre, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay profesores en 6º Año</html>", "ERROR", 2);
                    }
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarTutores(int Anio) {
        try {
            boolean hayResultados = false;
            String consulta_1 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='1º Año'";
            String consulta_2 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='2º Año'";
            String consulta_3 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='3º Año'";
            String consulta_4 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='4º Año'";
            String consulta_5 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='5º Año'";
            String consulta_6 = "SELECT nombre,apellido,nTutor,aTutor FROM Estudiante WHERE curso_estudiante='6º Año'";
            SQL.conectar();
            conexion = SQL.getConexion();
            switch (Anio) {
                case 1:
                    consulta = conexion.prepareStatement(consulta_1);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "1º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 1º Año</html>", "ERROR", 2);
                    }
                    break;
                case 2:
                    consulta = conexion.prepareStatement(consulta_2);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "2º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 2º Año</html>", "ERROR", 2);
                    }
                    break;
                case 3:
                    consulta = conexion.prepareStatement(consulta_3);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "3º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 3º Año</html>", "ERROR", 2);
                    }
                    break;
                case 4:
                    consulta = conexion.prepareStatement(consulta_4);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "4º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 4º Año</html>", "ERROR", 2);
                    }
                    break;
                case 5:
                    consulta = conexion.prepareStatement(consulta_5);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "5º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 5º Año</html>", "ERROR", 2);
                    }
                    break;
                case 6:
                    consulta = conexion.prepareStatement(consulta_6);
                    resultado = consulta.executeQuery();
                    while (resultado.next()) {
                        nombre = resultado.getString("nombre");
                        apellido = resultado.getString("apellido");
                        nombreTutor = resultado.getString("nTutor");
                        apellidoTutor = resultado.getString("aTutor");
                        nombreAlumno = nombre + " " + apellido;
                        tutorNombreCompleto = nombreTutor + " " + apellidoTutor;
                        curso = "6º Año";
                        enviarTutores(nombreAlumno, tutorNombreCompleto, curso);
                        hayResultados = true;
                    }
                    if (!hayResultados) {
                        JOptionPane.showMessageDialog(null, "<html><center>ALERTA DEL SISTEMA:</center> No hay estudiantes en 6º Año</html>", "ERROR", 2);
                    }
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cambiarCorreoEstu(String nuevoCorreo, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateCorreo = "UPDATE Estudiante SET correo=? WHERE usuario_estudiante=?";
                    consulta = conexion.prepareStatement(UpdateCorreo);
                    consulta.setString(1, nuevoCorreo);
                    consulta.setString(2, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su correo se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cambiarTelefonoEstu(int nuevoTelefono, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateTelefono = "UPDATE Estudiante SET telefono=? WHERE usuario_estudiante=?";
                    consulta = conexion.prepareStatement(UpdateTelefono);
                    consulta.setInt(1, nuevoTelefono);
                    consulta.setString(2, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su teléfono se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cambiarCorreoTelefonoEstu(int nuevoTelefono, String nuevoCorreo, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateAmbos = "UPDATE Estudiante SET correo=?,telefono=? WHERE usuario_estudiante=?";
                    consulta = conexion.prepareStatement(UpdateAmbos);
                    consulta.setString(1, nuevoCorreo);
                    consulta.setInt(2, nuevoTelefono);
                    consulta.setString(3, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su correo y teléfono se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cambiarCorreoProfe(String nuevoCorreo, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateCorreo = "UPDATE Profesor SET correo=? WHERE usuario_profesor=?";
                    consulta = conexion.prepareStatement(UpdateCorreo);
                    consulta.setString(1, nuevoCorreo);
                    consulta.setString(2, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su correo se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cambiarTelefonoProfe(int nuevoTelefono, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateTelefono = "UPDATE Profesor SET telefono=? WHERE usuario_profesor=?";
                    consulta = conexion.prepareStatement(UpdateTelefono);
                    consulta.setInt(1, nuevoTelefono);
                    consulta.setString(2, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su teléfono se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cambiarCorreoTelefonoProfe(int nuevoTelefono, String nuevoCorreo, String user) {
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas guardar los cambios?", "Confirmar", 0);
            switch (opcion) {
                case 0:
                    SQL.conectar();
                    conexion = SQL.getConexion();
                    String UpdateAmbos = "UPDATE Profesor SET correo=?,telefono=? WHERE usuario_profesor=?";
                    consulta = conexion.prepareStatement(UpdateAmbos);
                    consulta.setString(1, nuevoCorreo);
                    consulta.setInt(2, nuevoTelefono);
                    consulta.setString(3, user);
                    consulta.executeUpdate();
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Su correo y teléfono se ha editado con éxito");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Se ha cancelado la operación");
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultasSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void guardarDatosEstudiante(String usuario, String password, String nombre, String apellido, int DNI, int telefono, String correo, String curso, String nombreTutor, String apellidoTutor) {
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

    public void guardarUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void guardarClave(String password) {
        this.password = password;
    }

    public boolean credencialesValidas() {
        return sesionCorrecta;
    }

    @Override
    public void enviarDatosProfesor() {
        profesor.cargarNombre(nombre);
        profesor.cargarDatosPersonales(usuario, password, nombre, apellido, correo, materia, tipo_Profe, curso, CUIL, telefono);
    }

    @Override
    public void enviarDatosEstudiante() {
        nombre = nombreApellidoEstudiante(usuario);
        String[] separarNombre = nombre.split("-");
        estudiante.obtenerNombre(nombre);
        estudiante.cargarDatosPersonales(usuario, password, separarNombre[0], apellido, correo, curso, (int) DNI, telefono, nombreTutor, apellidoTutor);
    }

    @Override
    public void enviarNombreEstudiante() {
        estudiante.obtenerNombre(nombre);
    }

    @Override
    public void enviarCursoMateria(String curso, String materia) {
        profesor.cargarMateriaEnTabla(curso, materia);
    }

    @Override
    public void enviarEstudiantes(String nombre, String curso) {
        profesor.cargarEstudianteEnTabla(curso, nombre);
    }

    @Override
    public void enviarProfesores(String nombre, String curso) {
        profesor.cargarProfesorEnTabla(curso, nombre);
    }

    @Override
    public void enviarTutores(String nombreAlumno, String nombreTutor, String curso) {
        profesor.cargarTutoresEnTabla(curso, nombreAlumno, nombreTutor);
    }

    @Override
    public void mostrarVentanaProfesor(boolean b) {
        if (b == true) {
            profesor.setVisible(b);
        } else {
            profesor.setVisible(b);
        }
    }

    @Override
    public void mostrarVentanaEstudiante(boolean b) {
        if (b == true) {
            iniciarInstanciaEstudiante.estudiante.setVisible(b);
        } else {
            iniciarInstanciaEstudiante.estudiante.setVisible(b);
        }
    }

    public Connection getConexion() {
        conexion = SQL.getConexion();
        return conexion;
    }

    public void guardarDatosEstudiante(String usuario, String password, String nombre, String apellido, long DNI, int telefono, String correo, String curso, String nombreTutor, String apellidoTutor) {
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

    public void guardarDatosProfe(String usuario, String password, String nombre, String apellido, String correo, String curso, String tipo_Profe, String materia, int telefono, long CUIL) {
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

    @Override
    public void enviarCurso() {
    }

    @Override
    public void enviarDatosTablaMateria(String materia, String curso) {
        estudiante.cargarMateriaEnTabla(materia, curso);
    }

    @Override
    public void enviarDatosTablaProfesor(String profesor, String curso) {
        estudiante.cargarProfeEnTabla(profesor, curso);
    }

    @Override
    public void enviarDatosTablaAula(String alumno, String curso) {
        estudiante.cargarAulaEnTabla(alumno, curso);
    }

}
