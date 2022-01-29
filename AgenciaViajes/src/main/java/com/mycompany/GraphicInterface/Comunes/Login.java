/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.Comunes;

import javax.swing.ImageIcon;
import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Director;
import com.mycompany.Administracion.Gestor;
import com.mycompany.Administracion.Persona;
import com.mycompany.GraphicInterface.Cliente.MainMenuCliente;
import com.mycompany.GraphicInterface.Director.MainMenuDirector;
import com.mycompany.GraphicInterface.Empleado.MainMenuEmpleado;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Login extends javax.swing.JFrame {

    private static final String RUTA_USUARIOS = "./data/users";
    private final String RUTA_PAQUETES = "./data/paquetes";
    private final String RUTA_HISTORIALES = "./data/historiales";
    private final String RUTA_RESERVAS = "./data/reservas";
    public static ArrayList<Persona> usuarios;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        ImageIcon icon = new ImageIcon("./images/Logo.png");
        lbl_Logo.setIcon(icon);
        lbl_Logo.setText("");
        usuarios = loadUsers();
        System.out.println(usuarios);
        lbl_registro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_username = new javax.swing.JLabel();
        lbl_Logo = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lbl_registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbl_username.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_username.setText("Username:");

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("Logo");

        tf_username.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_username.setSize(new java.awt.Dimension(76, 23));

        lbl_password.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_password.setText("Password:");

        pf_password.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btn_login.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        lbl_registro.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registro.setText("¿No estas registrado?");
        lbl_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_username))
                    .addComponent(lbl_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_password, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(pf_password))
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_registro)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String usuario = tf_username.getText();
        String password = pf_password.getText();
        Persona usuarioActual = null;
        if (usuario != null && password != null) {
            for (Persona usuario1 : usuarios) {
                if (usuario1.getEmail().equals(usuario) && usuario1.getPassword().equals(password)) {
                    usuarioActual = usuario1;
                }
            }
            if (usuarioActual != null) {
                if (usuarioActual instanceof Director) {
                    MainMenuDirector window = new MainMenuDirector(usuarios);
                    window.setVisible(true);
                } else if ( usuarioActual instanceof Gestor) {
                    MainMenuEmpleado window = new MainMenuEmpleado(usuarios);
                    window.setVisible(true);
                } else if (usuarioActual instanceof Cliente) {
                    MainMenuCliente window = new MainMenuCliente((Cliente) usuarioActual);
                    window.setVisible(true);
                } else {
                    System.out.print("ERROR");
                }
            }
        }

        this.setVisible(false);
        /*if (usuarios != null ){
            int iterator = 0;
            while (iterator < usuarios.size()){
                
                iterator ++;
            }
        }
        else {
            MainMenuDirector window = new MainMenuDirector(usuarios);
            window.setVisible(true);
            this.setVisible(false);
        }*/

        //this.setVisible(false);
        System.out.println("Click en boton");
    }//GEN-LAST:event_btn_loginActionPerformed

    private void lbl_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registroMouseClicked
        // TODO add your handling code here:
        System.out.println("Click en lbl");
    }//GEN-LAST:event_lbl_registroMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables

    public static ArrayList<Persona> loadUsers() {
        ArrayList<Persona> users = new ArrayList();
        try {
            FileInputStream fichero = new FileInputStream(RUTA_USUARIOS);
            ObjectInputStream file = new ObjectInputStream(fichero);
            users = ((ArrayList<Persona>) file.readObject());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return users;
    }
    
    public static void saveUsers(){
        try {
            FileOutputStream fichero = new FileOutputStream(RUTA_USUARIOS);

            try (ObjectOutputStream usuario = new ObjectOutputStream(fichero)) {
                usuario.writeObject(usuarios);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
