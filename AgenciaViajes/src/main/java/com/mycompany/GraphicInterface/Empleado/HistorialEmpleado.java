/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Empleado;

/**
 *
 * @author razvanvc
 */
public class HistorialEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form HistorialEmpleado
     */
    public HistorialEmpleado() {
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

        lbl_Logo = new javax.swing.JLabel();
        lbl_Instrucciones1 = new javax.swing.JLabel();
        lbl_DNI1 = new javax.swing.JLabel();
        cb_DNI = new javax.swing.JComboBox<>();
        lbl_Instrucciones2 = new javax.swing.JLabel();
        lbl_Reserva = new javax.swing.JLabel();
        cb_Reserva = new javax.swing.JComboBox<>();
        lbl_FechaInicio = new javax.swing.JLabel();
        ftf_FechaInicio = new javax.swing.JFormattedTextField();
        lbl_FechaFin = new javax.swing.JLabel();
        ftf_FechaInicio1 = new javax.swing.JFormattedTextField();
        lbl_Hotel2 = new javax.swing.JLabel();
        cb_Hotel2 = new javax.swing.JComboBox<>();
        lbl_Vuelo = new javax.swing.JLabel();
        cb_Vuelo = new javax.swing.JComboBox<>();
        lbl_Instrucciones7 = new javax.swing.JLabel();
        cb_Desayuno = new javax.swing.JCheckBox();
        cb_SPA = new javax.swing.JCheckBox();
        cb_TransporteVIP = new javax.swing.JCheckBox();
        cb_Masaje = new javax.swing.JCheckBox();
        lbl_Instrucciones3 = new javax.swing.JLabel();
        btn_Borrar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Instrucciones1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones1.setText("1. Seleccione el DNI del Cliente:");

        lbl_DNI1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_DNI1.setText("DNI:");

        cb_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_DNI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cliente" }));

        lbl_Instrucciones2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones2.setText("2. Seleccione la reserva que quieras ver:");

        lbl_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Reserva.setText("Reserva:");

        cb_Reserva.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cliente" }));

        lbl_FechaInicio.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaInicio.setText("Fecha Salida");

        ftf_FechaInicio.setToolTipText("");

        lbl_FechaFin.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaFin.setText("Fecha Regreso");

        ftf_FechaInicio1.setToolTipText("");

        lbl_Hotel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Hotel2.setText("Estrellas del Hotel:");

        cb_Hotel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Hotel2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un hotel", "Hotel 5 estrellas", "Hotel 4 estrellas", "Hotel 3 estrellas" }));
        cb_Hotel2.setEnabled(false);

        lbl_Vuelo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Vuelo.setText("Tipo de vuelo;");

        cb_Vuelo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Vuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un vuelo", "Turista", "Primera Clase" }));
        cb_Vuelo.setEnabled(false);

        lbl_Instrucciones7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones7.setText("Extras");

        cb_Desayuno.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Desayuno.setText("Desayuno");

        cb_SPA.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_SPA.setText("SPA");

        cb_TransporteVIP.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_TransporteVIP.setText("Transporte VIP");

        cb_Masaje.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Masaje.setText("Masaje");

        lbl_Instrucciones3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones3.setText("Detalles de la reserva:");

        btn_Borrar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Borrar.setText("Borrar");

        btn_Modificar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Modificar.setText("Modificar");

        btn_Volver.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Volver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Desayuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Masaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_SPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_TransporteVIP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Instrucciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Instrucciones7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ftf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ftf_FechaInicio1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_FechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_Instrucciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Instrucciones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Vuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Hotel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_Hotel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_Vuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Instrucciones1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DNI1)
                    .addComponent(cb_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Desayuno)
                    .addComponent(cb_SPA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Masaje)
                    .addComponent(cb_TransporteVIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HistorialEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_DNI;
    private javax.swing.JCheckBox cb_Desayuno;
    private javax.swing.JComboBox<String> cb_Hotel2;
    private javax.swing.JCheckBox cb_Masaje;
    private javax.swing.JComboBox<String> cb_Reserva;
    private javax.swing.JCheckBox cb_SPA;
    private javax.swing.JCheckBox cb_TransporteVIP;
    private javax.swing.JComboBox<String> cb_Vuelo;
    private javax.swing.JFormattedTextField ftf_FechaInicio;
    private javax.swing.JFormattedTextField ftf_FechaInicio1;
    private javax.swing.JLabel lbl_DNI1;
    private javax.swing.JLabel lbl_FechaFin;
    private javax.swing.JLabel lbl_FechaInicio;
    private javax.swing.JLabel lbl_Hotel2;
    private javax.swing.JLabel lbl_Instrucciones1;
    private javax.swing.JLabel lbl_Instrucciones2;
    private javax.swing.JLabel lbl_Instrucciones3;
    private javax.swing.JLabel lbl_Instrucciones7;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Reserva;
    private javax.swing.JLabel lbl_Vuelo;
    // End of variables declaration//GEN-END:variables
}
