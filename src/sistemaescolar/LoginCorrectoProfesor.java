/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaescolar;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadb.consultasSQL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LoginCorrectoProfesor extends javax.swing.JFrame {

    consultasSQL consulta = new consultasSQL();
    private String password, curso, materia;
    private boolean tablaEscritaMateria = false;
    private boolean tablaEscritaEstudiante = false;
    DefaultTableModel modelMateria = new DefaultTableModel();
    DefaultTableModel modelEstudiante = new DefaultTableModel();
    DefaultTableModel modelProfesor = new DefaultTableModel();
    DefaultTableModel modelTutores = new DefaultTableModel();
    private boolean tablaEscritaProfesor = false;
    private boolean tablaEscritaTutor = false;
    private boolean clickCuadroEstudiante = false;
    private boolean clickCuadroMateria = false;
    private boolean clickCuadroTutores = false;
    private boolean clickCuadroProfesor = false;
    private String opcion;
    private String claveFinal;

    public LoginCorrectoProfesor() {
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginCorrectoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Colegio San José - Sesión Iniciada Profesor");
        Image icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        setIconImage(icono);
    }

    public void cargarNombre(String nombre) {
        labelHola.setText("¡Hola, " + nombre + "!");
    }

    public void cargarDatosPersonales(String usuario, String password, String nombre, String apellido, String correo, String materia, String tipoProfe, String curso, long CUIL, int telefono) {
        fieldUsuario.setText(usuario);
        this.password = password;
        //fieldPassword.setText("••••••••");
        fieldNombre.setText(nombre);
        fieldApellido.setText(apellido);
        fieldMail.setText(correo);
        fieldMateria.setText(materia);
        fieldTipoProfe.setText(tipoProfe);
        fieldCurso.setText(curso);
        fieldCUIL.setText(String.valueOf(CUIL));
        fieldPhone.setText(String.valueOf(telefono));
        contarClave();
    }

    public void cargarMateriaEnTabla(String curso, String materia) {
        Object[] fila = {materia, curso};
        modelMateria.addRow(fila);
        tablaEscritaMateria = true;
    }

    public void cargarEstudianteEnTabla(String curso, String nombre) {
        Object[] fila = {nombre, curso};
        modelEstudiante.addRow(fila);
        tablaEscritaEstudiante = true;
    }

    public void cargarProfesorEnTabla(String curso, String nombre) {
        Object[] fila = {nombre, curso};
        modelProfesor.addRow(fila);
        tablaEscritaProfesor = true;
    }

    public void cargarTutoresEnTabla(String curso, String nombreAlumno, String nombreTutor) {
        Object[] fila = {nombreAlumno, nombreTutor, curso};
        modelTutores.addRow(fila);
        tablaEscritaTutor = true;
    }

    public void vaciarTablaMateria() {
        if (tablaEscritaMateria) {
            while (modelMateria.getRowCount() > 0) {
                modelMateria.removeRow(0);
            }
        }
    }

    public void vaciarTablaEstudiante() {
        if (tablaEscritaEstudiante) {
            while (modelEstudiante.getRowCount() > 0) {
                modelEstudiante.removeRow(0);
            }
        }
    }

    public void vaciarTablaProfesor() {
        if (tablaEscritaProfesor) {
            while (modelProfesor.getRowCount() > 0) {
                modelProfesor.removeRow(0);
            }
        }
    }

    public void vaciarTablaTutores() {
        if (tablaEscritaTutor) {
            while (modelTutores.getRowCount() > 0) {
                modelTutores.removeRow(0);
            }
        }
    }

    private void limpiarTodasLasTablas() {
        vaciarTablaTutores();
        vaciarTablaEstudiante();
        vaciarTablaMateria();
        vaciarTablaProfesor();
    }

    private void contarClave() {
        fieldPassword.setText("");
        String valorAnterior = fieldPassword.getText();
        for (int i = 1; i < password.length(); i++) {
            fieldPassword.setText(valorAnterior + "•");
            valorAnterior = fieldPassword.getText();
            fieldPassword.setText(valorAnterior + "•");
        }
        claveFinal = fieldPassword.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        panelProfesor = new javax.swing.JPanel();
        labelHola1 = new javax.swing.JLabel();
        solapaPestanias = new javax.swing.JTabbedPane();
        panelPrincipal = new javax.swing.JPanel();
        contenedorInformacion = new javax.swing.JPanel();
        labelCorrecto = new javax.swing.JLabel();
        labelHola = new javax.swing.JLabel();
        iconoCorrecto = new javax.swing.JLabel();
        informacionLabel = new javax.swing.JLabel();
        panelDatosPersonales = new javax.swing.JPanel();
        contenedorInformacion2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JLabel();
        fieldCUIL = new javax.swing.JLabel();
        fieldMail = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JLabel();
        fieldTipoProfe = new javax.swing.JLabel();
        fieldMateria = new javax.swing.JLabel();
        fieldCurso = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelTitular3 = new javax.swing.JLabel();
        panelEdicion = new javax.swing.JPanel();
        contenedorInformacion4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bCambiarDatos = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        botonGuardarCambios = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        labelTitular2 = new javax.swing.JLabel();
        panelConsultaMateria = new javax.swing.JPanel();
        contenedorInformacion3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bCursoMateria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelTitular = new javax.swing.JLabel();
        panelConsultaEstudiantes = new javax.swing.JPanel();
        contenedorInformacion5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bCursoEstudiante = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitular1 = new javax.swing.JLabel();
        panelConsultaProfesores = new javax.swing.JPanel();
        contenedorInformacion6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        bCursoProfesor = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelTitular4 = new javax.swing.JLabel();
        panelConsultaProfesores1 = new javax.swing.JPanel();
        contenedorInformacion7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTutores = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        bTutores = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        labelTitular5 = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        infoPanel.setBackground(new java.awt.Color(51, 0, 51));

        panelProfesor.setBackground(new java.awt.Color(102, 0, 102));

        labelHola1.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        labelHola1.setForeground(new java.awt.Color(204, 204, 255));
        labelHola1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHola1.setText("Ingresado como Profesor");
        labelHola1.setToolTipText("");

        javax.swing.GroupLayout panelProfesorLayout = new javax.swing.GroupLayout(panelProfesor);
        panelProfesor.setLayout(panelProfesorLayout);
        panelProfesorLayout.setHorizontalGroup(
            panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHola1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProfesorLayout.setVerticalGroup(
            panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHola1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        solapaPestanias.setBackground(new java.awt.Color(51, 51, 51));
        solapaPestanias.setForeground(new java.awt.Color(255, 255, 255));
        solapaPestanias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solapaPestanias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        solapaPestanias.setOpaque(true);

        panelPrincipal.setBackground(new java.awt.Color(102, 0, 102));
        panelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        labelCorrecto.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelCorrecto.setForeground(new java.awt.Color(255, 255, 255));
        labelCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorrecto.setText("Has iniciado sesión correctamente");

        labelHola.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelHola.setForeground(new java.awt.Color(255, 255, 255));
        labelHola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHola.setText("¡Hola, nombreProfesor!");

        iconoCorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correcto.png"))); // NOI18N

        informacionLabel.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        informacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        informacionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacionLabel.setText("Ahora puedes elegir las opciones a realizar en las pestañas que se ubican arriba");
        informacionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout contenedorInformacionLayout = new javax.swing.GroupLayout(contenedorInformacion);
        contenedorInformacion.setLayout(contenedorInformacionLayout);
        contenedorInformacionLayout.setHorizontalGroup(
            contenedorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacionLayout.createSequentialGroup()
                .addGroup(contenedorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(informacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                    .addGroup(contenedorInformacionLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(contenedorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHola, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contenedorInformacionLayout.createSequentialGroup()
                                    .addGap(235, 235, 235)
                                    .addComponent(iconoCorrecto)
                                    .addGap(261, 261, 261))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenedorInformacionLayout.setVerticalGroup(
            contenedorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacionLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelHola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCorrecto)
                .addGap(18, 18, 18)
                .addComponent(iconoCorrecto)
                .addGap(44, 44, 44)
                .addComponent(informacionLabel)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(contenedorInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(contenedorInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        solapaPestanias.addTab("Panel Principal", panelPrincipal);

        panelDatosPersonales.setBackground(new java.awt.Color(102, 0, 102));
        panelDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion2.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contraseña:");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Usuario:");

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Apellido:");

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CUIL:");

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("E-mail:");

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Teléfono:");

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo de Profesor:");

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Materia:");

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Curso:");

        fieldUsuario.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        fieldUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldUsuario.setText("Texto");

        fieldPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        fieldPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldPassword.setText("Texto");
        fieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldPasswordMouseExited(evt);
            }
        });

        fieldNombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        fieldNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldNombre.setText("Texto");

        fieldApellido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldApellido.setForeground(new java.awt.Color(153, 153, 153));
        fieldApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldApellido.setText("Texto");

        fieldCUIL.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldCUIL.setForeground(new java.awt.Color(153, 153, 153));
        fieldCUIL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldCUIL.setText("Texto");

        fieldMail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldMail.setForeground(new java.awt.Color(153, 153, 153));
        fieldMail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldMail.setText("Texto");

        fieldPhone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldPhone.setForeground(new java.awt.Color(153, 153, 153));
        fieldPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldPhone.setText("Texto");

        fieldTipoProfe.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldTipoProfe.setForeground(new java.awt.Color(153, 153, 153));
        fieldTipoProfe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldTipoProfe.setText("Texto");

        fieldMateria.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldMateria.setForeground(new java.awt.Color(153, 153, 153));
        fieldMateria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldMateria.setText("Texto");

        fieldCurso.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fieldCurso.setForeground(new java.awt.Color(153, 153, 153));
        fieldCurso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldCurso.setText("Texto");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Aquí encontrarás los datos de tu cuenta y tus datos personales");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("RECUERDA: Puedes pasar el cursor por encima de los asteriscos en la contraseña para hacer visible tu clave");

        javax.swing.GroupLayout contenedorInformacion2Layout = new javax.swing.GroupLayout(contenedorInformacion2);
        contenedorInformacion2.setLayout(contenedorInformacion2Layout);
        contenedorInformacion2Layout.setHorizontalGroup(
            contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldCUIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldTipoProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(fieldMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldMail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(fieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion2Layout.createSequentialGroup()
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorInformacion2Layout.setVerticalGroup(
            contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(fieldUsuario))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(fieldPassword)))
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(fieldPhone))))
                        .addGap(18, 18, 18)
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(fieldNombre))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(fieldApellido))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(fieldCUIL)))
                            .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(fieldTipoProfe))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(fieldMateria))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(fieldCurso)))))
                    .addGroup(contenedorInformacion2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(contenedorInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldMail)
                            .addComponent(jLabel20))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(50, 50, 50))
        );

        labelTitular3.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular3.setText("Mis datos personales");

        javax.swing.GroupLayout panelDatosPersonalesLayout = new javax.swing.GroupLayout(panelDatosPersonales);
        panelDatosPersonales.setLayout(panelDatosPersonalesLayout);
        panelDatosPersonalesLayout.setHorizontalGroup(
            panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(contenedorInformacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosPersonalesLayout.setVerticalGroup(
            panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        solapaPestanias.addTab("Mis datos personales", panelDatosPersonales);

        panelEdicion.setBackground(new java.awt.Color(102, 0, 102));
        panelEdicion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion4.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        contenedorInformacion4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Selecciona el dato que deseas modificar:");

        bCambiarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCambiarDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambiar e-mail", "Cambiar teléfono", "Cambiar ambos" }));
        bCambiarDatos.setSelectedIndex(-1);
        bCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarDatosActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(197, 197, 197));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nuevo e-mail:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(197, 197, 197));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nuevo teléfono:");

        fieldCorreo.setBackground(new java.awt.Color(51, 0, 0));
        fieldCorreo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fieldCorreo.setForeground(new java.awt.Color(197, 197, 197));
        fieldCorreo.setToolTipText("Escribe tu correo aquí");
        fieldCorreo.setEnabled(false);

        fieldTelefono.setBackground(new java.awt.Color(51, 0, 0));
        fieldTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fieldTelefono.setForeground(new java.awt.Color(197, 197, 197));
        fieldTelefono.setToolTipText("Escribe tu teléfono aquí");
        fieldTelefono.setEnabled(false);

        botonGuardarCambios.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        botonGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarCambios.setText("Guardar cambios");
        botonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingrese los nuevos datos aquí en cada campo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonGuardarCambios)
                                .addGap(249, 249, 249))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldCorreo)
                                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(botonGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout contenedorInformacion4Layout = new javax.swing.GroupLayout(contenedorInformacion4);
        contenedorInformacion4.setLayout(contenedorInformacion4Layout);
        contenedorInformacion4Layout.setHorizontalGroup(
            contenedorInformacion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion4Layout.createSequentialGroup()
                .addGap(21, 41, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(contenedorInformacion4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(contenedorInformacion4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorInformacion4Layout.setVerticalGroup(
            contenedorInformacion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(contenedorInformacion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bCambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitular2.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular2.setText("Edición de datos");

        javax.swing.GroupLayout panelEdicionLayout = new javax.swing.GroupLayout(panelEdicion);
        panelEdicion.setLayout(panelEdicionLayout);
        panelEdicionLayout.setHorizontalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(contenedorInformacion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(panelEdicionLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEdicionLayout.setVerticalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitular2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        solapaPestanias.addTab("Modificar Mail/teléfono", panelEdicion);

        panelConsultaMateria.setBackground(new java.awt.Color(102, 0, 102));
        panelConsultaMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion3.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaMaterias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaMaterias.setForeground(new java.awt.Color(255, 255, 255));
        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMaterias);
        if (tablaMaterias.getColumnModel().getColumnCount() > 0) {
            tablaMaterias.getColumnModel().getColumn(0).setPreferredWidth(180);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aquí podrás verificar las materias que hay en cada curso registrado");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estimado Profesor");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colegio.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecciona el curso que deseas ver las Materias:");

        bCursoMateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCursoMateria.setForeground(new java.awt.Color(255, 255, 255));
        bCursoMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Año", "2º Año", "3º Año", "4º Año", "5º Año", "6º Año" }));
        bCursoMateria.setSelectedIndex(-1);
        bCursoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCursoMateriaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Curso:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedorInformacion3Layout = new javax.swing.GroupLayout(contenedorInformacion3);
        contenedorInformacion3.setLayout(contenedorInformacion3Layout);
        contenedorInformacion3Layout.setHorizontalGroup(
            contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCursoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        contenedorInformacion3Layout.setVerticalGroup(
            contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenedorInformacion3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorInformacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bCursoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        labelTitular.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular.setText("Materias y Cursos");

        javax.swing.GroupLayout panelConsultaMateriaLayout = new javax.swing.GroupLayout(panelConsultaMateria);
        panelConsultaMateria.setLayout(panelConsultaMateriaLayout);
        panelConsultaMateriaLayout.setHorizontalGroup(
            panelConsultaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorInformacion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelConsultaMateriaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        panelConsultaMateriaLayout.setVerticalGroup(
            panelConsultaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaMateriaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        solapaPestanias.addTab("Consultar materias", panelConsultaMateria);

        panelConsultaEstudiantes.setBackground(new java.awt.Color(102, 0, 102));
        panelConsultaEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion5.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaEstudiantes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEstudiantes);
        if (tablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            tablaEstudiantes.getColumnModel().getColumn(0).setResizable(false);
            tablaEstudiantes.getColumnModel().getColumn(0).setPreferredWidth(180);
            tablaEstudiantes.getColumnModel().getColumn(1).setResizable(false);
            tablaEstudiantes.getColumnModel().getColumn(1).setPreferredWidth(180);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aquí podrás verificar los estudiantes que hay en cada curso registrado");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estimado Profesor");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colegio.png"))); // NOI18N
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        bCursoEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCursoEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        bCursoEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Año", "2º Año", "3º Año", "4º Año", "5º Año", "6º Año" }));
        bCursoEstudiante.setSelectedIndex(-1);
        bCursoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCursoEstudianteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selecciona el curso que deseas ver los Estudiantes:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Curso:");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedorInformacion5Layout = new javax.swing.GroupLayout(contenedorInformacion5);
        contenedorInformacion5.setLayout(contenedorInformacion5Layout);
        contenedorInformacion5Layout.setHorizontalGroup(
            contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion5Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCursoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorInformacion5Layout.setVerticalGroup(
            contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenedorInformacion5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorInformacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(bCursoEstudiante))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        labelTitular1.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular1.setText("Estudiantes y Cursos");

        javax.swing.GroupLayout panelConsultaEstudiantesLayout = new javax.swing.GroupLayout(panelConsultaEstudiantes);
        panelConsultaEstudiantes.setLayout(panelConsultaEstudiantesLayout);
        panelConsultaEstudiantesLayout.setHorizontalGroup(
            panelConsultaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaEstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorInformacion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelConsultaEstudiantesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        panelConsultaEstudiantesLayout.setVerticalGroup(
            panelConsultaEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaEstudiantesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitular1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        solapaPestanias.addTab("Consultar Estudiantes", panelConsultaEstudiantes);

        panelConsultaProfesores.setBackground(new java.awt.Color(102, 0, 102));
        panelConsultaProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion6.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaProfesores.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaProfesores.setForeground(new java.awt.Color(255, 255, 255));
        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profesor", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaProfesores);
        if (tablaProfesores.getColumnModel().getColumnCount() > 0) {
            tablaProfesores.getColumnModel().getColumn(0).setResizable(false);
            tablaProfesores.getColumnModel().getColumn(0).setPreferredWidth(180);
            tablaProfesores.getColumnModel().getColumn(1).setResizable(false);
            tablaProfesores.getColumnModel().getColumn(1).setPreferredWidth(180);
        }

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Aquí podrás verificar los profesores que hay en cada curso registrado");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Estimado Profesor");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colegio.png"))); // NOI18N
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        bCursoProfesor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCursoProfesor.setForeground(new java.awt.Color(255, 255, 255));
        bCursoProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Año", "2º Año", "3º Año", "4º Año", "5º Año", "6º Año" }));
        bCursoProfesor.setSelectedIndex(-1);
        bCursoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCursoProfesorActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Selecciona el curso que deseas ver los Profesores:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Curso:");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedorInformacion6Layout = new javax.swing.GroupLayout(contenedorInformacion6);
        contenedorInformacion6.setLayout(contenedorInformacion6Layout);
        contenedorInformacion6Layout.setHorizontalGroup(
            contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion6Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCursoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorInformacion6Layout.setVerticalGroup(
            contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenedorInformacion6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorInformacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(bCursoProfesor))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        labelTitular4.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular4.setText("Profesores y Cursos");

        javax.swing.GroupLayout panelConsultaProfesoresLayout = new javax.swing.GroupLayout(panelConsultaProfesores);
        panelConsultaProfesores.setLayout(panelConsultaProfesoresLayout);
        panelConsultaProfesoresLayout.setHorizontalGroup(
            panelConsultaProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaProfesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorInformacion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelConsultaProfesoresLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular4)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        panelConsultaProfesoresLayout.setVerticalGroup(
            panelConsultaProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaProfesoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitular4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        solapaPestanias.addTab("Consultar Profesores", panelConsultaProfesores);

        panelConsultaProfesores1.setBackground(new java.awt.Color(102, 0, 102));
        panelConsultaProfesores1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorInformacion7.setBackground(new java.awt.Color(102, 0, 51));
        contenedorInformacion7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaTutores.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaTutores.setForeground(new java.awt.Color(255, 255, 255));
        tablaTutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante", "Tutor", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaTutores);
        if (tablaTutores.getColumnModel().getColumnCount() > 0) {
            tablaTutores.getColumnModel().getColumn(0).setResizable(false);
            tablaTutores.getColumnModel().getColumn(0).setPreferredWidth(180);
            tablaTutores.getColumnModel().getColumn(1).setResizable(false);
            tablaTutores.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaTutores.getColumnModel().getColumn(2).setResizable(false);
            tablaTutores.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Aquí podrás verificar los tutores que hay en cada curso registrado");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Estimado Profesor");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colegio.png"))); // NOI18N
        jLabel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        bTutores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bTutores.setForeground(new java.awt.Color(255, 255, 255));
        bTutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Año", "2º Año", "3º Año", "4º Año", "5º Año", "6º Año" }));
        bTutores.setSelectedIndex(-1);
        bTutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutoresActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Selecciona el curso que deseas ver los Estudiantes:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Curso:");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenedorInformacion7Layout = new javax.swing.GroupLayout(contenedorInformacion7);
        contenedorInformacion7.setLayout(contenedorInformacion7Layout);
        contenedorInformacion7Layout.setHorizontalGroup(
            contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInformacion7Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator7)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bTutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorInformacion7Layout.setVerticalGroup(
            contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenedorInformacion7Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorInformacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(bTutores))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        labelTitular5.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        labelTitular5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitular5.setText("Estudiantes y Tutores");

        javax.swing.GroupLayout panelConsultaProfesores1Layout = new javax.swing.GroupLayout(panelConsultaProfesores1);
        panelConsultaProfesores1.setLayout(panelConsultaProfesores1Layout);
        panelConsultaProfesores1Layout.setHorizontalGroup(
            panelConsultaProfesores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaProfesores1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorInformacion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelConsultaProfesores1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelTitular5)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        panelConsultaProfesores1Layout.setVerticalGroup(
            panelConsultaProfesores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaProfesores1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitular5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorInformacion7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        solapaPestanias.addTab("Consultar Tutores", panelConsultaProfesores1);

        botonCerrarSesion.setBackground(new java.awt.Color(255, 33, 71));
        botonCerrarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        botonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/out.png"))); // NOI18N
        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.setFocusPainted(false);
        botonCerrarSesion.setIconTextGap(15);
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(224, 79, 95));
        botonSalir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setFocusPainted(false);
        botonSalir.setIconTextGap(15);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addComponent(solapaPestanias)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(panelProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solapaPestanias, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarSesion)
                    .addComponent(botonSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        VentanaLogin login = new VentanaLogin();
        solapaPestanias.setSelectedIndex(0);
        limpiarTodasLasTablas();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void bCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarDatosActionPerformed
        fieldHabilitados();
    }//GEN-LAST:event_bCambiarDatosActionPerformed

    private void bCursoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCursoMateriaActionPerformed
        modelMateria = (DefaultTableModel) tablaMaterias.getModel();
        if (bCursoMateria.getSelectedIndex() != -1) {
            opcion = bCursoMateria.getSelectedItem().toString();

            switch (opcion) {
                case "1º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(1);
                    break;
                case "2º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(2);
                    break;
                case "3º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(3);
                    break;
                case "4º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(4);
                    break;
                case "5º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(5);
                    break;
                case "6º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarMaterias(6);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_bCursoMateriaActionPerformed

    private void bCursoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCursoEstudianteActionPerformed
        modelEstudiante = (DefaultTableModel) tablaEstudiantes.getModel();
        if (bCursoEstudiante.getSelectedIndex() != -1) {
            opcion = bCursoEstudiante.getSelectedItem().toString();
            switch (opcion) {
                case "1º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(1);
                    break;
                case "2º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(2);
                    break;
                case "3º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(3);
                    break;
                case "4º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(4);
                    break;
                case "5º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(5);
                    break;
                case "6º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarEstudiantes(6);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_bCursoEstudianteActionPerformed

    private void botonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCambiosActionPerformed
        modificarDatos();
    }//GEN-LAST:event_botonGuardarCambiosActionPerformed

    private void fieldPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPasswordMouseEntered
        fieldPassword.setText(password);
    }//GEN-LAST:event_fieldPasswordMouseEntered

    private void fieldPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPasswordMouseExited
        fieldPassword.setText(claveFinal);
    }//GEN-LAST:event_fieldPasswordMouseExited

    private void bCursoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCursoProfesorActionPerformed
        modelProfesor = (DefaultTableModel) tablaProfesores.getModel();
        if (bCursoProfesor.getSelectedIndex() != -1) {
            opcion = bCursoProfesor.getSelectedItem().toString();
            switch (opcion) {
                case "1º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(1);
                    break;
                case "2º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(2);
                    break;
                case "3º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(3);
                    break;
                case "4º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(4);
                    break;
                case "5º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(5);
                    break;
                case "6º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarProfesores(6);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_bCursoProfesorActionPerformed

    private void bTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutoresActionPerformed
        modelTutores = (DefaultTableModel) tablaTutores.getModel();
        if (bTutores.getSelectedIndex() != -1) {
            opcion = bTutores.getSelectedItem().toString();

            switch (opcion) {
                case "1º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarTutores(1);
                    break;
                case "2º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarTutores(2);
                    break;
                case "3º Año":
                    vaciarTablaTutores();
                    consulta.consultarTutores(3);
                    break;
                case "4º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarTutores(4);
                    break;
                case "5º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarTutores(5);
                    break;
                case "6º Año":
                    limpiarTodasLasTablas();
                    consulta.consultarTutores(6);
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_bTutoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bCambiarDatos;
    private javax.swing.JComboBox<String> bCursoEstudiante;
    private javax.swing.JComboBox<String> bCursoMateria;
    private javax.swing.JComboBox<String> bCursoProfesor;
    private javax.swing.JComboBox<String> bTutores;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonGuardarCambios;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel contenedorInformacion;
    private javax.swing.JPanel contenedorInformacion2;
    private javax.swing.JPanel contenedorInformacion3;
    private javax.swing.JPanel contenedorInformacion4;
    private javax.swing.JPanel contenedorInformacion5;
    private javax.swing.JPanel contenedorInformacion6;
    private javax.swing.JPanel contenedorInformacion7;
    private javax.swing.JLabel fieldApellido;
    private javax.swing.JLabel fieldCUIL;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JLabel fieldCurso;
    private javax.swing.JLabel fieldMail;
    private javax.swing.JLabel fieldMateria;
    private javax.swing.JLabel fieldNombre;
    private javax.swing.JLabel fieldPassword;
    private javax.swing.JLabel fieldPhone;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel fieldTipoProfe;
    private javax.swing.JLabel fieldUsuario;
    private javax.swing.JLabel iconoCorrecto;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel informacionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelCorrecto;
    private javax.swing.JLabel labelHola;
    private javax.swing.JLabel labelHola1;
    private javax.swing.JLabel labelTitular;
    private javax.swing.JLabel labelTitular1;
    private javax.swing.JLabel labelTitular2;
    private javax.swing.JLabel labelTitular3;
    private javax.swing.JLabel labelTitular4;
    private javax.swing.JLabel labelTitular5;
    private javax.swing.JPanel panelConsultaEstudiantes;
    private javax.swing.JPanel panelConsultaMateria;
    private javax.swing.JPanel panelConsultaProfesores;
    private javax.swing.JPanel panelConsultaProfesores1;
    private javax.swing.JPanel panelDatosPersonales;
    private javax.swing.JPanel panelEdicion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProfesor;
    private javax.swing.JTabbedPane solapaPestanias;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTable tablaMaterias;
    private javax.swing.JTable tablaProfesores;
    private javax.swing.JTable tablaTutores;
    // End of variables declaration//GEN-END:variables

    private void modificarDatos() {
        if (bCambiarDatos.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: No se ha seleccionado ningun cambio<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        if (bCambiarDatos.getSelectedItem() == "Cambiar e-mail" && fieldCorreo.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: El campo e-mail está vacio<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        if (bCambiarDatos.getSelectedItem() == "Cambiar teléfono" && fieldTelefono.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: El campo teléfono está vacio<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        if (bCambiarDatos.getSelectedItem() == "Cambiar teléfono" && !fieldTelefono.getText().matches("[0-9]+")) {
            fieldTelefono.setText("");
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: Solo ingresar números en el campo teléfono<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        if (bCambiarDatos.getSelectedItem() == "Cambiar ambos" && fieldCorreo.getText().isBlank() && fieldTelefono.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: El campo e-mail ó teléfono está vacio<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        if (bCambiarDatos.getSelectedItem() == "Cambiar ambos" && !fieldTelefono.getText().matches("[0-9]+")) {
            fieldTelefono.setText("");
            JOptionPane.showMessageDialog(null, "<html><center>ERROR: Solo ingresar números en el campo teléfono<br><br>NINGUNO DE SUS DATOS HAN SIDO MODIFICADOS", "Mensaje de error", 0);
            return;
        }
        String nuevoCorreo = fieldCorreo.getText();
        String usuario = fieldUsuario.getText();

        if (fieldTelefono.isEnabled() && !fieldCorreo.isEnabled()) {
            consulta.cambiarTelefonoProfe(Integer.parseInt(fieldTelefono.getText()), usuario);
            fieldPhone.setText(fieldTelefono.getText());
            fieldTelefono.setText("");
        } else if (fieldCorreo.isEnabled() && !fieldTelefono.isEnabled()) {
            consulta.cambiarCorreoProfe(nuevoCorreo, usuario);
            fieldMail.setText(nuevoCorreo);
            fieldCorreo.setText("");
        } else if (fieldCorreo.isEnabled() && fieldTelefono.isEnabled()) {
            consulta.cambiarCorreoTelefonoProfe(Integer.parseInt(fieldTelefono.getText()), nuevoCorreo, usuario);
            fieldMail.setText(nuevoCorreo);
            fieldPhone.setText(fieldTelefono.getText());
            fieldCorreo.setText("");
            fieldTelefono.setText("");
        }
    }

    private void fieldHabilitados() {
        String opcion = (String) bCambiarDatos.getSelectedItem();
        switch (opcion) {
            case "Cambiar e-mail":
                fieldCorreo.setText("");
                fieldTelefono.setText("");
                fieldTelefono.setEnabled(false);
                fieldCorreo.setEnabled(true);
                fieldCorreo.setBackground(new Color(70, 73, 75));
                fieldTelefono.setBackground(new Color(55, 0, 0));
                break;
            case "Cambiar teléfono":
                fieldCorreo.setText("");
                fieldTelefono.setText("");
                fieldCorreo.setEnabled(false);
                fieldTelefono.setEnabled(true);
                fieldTelefono.setBackground(new Color(70, 73, 75));
                fieldCorreo.setBackground(new Color(55, 0, 0));
                break;
            case "Cambiar ambos":
                fieldCorreo.setText("");
                fieldCorreo.setEnabled(true);
                fieldCorreo.setBackground(new Color(70, 73, 75));
                fieldTelefono.setText("");
                fieldTelefono.setEnabled(true);
                fieldTelefono.setBackground(new Color(70, 73, 75));
                break;
            default:
                break;
        }
    }

    /*private void reiniciarComboBox(int numero) {
        switch (numero) {
            case 1:
                System.out.println(opcion);
                opcion = bCursoMateria.getSelectedItem().toString();
                bCursoEstudiante.setSelectedIndex(-1);
                bCursoProfesor.setSelectedIndex(-1);
                bTutores.setSelectedIndex(-1);
                break;
            case 2:
                bCursoProfesor.setSelectedIndex(-1);
                bTutores.setSelectedIndex(-1);
                bCursoMateria.setSelectedIndex(-1);
                break;
            case 3:
                bCursoEstudiante.setSelectedIndex(-1);
                bCursoProfesor.setSelectedIndex(-1);
                bTutores.setSelectedIndex(-1);
                break;
            case 4:
                bCursoEstudiante.setSelectedIndex(-1);
                bCursoProfesor.setSelectedIndex(-1);
                bCursoMateria.setSelectedIndex(-1);
                break;
            default:
                break;
        }
    }*/
}
