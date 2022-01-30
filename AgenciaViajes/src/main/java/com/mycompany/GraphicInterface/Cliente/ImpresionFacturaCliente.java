/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Cliente;

import static com.mycompany.GraphicInterface.Cliente.MainMenuCliente.usuarioActual;
import com.mycompany.GraphicInterface.Comunes.ConfirmacionOperacion;
import com.mycompany.Reservas.Reserva;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

/**
 *
 * @author razvanvc
 */
public class ImpresionFacturaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ImpresionFacturaCliente
     */
    public ImpresionFacturaCliente() {
        initComponents();
        ImageIcon icon = new ImageIcon("./images/Logo.png");
        lbl_Logo.setIcon(icon);
        lbl_Logo.setText("");
        loadComboReservas();
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
        lbl_Instrucciones2 = new javax.swing.JLabel();
        lbl_Reserva = new javax.swing.JLabel();
        cb_Reserva = new javax.swing.JComboBox<>();
        btn_Imprimir = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Instrucciones2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones2.setText("1. Seleccione la reserva que quieras ver:");

        lbl_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Reserva.setText("Reserva:");

        cb_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una reserva" }));

        btn_Imprimir.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Imprimir.setText("Imprimir Factura");
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Instrucciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Volver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Instrucciones2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Reserva)
                    .addComponent(cb_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
        // TODO add your handling code here:
        if (cb_Reserva.getSelectedIndex()!=0){
            Reserva r = usuarioActual.getHistorial().getReservas().get(cb_Reserva.getSelectedIndex()-1);
            r.imprimirFactura();
            ConfirmacionOperacion window = new ConfirmacionOperacion("Se ha impreso la factura");
            window.setVisible(true);
        }
    }//GEN-LAST:event_btn_ImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(ImpresionFacturaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpresionFacturaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpresionFacturaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpresionFacturaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpresionFacturaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Reserva;
    private javax.swing.JLabel lbl_Instrucciones2;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Reserva;
    // End of variables declaration//GEN-END:variables

    private void loadComboReservas() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        usuarioActual.getHistorial().getReservas().forEach(reserva -> {
            cb_Reserva.addItem(format.format(reserva.getPaquete().getDesde()) + " - " + format.format(reserva.getPaquete().getHasta()));
        });
    }
}
