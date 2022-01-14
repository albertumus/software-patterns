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
public abstract class EstadoEmpleado implements AccionesEmpleado {
    
    private Empleado empleado;
    
    public EstadoEmpleado() {}  
    
    public void setEmpleado( Empleado e ) {
        this.empleado = e;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    public abstract void pagarSueldo();
    public abstract void despedir();
    public abstract void darDeBaja();
    public abstract void darDeAlta();
    public abstract void readminitr();
    
}
