/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaescolar;

import java.awt.Image;
import javadb.consultasSQL;
import javax.swing.ImageIcon;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MostrarDatosProfesor extends javax.swing.JFrame {

    VentanaLogin login;
    consultasSQL loginBoton;
    
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private long CUIL;
    private int telefono;
    private String email;
    private String curso;
    private String materia;
    private String tipoProfe;

    public MostrarDatosProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Colegio San José - Mostrar Datos Registrados");
        Image icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        setIconImage(icono);
    }

    public void guardarDatosConsulta(String usuario, String password, String nombre, String apellido, long CUIL, int telefono, String email, String curso, String materia, String tipoProfe) {
        fieldApellido.setText(apellido);
        fieldCUIL.setText(String.valueOf(CUIL));
        fieldEmail.setText(email);
        fieldNombre.setText(nombre);
        fieldPassword.setText(password);
        fieldTelefono.setText(String.valueOf(telefono));
        fieldMateria.setText(materia);
        fieldUsuario.setText(usuario);
        fieldTipoProfe.setText(tipoProfe);
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
        fieldCUIL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldTipoProfe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldMateria = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldCurso = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(51, 0, 51));

        panelDatos.setBackground(new java.awt.Color(102, 0, 103));
        panelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos del Profesor");

        contenedorDatos.setBackground(new java.awt.Color(102, 0, 153));
        contenedorDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        fieldUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldUsuario.setText("Datos desde MySQL");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        fieldPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldPassword.setText("Datos desde MySQL");

        fieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldNombre.setText("Datos desde MySQL");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        fieldApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldApellido.setText("Datos desde MySQL");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");

        fieldCUIL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldCUIL.setText("Datos desde MySQL");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CUIL:");

        fieldEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldEmail.setText("Datos desde MySQL");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono:");

        fieldTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldTelefono.setText("Datos desde MySQL");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");

        fieldTipoProfe.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldTipoProfe.setText("Datos desde MySQL");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Profesor:");

        fieldMateria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldMateria.setText("Datos desde MySQL");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Materia:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Curso:");

        fieldCurso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fieldCurso.setText("Datos desde MySQL");

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldApellido)
                    .addComponent(fieldCUIL)
                    .addComponent(fieldEmail)
                    .addComponent(fieldTelefono)
                    .addComponent(fieldTipoProfe)
                    .addComponent(fieldMateria)
                    .addComponent(fieldUsuario)
                    .addComponent(fieldPassword)
                    .addComponent(fieldNombre)
                    .addComponent(fieldCurso))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
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
                    .addComponent(fieldCUIL))
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
                    .addComponent(fieldTipoProfe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fieldCurso))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        botonSalir.setBackground(new java.awt.Color(153, 0, 0));
        botonSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setFocusPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonLogin.setBackground(new java.awt.Color(0, 102, 51));
        botonLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Iniciar sesión");
        botonLogin.setFocusPainted(false);
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        botonInicio.setBackground(new java.awt.Color(153, 0, 0));
        botonInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
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
                .addGap(21, 21, 21)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(29, 29, 29)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(botonInicio))
                    .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSalir))
                    .addComponent(botonInicio))
                .addGap(19, 19, 19))
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
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
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

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        regresarInicio();
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_botonLoginActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel contenedorDatos;
    public static javax.swing.JLabel fieldApellido;
    public static javax.swing.JLabel fieldCUIL;
    public static javax.swing.JLabel fieldCurso;
    public static javax.swing.JLabel fieldEmail;
    public static javax.swing.JLabel fieldMateria;
    public static javax.swing.JLabel fieldNombre;
    public static javax.swing.JLabel fieldPassword;
    public static javax.swing.JLabel fieldTelefono;
    public static javax.swing.JLabel fieldTipoProfe;
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
    private void regresarInicio() {
        this.dispose();
        login = new VentanaLogin();
        login.setVisible(true);
    }

    private void iniciarSesion() {
        usuario = fieldUsuario.getText();
        apellido = fieldApellido.getText();
        CUIL = Long.parseLong(fieldCUIL.getText());
        email = fieldEmail.getText();
        nombre = fieldNombre.getText();
        password = fieldPassword.getText();
        telefono = Integer.parseInt(fieldTelefono.getText());
        materia = fieldMateria.getText();
        tipoProfe = fieldTipoProfe.getText();
        curso = fieldCurso.getText();
        loginBoton = new consultasSQL();
        loginBoton.guardarUsuario(usuario);
        loginBoton.guardarDatosProfe(usuario, password, nombre, apellido, email, curso, tipoProfe, materia, telefono, CUIL);
        loginBoton.loginRegistradoProfe();
        if (loginBoton.credencialesValidas()) {
            this.dispose();
        }
    }
}
