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
public class BajaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form BajaEmpleado
     */
    private static ArrayList<Persona> usuarios;
    public BajaEmpleado(ArrayList<Persona> usuarios) {
        initComponents();
        BajaEmpleado.usuarios = usuarios;
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
        btn_Baja = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        cb_Empleado = new javax.swing.JComboBox<>();

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Instrucciones.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Instrucciones.setText("<html>Para dar de baja un empleado seleccione su ID de la lista <br/>\ny después confirme que es el empleado que desea dar <br/>\nde baja");
        lbl_Instrucciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl_Nombre.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Nombre.setText("Nombre:");

        tf_Nombre.setEditable(false);
        tf_Nombre.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Nombre.setToolTipText("");

        lbl_Apellidos.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Apellidos.setText("Apellidos:");

        tf_Apellidos.setEditable(false);
        tf_Apellidos.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Apellidos.setToolTipText("");

        lbl_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_DNI.setText("DNI:");

        tf_DNI.setEditable(false);
        tf_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_DNI.setToolTipText("");

        btn_Baja.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Baja.setText("Baja Empleado");
        btn_Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BajaActionPerformed(evt);
            }
        });

        btn_Volver.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        cb_Empleado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un empleado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Baja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_Apellidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Instrucciones)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_Empleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BajaActionPerformed
        // TODO crear el usuario, comprobar los campos y serializarlo

        ConfirmacionOperacion window = new ConfirmacionOperacion("Se ha eliminado el empleado correctamente");
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BajaActionPerformed

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
            java.util.logging.Logger.getLogger(BajaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaEmpleado(usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Baja;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Empleado;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_Instrucciones;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JTextField tf_Apellidos;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_Nombre;
    // End of variables declaration//GEN-END:variables
}
