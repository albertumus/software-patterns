package com.mycompany.Administracion;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Desactivado extends EstadoEmpleado {

    public Desactivado(){}
        
    @Override
    public void pagarSueldo() {}
    @Override
    public void despedir() {}
    @Override
    public void darDeBaja() {}
    @Override
    public  void darDeAlta() {}
    @Override
    public  void readminitr() {
        this.getEmpleado().setEstado(new Activo());
        System.out.println("Empleado dado de alta");
    }

}