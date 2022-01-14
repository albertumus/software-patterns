package com.mycompany.Administracion;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Baja extends EstadoEmpleado {

    public Baja(){}
        
    @Override
    public void pagarSueldo() {
        System.out.println("Sueldo pagado de " + this.getEmpleado().getFicha().getSueldo() + "por la SS" );
    }
    @Override
    public void despedir() {}
    @Override
    public void darDeBaja() {}
    @Override
    public  void darDeAlta() {
        this.getEmpleado().setEstado(new Activo());
        System.out.println("Empleado dado de alta" );

    }
    @Override
    public  void readminitr() {}


}