package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class VueloPrimeraClase extends Vuelo {
    
    public final Integer precio = 350;
    private static VueloPrimeraClase instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }


    public static VueloPrimeraClase getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new VueloPrimeraClase();
        }
        return instancia;
    }

}