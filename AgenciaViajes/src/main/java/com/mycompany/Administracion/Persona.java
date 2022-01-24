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
    
    public String nombre;
    public String apellidos;
    private String email;
    
    public Historial historial;
    
    public Persona( String nombre, String apellidos, String email, String password) {
        this.nombre     = nombre;
        this.apellidos  = apellidos;
        this.email = email;
        this.historial  = new Historial();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    

    public Historial getHistorial() {
        return historial;
    }
    
}
