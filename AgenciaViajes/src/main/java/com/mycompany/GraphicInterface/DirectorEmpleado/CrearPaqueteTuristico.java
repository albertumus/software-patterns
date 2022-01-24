/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.GraphicInterface.DirectorEmpleado;

import com.mycompany.Administracion.Persona;
import com.mycompany.GraphicInterface.Comunes.ConfirmacionOperacion;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class CrearPaqueteTuristico extends javax.swing.JFrame {

    /**
     * Creates new form CrearPaqueteTuristico
     */
    private static ArrayList<Persona> usuarios;
    public CrearPaqueteTuristico(ArrayList<Persona> usuarios) {
        initComponents();
        CrearPaqueteTuristico.usuarios = usuarios;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtng_Cliente = new javax.swing.ButtonGroup();
        rbtng_Paquete = new javax.swing.ButtonGroup();
        cbbtng_Extras = new javax.swing.ButtonGroup();
        lbl_Logo = new javax.swing.JLabel();
        lbl_Instrucciones1 = new javax.swing.JLabel();
        rb_ClienteRegistrado = new javax.swing.JRadioButton();
        rb_ClienteNuevo = new javax.swing.JRadioButton();
        lbl_Instrucciones2 = new javax.swing.JLabel();
        lbl_DNI1 = new javax.swing.JLabel();
        cb_DNI = new javax.swing.JComboBox<>();
        lbl_Instrucciones3 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        lbl_Apellidos = new javax.swing.JLabel();
        tf_Apellidos = new javax.swing.JTextField();
        lbl_DNI2 = new javax.swing.JLabel();
        tf_DNI = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        tf_Direccion = new javax.swing.JTextField();
        lbl_Genero = new javax.swing.JLabel();
        cb_Genero = new javax.swing.JComboBox<>();
        lbl_Tarjeta = new javax.swing.JLabel();
        tf_Tarjeta = new javax.swing.JTextField();
        btn_Comprobar = new javax.swing.JButton();
        lbl_Instrucciones4 = new javax.swing.JLabel();
        rb_PaquetePrehecho = new javax.swing.JRadioButton();
        rb_PaquetePersonalizado = new javax.swing.JRadioButton();
        lbl_FechaInicio = new javax.swing.JLabel();
        lbl_FechaFin = new javax.swing.JLabel();
        ftf_FechaInicio = new javax.swing.JFormattedTextField();
        ftf_FechaInicio1 = new javax.swing.JFormattedTextField();
        lbl_Instrucciones5 = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        cb_Tipo = new javax.swing.JComboBox<>();
        lbl_Hotel = new javax.swing.JLabel();
        cb_Hotel = new javax.swing.JComboBox<>();
        lbl_Instrucciones6 = new javax.swing.JLabel();
        lbl_Hotel2 = new javax.swing.JLabel();
        cb_Hotel2 = new javax.swing.JComboBox<>();
        lbl_Vuelo = new javax.swing.JLabel();
        cb_Vuelo = new javax.swing.JComboBox<>();
        lbl_Instrucciones7 = new javax.swing.JLabel();
        cb_Desayuno = new javax.swing.JCheckBox();
        cb_Masaje = new javax.swing.JCheckBox();
        cb_SPA = new javax.swing.JCheckBox();
        cb_TransporteVIP = new javax.swing.JCheckBox();
        btn_Reservar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setText("logo");

        lbl_Instrucciones1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones1.setText("1. Seleccione el tipo de cliente:");

        rbtng_Cliente.add(rb_ClienteRegistrado);
        rb_ClienteRegistrado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rb_ClienteRegistrado.setText("Cliente Registrado");

        rbtng_Cliente.add(rb_ClienteNuevo);
        rb_ClienteNuevo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rb_ClienteNuevo.setText("Nuevo Cliente");

        lbl_Instrucciones2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones2.setText("Cliente Registrado:");

        lbl_DNI1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_DNI1.setText("DNI:");

        cb_DNI.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_DNI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cliente" }));
        cb_DNI.setEnabled(false);

        lbl_Instrucciones3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones3.setText("Alta de Cliente:");

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

        lbl_DNI2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_DNI2.setText("DNI:");

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

        cb_Genero.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Hombre", "Mujer", "Otro" }));
        cb_Genero.setEnabled(false);

        lbl_Tarjeta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Tarjeta.setText("Sueldo:");

        tf_Tarjeta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_Tarjeta.setToolTipText("");
        tf_Tarjeta.setEnabled(false);

        btn_Comprobar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Comprobar.setText("Comprobar");
        btn_Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprobarActionPerformed(evt);
            }
        });

        lbl_Instrucciones4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones4.setText("2. Seleccione el tipo de paquete:");

        rbtng_Paquete.add(rb_PaquetePrehecho);
        rb_PaquetePrehecho.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rb_PaquetePrehecho.setSelected(true);
        rb_PaquetePrehecho.setText("Paquete Prehecho");

        rbtng_Paquete.add(rb_PaquetePersonalizado);
        rb_PaquetePersonalizado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rb_PaquetePersonalizado.setText("Paquete Personalizado");

        lbl_FechaInicio.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaInicio.setText("Fecha Salida");

        lbl_FechaFin.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_FechaFin.setText("Fecha Regreso");

        ftf_FechaInicio.setToolTipText("");

        ftf_FechaInicio1.setToolTipText("");

        lbl_Instrucciones5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones5.setText("Paquetes Prehechos:");

        lbl_Tipo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Tipo.setText("Tipo de paquete:");

        cb_Tipo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Paquete Ahorro", "PaqueteLujo" }));
        cb_Tipo.setEnabled(false);

        lbl_Hotel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Hotel.setText("Estrellas del Hotel:");

        cb_Hotel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Hotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un hotel", "Hotel 5 estrellas", "Hotel 4 estrellas", "Hotel 3 estrellas" }));
        cb_Hotel.setEnabled(false);

        lbl_Instrucciones6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_Instrucciones6.setText("Paquetes Personalizado:");

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

        cbbtng_Extras.add(cb_Desayuno);
        cb_Desayuno.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Desayuno.setText("Desayuno");

        cbbtng_Extras.add(cb_Masaje);
        cb_Masaje.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_Masaje.setText("Masaje");

        cbbtng_Extras.add(cb_SPA);
        cb_SPA.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_SPA.setText("SPA");

        cbbtng_Extras.add(cb_TransporteVIP);
        cb_TransporteVIP.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cb_TransporteVIP.setText("Transporte VIP");

        btn_Reservar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Reservar.setText("Reservar");
        btn_Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReservarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Instrucciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_DNI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Nombre))
                            .addComponent(lbl_Instrucciones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_DNI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_Apellidos))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Instrucciones2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_ClienteRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(rb_ClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Comprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Instrucciones5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_PaquetePrehecho, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(rb_PaquetePersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Instrucciones4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(ftf_FechaInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Instrucciones6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lbl_FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Hotel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Hotel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Desayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_Masaje, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(cb_SPA, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_TransporteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbl_Instrucciones7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Instrucciones1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_ClienteRegistrado)
                            .addComponent(rb_ClienteNuevo))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Instrucciones2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_DNI1)
                            .addComponent(cb_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Instrucciones3)
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
                            .addComponent(lbl_DNI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Instrucciones4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_PaquetePersonalizado)
                            .addComponent(rb_PaquetePrehecho))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_FechaInicio)
                            .addComponent(lbl_FechaFin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftf_FechaInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Instrucciones5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Tipo)
                            .addComponent(cb_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Hotel)
                            .addComponent(cb_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(lbl_Instrucciones6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Hotel2)
                            .addComponent(cb_Hotel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Vuelo)
                            .addComponent(cb_Vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Instrucciones7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_Desayuno)
                    .addComponent(cb_SPA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_Masaje)
                    .addComponent(cb_TransporteVIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReservarActionPerformed
        // TODO add your handling code here:
        ConfirmacionOperacion window = new ConfirmacionOperacion("Se ha realizado una reserva correctamente");
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ReservarActionPerformed

    private void btn_ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprobarActionPerformed
        // TODO add your handling code here:
        System.out.println("Proceso de comprobacion y registro de usuario, tambien se activa la segunda parte");
    }//GEN-LAST:event_btn_ComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPaqueteTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPaqueteTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPaqueteTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPaqueteTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPaqueteTuristico(usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comprobar;
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_DNI;
    private javax.swing.JCheckBox cb_Desayuno;
    private javax.swing.JComboBox<String> cb_Genero;
    private javax.swing.JComboBox<String> cb_Hotel;
    private javax.swing.JComboBox<String> cb_Hotel2;
    private javax.swing.JCheckBox cb_Masaje;
    private javax.swing.JCheckBox cb_SPA;
    private javax.swing.JComboBox<String> cb_Tipo;
    private javax.swing.JCheckBox cb_TransporteVIP;
    private javax.swing.JComboBox<String> cb_Vuelo;
    private javax.swing.ButtonGroup cbbtng_Extras;
    private javax.swing.JFormattedTextField ftf_FechaInicio;
    private javax.swing.JFormattedTextField ftf_FechaInicio1;
    private javax.swing.JLabel lbl_Apellidos;
    private javax.swing.JLabel lbl_DNI1;
    private javax.swing.JLabel lbl_DNI2;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_FechaFin;
    private javax.swing.JLabel lbl_FechaInicio;
    private javax.swing.JLabel lbl_Genero;
    private javax.swing.JLabel lbl_Hotel;
    private javax.swing.JLabel lbl_Hotel2;
    private javax.swing.JLabel lbl_Instrucciones1;
    private javax.swing.JLabel lbl_Instrucciones2;
    private javax.swing.JLabel lbl_Instrucciones3;
    private javax.swing.JLabel lbl_Instrucciones4;
    private javax.swing.JLabel lbl_Instrucciones5;
    private javax.swing.JLabel lbl_Instrucciones6;
    private javax.swing.JLabel lbl_Instrucciones7;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Tarjeta;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JLabel lbl_Vuelo;
    private javax.swing.JRadioButton rb_ClienteNuevo;
    private javax.swing.JRadioButton rb_ClienteRegistrado;
    private javax.swing.JRadioButton rb_PaquetePersonalizado;
    private javax.swing.JRadioButton rb_PaquetePrehecho;
    private javax.swing.ButtonGroup rbtng_Cliente;
    private javax.swing.ButtonGroup rbtng_Paquete;
    private javax.swing.JTextField tf_Apellidos;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_Direccion;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Tarjeta;
    // End of variables declaration//GEN-END:variables
}
