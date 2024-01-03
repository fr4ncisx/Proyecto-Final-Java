package sistemaescolar;

import java.awt.Image;
import javadb.consultasSQL;
import javax.swing.ImageIcon;

public class MostrarDatosEstudiante extends javax.swing.JFrame {

    VentanaLogin login;
    consultasSQL loginBoton;

    public MostrarDatosEstudiante() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Colegio San José - Mostrar Datos Registrados");
        Image icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        setIconImage(icono);
    }

    public void guardarDatosConsulta(String usuario, String password, String nombre, String apellido, int DNI, int telefono, String email, String curso, String nombreTutor, String apellidoTutor) {
        fieldApellido.setText(apellido);
        fieldDNI.setText(String.valueOf(DNI));
        fieldEmail.setText(email);
        fieldNombre.setText(nombre);
        fieldPassword.setText(password);
        fieldTelefono.setText(String.valueOf(telefono));
        fieldTutorNombre.setText(nombreTutor);
        fieldTutorApellido.setText(apellidoTutor);
        fieldUsuario.setText(usuario);
        fieldCurso.setText(curso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldDNI = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldCurso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldTutorNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldTutorApellido = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(0, 0, 51));

        panelDatos.setBackground(new java.awt.Color(0, 102, 153));
        panelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos del Estudiante");

        contenedorDatos.setBackground(new java.awt.Color(0, 51, 153));
        contenedorDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");

        fieldUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldUsuario.setText("Datos desde MySQL");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");

        fieldPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldPassword.setText("Datos desde MySQL");

        fieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldNombre.setText("Datos desde MySQL");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");

        fieldApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldApellido.setText("Datos desde MySQL");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido:");

        fieldDNI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldDNI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldDNI.setText("Datos desde MySQL");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("DNI:");

        fieldEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldEmail.setText("Datos desde MySQL");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Teléfono:");

        fieldTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldTelefono.setText("Datos desde MySQL");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("E-mail:");

        fieldCurso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldCurso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldCurso.setText("Datos desde MySQL");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Curso:");

        fieldTutorNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldTutorNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldTutorNombre.setText("Datos desde MySQL");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nombre Tutor:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Apellido Tutor:");

        fieldTutorApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldTutorApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fieldTutorApellido.setText("Datos desde MySQL");

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldTutorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldTutorApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldTutorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fieldTutorApellido))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        botonSalir.setBackground(new java.awt.Color(255, 51, 51));
        botonSalir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setFocusPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonLogin.setBackground(new java.awt.Color(51, 153, 0));
        botonLogin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(0, 0, 0));
        botonLogin.setText("Iniciar sesión");
        botonLogin.setFocusPainted(false);
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        botonInicio.setBackground(new java.awt.Color(255, 51, 51));
        botonInicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        botonInicio.setText("Inicio");
        botonInicio.setFocusPainted(false);
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(botonSalir)
                                .addGap(29, 29, 29)
                                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(botonInicio))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(21, 21, 21))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSalir))
                    .addComponent(botonInicio))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        this.dispose();
        login = new VentanaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_botonLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel contenedorDatos;
    public static javax.swing.JLabel fieldApellido;
    public static javax.swing.JLabel fieldCurso;
    public static javax.swing.JLabel fieldDNI;
    public static javax.swing.JLabel fieldEmail;
    public static javax.swing.JLabel fieldNombre;
    public static javax.swing.JLabel fieldPassword;
    public static javax.swing.JLabel fieldTelefono;
    public static javax.swing.JLabel fieldTutorApellido;
    public static javax.swing.JLabel fieldTutorNombre;
    public static javax.swing.JLabel fieldUsuario;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelDatos;
    // End of variables declaration//GEN-END:variables

    private void iniciarSesion() {
        String usuario = fieldUsuario.getText();
        String apellido = fieldApellido.getText();
        int DNI = Integer.parseInt(fieldDNI.getText());
        String email = fieldEmail.getText();
        String nombre = fieldNombre.getText();
        String password = fieldPassword.getText();
        int telefono = Integer.parseInt(fieldTelefono.getText());
        String nTutor = fieldTutorNombre.getText();
        String aTutor = fieldTutorApellido.getText();
        String curso = fieldCurso.getText();
        loginBoton = new consultasSQL();
        loginBoton.guardarUsuario(usuario);
        loginBoton.guardarDatosEstudiante(usuario, password, nombre, apellido, DNI, telefono, email, curso, nTutor, aTutor);
        loginBoton.loginRegistradoEstu();
        if (loginBoton.credencialesValidas()) {
            this.dispose();
        }
    }
}
