package com.mycompany.Administracion;

import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class FichaCliente extends Ficha {
        
    
    private Tarjeta tarjeta; 
    private Empleado empleadoReferencia;

    public FichaCliente(String dni, String genero, String direccion, Date fechaAlta, Tarjeta tarjeta, Empleado empleadoReferencia) {
        super( dni, genero, direccion, fechaAlta );
        this.tarjeta = tarjeta;
        this.empleadoReferencia = empleadoReferencia;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Empleado getEmpleadoReferencia() {
        return empleadoReferencia;
    }

    public void setEmpleadoReferencia(Empleado empleadoReferencia) {
        this.empleadoReferencia = empleadoReferencia;
    }

    
    

}