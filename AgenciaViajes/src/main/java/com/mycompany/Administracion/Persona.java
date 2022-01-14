/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Administracion;

/**
 *
 * @author admin
 */
public abstract class Persona {
    
    public String nombre;
    public String apellidos;
    
    public Historial historial;
    
    public Persona( String nombre, String apellidos ) {
        this.nombre     = nombre;
        this.apellidos  = apellidos;
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
