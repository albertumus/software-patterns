/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Administracion;

import java.util.Date;

public abstract class  Empleado extends Persona implements AccionesEmpleado {
    
    private FichaEmpleado ficha;
    private EstadoEmpleado estado;
    
    public Empleado( String nombre, String apellidos, String dni, String genero, String direccion, Date fechaAlta, String identificador, Integer sueldo, String numeroSS, String estadoCivil ) {
        super( nombre, apellidos );
        this.ficha = new FichaEmpleado( 
                dni, 
                genero,  
                direccion,  
                fechaAlta,
                identificador,  
                sueldo,  
                numeroSS,  
                estadoCivil );
        this.estado = new Activo();
        this.estado.setEmpleado(this);
    }
    
        
    public void pagarSueldo() {
        this.estado.pagarSueldo();
    }
    public void despedir() {
        this.estado.despedir();
    }
 
   
    public void darDeBaja() {
        this.estado.darDeBaja();
    }
        
    public void darDeAlta() {
        this.estado.darDeAlta();
    }
                 
    public void readminitr() {
        this.estado.readminitr();
    }
    
    public abstract void añadirSubordinado(Empleado e);
    public abstract void eliminarSubordinado(Empleado e);
    
    public FichaEmpleado getFicha() {
        return this.ficha;
    }

    public EstadoEmpleado getEstado() {
        return estado;
    }

    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
        this.estado.setEmpleado(this);
    }
    
    
    
    
 
    
    
}
