/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface;

/**
 *
 * @author razvanvc
 */
public class MainMenuEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form MainMenuEmpleado
     */
    public MainMenuEmpleado() {
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
        lbl_Bienvenida = new javax.swing.JLabel();
        btn_Reservas = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_PaqueteTuristico = new javax.swing.JButton();

        lbl_Logo.setText("logo");

        lbl_Bienvenida.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Bienvenida.setText("!Bienvenido ");

        btn_Reservas.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Reservas.setText("Gestionar Reservas");

        btn_Clientes.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Clientes.setText("Historiales de Clientes");

        btn_Salir.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Salir.setText("Salir");

        btn_PaqueteTuristico.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_PaqueteTuristico.setText("Gestionar Paquetes Turisticos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(btn_Reservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_PaqueteTuristico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Bienvenida)
                .addGap(18, 18, 18)
                .addComponent(btn_PaqueteTuristico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_PaqueteTuristico;
    private javax.swing.JButton btn_Reservas;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel lbl_Bienvenida;
    private javax.swing.JLabel lbl_Logo;
    // End of variables declaration//GEN-END:variables
}
