package sistemaescolar;

public interface iniciarInstanciaProfesor {
    public LoginCorrectoProfesor profesor = new LoginCorrectoProfesor();    
    
    public abstract void enviarDatosProfesor();
    public abstract void mostrarVentanaProfesor(boolean b);
    public abstract void enviarCursoMateria(String curso, String materia);
    public abstract void enviarEstudiantes(String nombre, String curso);
    public abstract void enviarProfesores(String nombre, String curso);
    public abstract void enviarTutores(String nombreAlumno, String nombreTutor, String curso);

}
