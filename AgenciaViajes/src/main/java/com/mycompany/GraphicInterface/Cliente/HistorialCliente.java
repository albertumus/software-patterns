/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Cliente;

import com.mycompany.GraphicInterface.Comunes.ConfirmacionOperacion;

/**
 *
 * @author razvanvc
 */
public class HistorialCliente extends javax.swing.JFrame {

    /**
     * Creates new form HistorialCliente
     */
    public HistorialCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Reserva = new javax.swing.JLabel();
        cb_Vuelo = new javax.swing.JComboBox<>();
        ftf_FechaInicio1 = new javax.swing.JFormattedTextField();
        cb_Masaje = new javax.swing.JCheckBox();
        lbl_Hotel2 = new javax.swing.JLabel();
        lbl_FechaFin = new javax.swing.JLabel();
        ftf_FechaInicio = new javax.swing.JFormattedTextField();
        lbl_Instrucciones7 = new javax.swing.JLabel();
        lbl_Vuelo = new javax.swing.JLabel();
        cb_Desayuno = new javax.swing.JCheckBox();
        cb_TransporteVIP = new javax.swing.JCheckBox();
        lbl_FechaInicio = new javax.swing.JLabel();
        lbl_Instrucciones2 = new javax.swing.JLabel();
        cb_SPA = new javax.swing.JCheckBox();
        cb_Hotel2 = new javax.swing.JComboBox<>();
        btn_Volver = new javax.swing.JButton();
        lbl_Instrucciones3 = new javax.swing.JLabel();
        cb_Reserva = new javax.swing.JComboBox<>();
        lbl_Logo = new javax.swing.JLabel();
        btn_PagarCompleto = new javax.swing.JButton();
        btn_PagarParcialmente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Reserva.setText("Reserva:");

        cb_Vuelo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Vuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un vuelo", "Turista", "Primera Clase" }));
        cb_Vuelo.setEnabled(false);

        ftf_FechaInicio1.setToolTipText("");

        cb_Masaje.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Masaje.setText("Masaje");

        lbl_Hotel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Hotel2.setText("Estrellas del Hotel:");

        lbl_FechaFin.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaFin.setText("Fecha Regreso");

        ftf_FechaInicio.setToolTipText("");

        lbl_Instrucciones7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones7.setText("Extras");

        lbl_Vuelo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Vuelo.setText("Tipo de vuelo;");

        cb_Desayuno.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Desayuno.setText("Desayuno");

        cb_TransporteVIP.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_TransporteVIP.setText("Transporte VIP");

        lbl_FechaInicio.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaInicio.setText("Fecha Salida");

        lbl_Instrucciones2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones2.setText("1. Seleccione la reserva que quieras ver:");

        cb_SPA.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_SPA.setText("SPA");

        cb_Hotel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Hotel2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un hotel", "Hotel 5 estrellas", "Hotel 4 estrellas", "Hotel 3 estrellas" }));
        cb_Hotel2.setEnabled(false);

        btn_Volver.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        lbl_Instrucciones3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones3.setText("Detalles de la reserva:");

        cb_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una reserva" }));

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        btn_PagarCompleto.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_PagarCompleto.setText("Pago Completo");
        btn_PagarCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagarCompletoActionPerformed(evt);
            }
        });

        btn_PagarParcialmente.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_PagarParcialmente.setText("Pago Parcial");
        btn_PagarParcialmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagarParcialmenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Desayuno, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cb_Masaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_SPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_TransporteVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ftf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ftf_FechaInicio1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_FechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_Instrucciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Instrucciones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Instrucciones7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Vuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Hotel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_Vuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_Hotel2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_PagarCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_PagarParcialmente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(lbl_Instrucciones3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaInicio)
                    .addComponent(lbl_FechaFin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftf_FechaInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hotel2)
                    .addComponent(cb_Hotel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Vuelo)
                    .addComponent(cb_Vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Instrucciones7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Desayuno)
                    .addComponent(cb_SPA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Masaje)
                    .addComponent(cb_TransporteVIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_PagarCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PagarParcialmente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PagarCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagarCompletoActionPerformed
        // TODO add your handling code here:
        ConfirmacionOperacion window = new ConfirmacionOperacion("Se ha realizado el pago completo");
        window.setVisible(true);
    }//GEN-LAST:event_btn_PagarCompletoActionPerformed

    private void btn_PagarParcialmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagarParcialmenteActionPerformed
        // TODO add your handling code here:
        ConfirmacionOperacion window = new ConfirmacionOperacion("Se ha realizado el pago completo");
        window.setVisible(true);
    }//GEN-LAST:event_btn_PagarParcialmenteActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_PagarCompleto;
    private javax.swing.JButton btn_PagarParcialmente;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JCheckBox cb_Desayuno;
    private javax.swing.JComboBox<String> cb_Hotel2;
    private javax.swing.JCheckBox cb_Masaje;
    private javax.swing.JComboBox<String> cb_Reserva;
    private javax.swing.JCheckBox cb_SPA;
    private javax.swing.JCheckBox cb_TransporteVIP;
    private javax.swing.JComboBox<String> cb_Vuelo;
    private javax.swing.JFormattedTextField ftf_FechaInicio;
    private javax.swing.JFormattedTextField ftf_FechaInicio1;
    private javax.swing.JLabel lbl_FechaFin;
    private javax.swing.JLabel lbl_FechaInicio;
    private javax.swing.JLabel lbl_Hotel2;
    private javax.swing.JLabel lbl_Instrucciones2;
    private javax.swing.JLabel lbl_Instrucciones3;
    private javax.swing.JLabel lbl_Instrucciones7;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Reserva;
    private javax.swing.JLabel lbl_Vuelo;
    // End of variables declaration//GEN-END:variables
}
