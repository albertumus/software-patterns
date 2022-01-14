package com.mycompany.Administracion;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:07
 */
public class Activo extends EstadoEmpleado {

    public Activo(){}
    
    @Override
    public void pagarSueldo() {
        System.out.println("Sueldo pagado de " + this.getEmpleado().getFicha().getSueldo() );
    }
    @Override
    public void despedir() {
        this.getEmpleado().setEstado(new Desactivado());
        System.out.println("Empleado despedido");
        
    }
    @Override
    public void darDeBaja() {
        this.getEmpleado().setEstado(new Baja());
        System.out.println("Empleado dado de baja");
        
    }
    @Override
    public  void darDeAlta() {}
    @Override
    public  void readminitr() {}


}