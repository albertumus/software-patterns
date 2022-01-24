/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Director;

import com.mycompany.Administracion.Persona;
import com.mycompany.GraphicInterface.Comunes.ConfirmacionOperacion;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class VerEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form AnnadirEmpleado
     */
    private static ArrayList<Persona> usuarios;
    public VerEmpleado(ArrayList<Persona> usuarios) {
        initComponents();
        VerEmpleado.usuarios = usuarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Logo = new javax.swing.JLabel();
        lbl_Instrucciones = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        lbl_Apellidos = new javax.swing.JLabel();
        tf_Apellidos = new javax.swing.JTextField();
        lbl_DNI = new javax.swing.JLabel();
        tf_DNI = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        tf_Direccion = new javax.swing.JTextField();
        lbl_Genero = new javax.swing.JLabel();
        lbl_Sueldo = new javax.swing.JLabel();
        tfnd_Sueldo = new javax.swing.JTextField();
        lbl_NSS = new javax.swing.JLabel();
        tf_NSS = new javax.swing.JTextField();
        lbl_EstadoCivil = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        cb_Empleado = new javax.swing.JComboBox<>();
        tf_Genero = new javax.swing.JTextField();
        tf_EstadoCivil = new javax.swing.JTextField();
        lbl_FechaAlta = new javax.swing.JLabel();
        tf_FechaAlta = new javax.swing.JTextField();
        lbl_Nombre1 = new javax.swing.JLabel();
        tf_Nombre1 = new javax.swing.JTextField();

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Instrucciones.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones.setText("Seleccione un empleado y edite los campos deseados");

        lbl_Nombre.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Nombre.setText("Nombre:");

        tf_Nombre.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Nombre.setToolTipText("");
        tf_Nombre.setEnabled(false);

        lbl_Apellidos.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Apellidos.setText("Apellidos:");

        tf_Apellidos.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Apellidos.setToolTipText("");
        tf_Apellidos.setEnabled(false);

        lbl_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_DNI.setText("DNI:");

        tf_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_DNI.setToolTipText("");
        tf_DNI.setEnabled(false);

        lbl_Direccion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Direccion.setText("Dirección:");

        tf_Direccion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Direccion.setToolTipText("");
        tf_Direccion.setEnabled(false);

        lbl_Genero.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Genero.setText("Género:");

        lbl_Sueldo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Sueldo.setText("Sueldo:");

        tfnd_Sueldo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tfnd_Sueldo.setToolTipText("");
        tfnd_Sueldo.setEnabled(false);

        lbl_NSS.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_NSS.setText("Numero S. Social:");

        tf_NSS.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_NSS.setToolTipText("");
        tf_NSS.setEnabled(false);

        lbl_EstadoCivil.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_EstadoCivil.setText("Estado Civil:");

        btn_Volver.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        cb_Empleado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un empleado" }));

        tf_Genero.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Genero.setToolTipText("");
        tf_Genero.setEnabled(false);

        tf_EstadoCivil.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_EstadoCivil.setToolTipText("");
        tf_EstadoCivil.setEnabled(false);

        lbl_FechaAlta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaAlta.setText("Fecha Alta:");

        tf_FechaAlta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_FechaAlta.setToolTipText("");
        tf_FechaAlta.setEnabled(false);

        lbl_Nombre1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Nombre1.setText("Identificador:");

        tf_Nombre1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Nombre1.setToolTipText("");
        tf_Nombre1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Nombre1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tfnd_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Nombre))
                    .addComponent(lbl_Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_Apellidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(cb_Empleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_EstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_NSS, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbl_FechaAlta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NSS)
                            .addComponent(tf_EstadoCivil)
                            .addComponent(tf_FechaAlta, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Instrucciones)
                .addGap(18, 18, 18)
                .addComponent(cb_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnd_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_FechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerEmpleado(usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Empleado;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_EstadoCivil;
    private javax.swing.JLabel lbl_FechaAlta;
    private javax.swing.JLabel lbl_Genero;
    private javax.swing.JLabel lbl_Instrucciones;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_NSS;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_Sueldo;
    private javax.swing.JTextField tf_Apellidos;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_Direccion;
    private javax.swing.JTextField tf_EstadoCivil;
    private javax.swing.JTextField tf_FechaAlta;
    private javax.swing.JTextField tf_Genero;
    private javax.swing.JTextField tf_NSS;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Nombre1;
    private javax.swing.JTextField tfnd_Sueldo;
    // End of variables declaration//GEN-END:variables
}
