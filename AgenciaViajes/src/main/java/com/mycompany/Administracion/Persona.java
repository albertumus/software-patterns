/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Administracion;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    private String nombre;
    private String apellidos;
    private String email;
    private final String password;
    private final Historial historial;

    public Persona(String nombre, String apellidos, String email, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.historial = new Historial();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
