package com.mycompany.Administracion;

import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Cliente extends Persona {

    private FichaCliente ficha;
    
    public Cliente( String nombre, 
            String apellidos, 
            Empleado e, 
            String numeroTarjeta,
            String dni, 
            String genero,
            String direccion, 
            Date fechaAlta ){
        super( nombre, apellidos );
        this.ficha = new FichaCliente( 
                dni, 
                genero, 
                direccion, 
                fechaAlta,
                new Tarjeta(numeroTarjeta), e  );
        e.getFicha().añadirCliente(this);
    }
    
    public  FichaCliente getFicha() {
        return this.ficha;
    }


}