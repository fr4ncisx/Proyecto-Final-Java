package sistemaescolar;

public interface iniciarInstanciaEstudiante {
    public LoginCorrectoEstudiante estudiante = new LoginCorrectoEstudiante();

    public abstract void enviarNombreEstudiante();
    public abstract void enviarDatosEstudiante();
    public abstract void mostrarVentanaEstudiante(boolean b); 
    public abstract void enviarCurso();
    public abstract void enviarDatosTablaMateria(String materia, String curso);
    public abstract void enviarDatosTablaProfesor(String profesor, String curso);
    public abstract void enviarDatosTablaAula(String alumno, String curso);
}
