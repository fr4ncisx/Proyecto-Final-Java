/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaescolar;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadb.consultasSQL;
import javadb.registroSQL;
import javadb.validacionSQL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RegistroEstudiante extends javax.swing.JFrame {

    registroSQL registerSQL = new registroSQL();
    validacionSQL validacionSQL = new validacionSQL();
    private boolean hayErrores = true;

    public RegistroEstudiante() {
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginCorrectoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Colegio San José - Registro");
        ocultarWarnings();
        Image icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        setIconImage(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        fieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        fieldDNI = new javax.swing.JTextField();
        fieldTutorNombre = new javax.swing.JTextField();
        bCurso = new javax.swing.JComboBox<>();
        fieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fieldTutorApellido = new javax.swing.JTextField();
        warningUser = new javax.swing.JLabel();
        warningDNI = new javax.swing.JLabel();
        warningPhone = new javax.swing.JLabel();
        warningPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        panelDatos.setBackground(new java.awt.Color(102, 0, 103));
        panelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro de Estudiante");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        bCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Año", "2º Año", "3º Año", "4º Año", "5º Año", "6º Año" }));
        bCurso.setSelectedIndex(-1);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono:");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso:");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre del tutor:");

        botonRegistrar.setBackground(new java.awt.Color(102, 0, 255));
        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.setFocusPainted(false);
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellido del tutor:");

        warningUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning.png"))); // NOI18N

        warningDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning.png"))); // NOI18N

        warningPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning.png"))); // NOI18N

        warningPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning.png"))); // NOI18N

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldTutorApellido))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(fieldTutorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warningPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(warningPhone))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(bCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(warningUser)))
                .addGap(110, 110, 110))
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(fieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(warningDNI))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(warningUser))))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(fieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(warningDNI)))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(warningPhone)))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(bCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(fieldTutorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(fieldTutorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(botonRegistrar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        validacion();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bCurso;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldDNI;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JTextField fieldTutorApellido;
    private javax.swing.JTextField fieldTutorNombre;
    private javax.swing.JTextField fieldUsuario;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel warningDNI;
    private javax.swing.JLabel warningPassword;
    private javax.swing.JLabel warningPhone;
    private javax.swing.JLabel warningUser;
    // End of variables declaration//GEN-END:variables
    private void ocultarWarnings() {
        warningDNI.setVisible(false);
        warningPhone.setVisible(false);
        warningUser.setVisible(false);
        warningPassword.setVisible(false);
    }

    private void validacion() {
        consultasSQL consulta = new consultasSQL();
        String usuario = fieldUsuario.getText();
        String password = String.valueOf(fieldPassword.getPassword());
        String curso = (String) bCurso.getSelectedItem();
        String apellido = fieldApellido.getText();
        String correo = fieldEmail.getText();
        String nombre = fieldNombre.getText();
        String tutorNombre = fieldTutorNombre.getText();
        String tutorApellido = fieldTutorApellido.getText();

        validacionSQL.guardarUsuario(usuario);
        chequearErrores();
        if (hayErrores) {
            return;
        }
        if (validacionSQL.verificarSiExiste()) {
            ocultarWarnings();
            warningUser.setVisible(true);
            JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos");
            return;
        }
        if (!verificarCampos()) {
            int DNI = Integer.parseInt(fieldDNI.getText());
            int telefono = Integer.parseInt(fieldTelefono.getText());
            registerSQL.guardarDatosEstudiante(usuario, password, nombre, apellido, DNI, telefono, correo, curso, tutorNombre, tutorApellido);
            registerSQL.registrarEstudiante();
            consulta.guardarUsuario(usuario);
            consulta.mostrarDatosEstudianteRegistro();
            this.dispose();
        } else {
            ocultarWarnings();
            JOptionPane.showMessageDialog(null, "Revisa los campos sin completar");
        }
    }

    private boolean verificarCampos() {
        return fieldApellido.getText().isBlank()
                || fieldDNI.getText().isBlank()
                || fieldEmail.getText().isBlank()
                || fieldNombre.getText().isBlank()
                || fieldPassword.getText().isBlank()
                || fieldTelefono.getText().isBlank()
                || fieldTutorNombre.getText().isBlank()
                || fieldTutorApellido.getText().isBlank()
                || fieldUsuario.getText().isBlank()
                || bCurso.getSelectedIndex() < 0;
    }

    private void chequearErrores() {
        String campoDNI = fieldDNI.getText();
        String campoTel = fieldTelefono.getText();
        if (campoDNI.isBlank()) {
            hayErrores = true;
            ocultarWarnings();
            warningDNI.setVisible(true);
            JOptionPane.showMessageDialog(null, "El campo DNI está vacio");
            return;
        }
        if (campoTel.isBlank()) {
            hayErrores = true;
            ocultarWarnings();
            warningPhone.setVisible(true);
            JOptionPane.showMessageDialog(null, "El campo Teléfono está vacio");
            return;
        }
        if (!campoDNI.matches("[0-9]+") && !campoTel.matches("[0-9]+")) {
            hayErrores = true;
            ocultarWarnings();
            warningDNI.setVisible(true);
            warningPhone.setVisible(true);
            JOptionPane.showMessageDialog(null, "No se permiten letras o caracteres en DNI y Teléfono");
            return;
        }
        if (!campoDNI.matches("[0-9]+")) {
            hayErrores = true;
            ocultarWarnings();
            warningDNI.setVisible(true);
            JOptionPane.showMessageDialog(null, "No se permiten letras o caracteres en DNI");
            return;
        }
        if (!campoTel.matches("[0-9]+")) {
            hayErrores = true;
            ocultarWarnings();
            warningPhone.setVisible(true);
            JOptionPane.showMessageDialog(null, "No se permiten letras o caracteres en Teléfono");
            return;
        }
        if (fieldPassword.getPassword().length == 0) {
            hayErrores = true;
            ocultarWarnings();
            warningPassword.setVisible(true);
            JOptionPane.showMessageDialog(null, "El campo contraseña está vacio");
            return;
        }
        if (fieldPassword.getPassword().length < 4 || fieldPassword.getPassword().length > 10) {
            hayErrores = true;
            ocultarWarnings();
            warningPassword.setVisible(true);
            JOptionPane.showMessageDialog(null, "La contraseña debe contener caracteres mínimos 4 y máximo 10");
        }
        hayErrores = false;
    }
}
