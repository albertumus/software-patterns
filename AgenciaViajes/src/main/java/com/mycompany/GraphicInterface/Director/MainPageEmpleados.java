/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Director;

import com.mycompany.Administracion.Persona;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class MainPageEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form MainPageEmpleados
     */
    private static ArrayList<Persona> usuarios;
    public MainPageEmpleados(ArrayList<Persona> usuarios) {
        initComponents();
        MainPageEmpleados.usuarios = usuarios;
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
        btn_Annadir = new javax.swing.JButton();
        btn_Baja = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Detalles = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        btn_Annadir.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Annadir.setText("Añadir Empleado");
        btn_Annadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnnadirActionPerformed(evt);
            }
        });

        btn_Baja.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Baja.setText("Baja Empleado");
        btn_Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BajaActionPerformed(evt);
            }
        });

        btn_Modificar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Modificar.setText("Modificar Empleado");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Detalles.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Detalles.setText("Detalles Empleado");
        btn_Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetallesActionPerformed(evt);
            }
        });

        btn_Volver.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Annadir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Annadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnnadirActionPerformed
        // TODO add your handling code here:
        AnnadirEmpleado window = new AnnadirEmpleado(usuarios);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AnnadirActionPerformed

    private void btn_BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BajaActionPerformed
        // TODO add your handling code here:
        BajaEmpleado window = new BajaEmpleado(usuarios);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BajaActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:
        EditarEmpleado window = new EditarEmpleado(usuarios);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetallesActionPerformed
        // TODO add your handling code here:
        VerEmpleado window = new VerEmpleado(usuarios);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DetallesActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageEmpleados(usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Annadir;
    private javax.swing.JButton btn_Baja;
    private javax.swing.JButton btn_Detalles;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel lbl_Logo;
    // End of variables declaration//GEN-END:variables
}
