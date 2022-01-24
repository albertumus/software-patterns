/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Empleado;

import com.mycompany.Administracion.Persona;
import com.mycompany.GraphicInterface.DirectorEmpleado.CrearPaqueteTuristico;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class MainMenuEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuEmpleado
     */
    private static ArrayList<Persona> usuarios;
    public MainMenuEmpleado(ArrayList<Persona> usuarios) {
        initComponents();
        this.usuarios = usuarios;
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
        lbl_Bienvenida = new javax.swing.JLabel();
        btn_PaqueteTuristico = new javax.swing.JButton();
        btn_Reservas = new javax.swing.JButton();
        btn_Facturas = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Bienvenida.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Bienvenida.setText("!Bienvenido ");

        btn_PaqueteTuristico.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_PaqueteTuristico.setText("Gestionar Paquetes Turisticos");
        btn_PaqueteTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PaqueteTuristicoActionPerformed(evt);
            }
        });

        btn_Reservas.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Reservas.setText("Gestionar Reservas");
        btn_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReservasActionPerformed(evt);
            }
        });

        btn_Facturas.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Facturas.setText("Imprimir Factura");
        btn_Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FacturasActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(btn_Reservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_PaqueteTuristico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Facturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Bienvenida)
                .addGap(18, 18, 18)
                .addComponent(btn_PaqueteTuristico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FacturasActionPerformed
        // TODO add your handling code here:
        ImpresionFacturaEmpleado window = new ImpresionFacturaEmpleado();
        window.setVisible(true);
        
    }//GEN-LAST:event_btn_FacturasActionPerformed

    private void btn_PaqueteTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PaqueteTuristicoActionPerformed
        // TODO add your handling code here:
        CrearPaqueteTuristico window = new CrearPaqueteTuristico(usuarios);
        window.setVisible(true);
    }//GEN-LAST:event_btn_PaqueteTuristicoActionPerformed

    private void btn_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReservasActionPerformed
        // TODO add your handling code here:
        HistorialEmpleado window = new HistorialEmpleado();
        window.setVisible(true);
    }//GEN-LAST:event_btn_ReservasActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuEmpleado(usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Facturas;
    private javax.swing.JButton btn_PaqueteTuristico;
    private javax.swing.JButton btn_Reservas;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel lbl_Bienvenida;
    private javax.swing.JLabel lbl_Logo;
    // End of variables declaration//GEN-END:variables
}
