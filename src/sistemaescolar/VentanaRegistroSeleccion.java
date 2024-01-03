package sistemaescolar;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaRegistroSeleccion extends javax.swing.JFrame {

    RegistroEstudiante e = new RegistroEstudiante();
    VentanaVerificacionEdad verificacion = new VentanaVerificacionEdad();

    public VentanaRegistroSeleccion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Colegio San José - Registro");
        Image icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        setIconImage(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        panelDatosSuperior = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        estudianteOpcion = new javax.swing.JRadioButton();
        profesorOpcion = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(51, 0, 51));

        panelDatosSuperior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        panelDatosSuperior.setOpaque(false);

        panelDatos.setBackground(new java.awt.Color(102, 0, 103));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("¡Hola!, Elige por favor tu cargo educativo");

        botonSiguiente.setBackground(new java.awt.Color(102, 0, 255));
        botonSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setFocusPainted(false);
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        estudianteOpcion.setBackground(new java.awt.Color(102, 0, 103));
        buttonGroup1.add(estudianteOpcion);
        estudianteOpcion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        estudianteOpcion.setForeground(new java.awt.Color(255, 255, 255));
        estudianteOpcion.setText("Estudiante");
        estudianteOpcion.setFocusPainted(false);

        profesorOpcion.setBackground(new java.awt.Color(102, 0, 103));
        buttonGroup1.add(profesorOpcion);
        profesorOpcion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        profesorOpcion.setForeground(new java.awt.Color(255, 255, 255));
        profesorOpcion.setText("Profesor");
        profesorOpcion.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(estudianteOpcion)
                .addGap(32, 32, 32)
                .addComponent(profesorOpcion)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudianteOpcion)
                    .addComponent(profesorOpcion))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonSiguiente)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panelDatosSuperiorLayout = new javax.swing.GroupLayout(panelDatosSuperior);
        panelDatosSuperior.setLayout(panelDatosSuperiorLayout);
        panelDatosSuperiorLayout.setHorizontalGroup(
            panelDatosSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDatosSuperiorLayout.setVerticalGroup(
            panelDatosSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelDatosSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        boolean estudianteElegido = estudianteOpcion.isSelected();
        boolean profesorElegido = profesorOpcion.isSelected();
        if (estudianteElegido) {
            this.dispose();
            e.setVisible(true);
        } else if (profesorElegido) {
            this.dispose();
            verificacion.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: Por favor selecciona una opción", "ERROR", 0);
        }

    }//GEN-LAST:event_botonSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton estudianteOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosSuperior;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton profesorOpcion;
    // End of variables declaration//GEN-END:variables
}