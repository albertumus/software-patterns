package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class VueloClaseTurista extends Vuelo {
    
    public final Integer precio = 150;
    private static VueloClaseTurista instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }


    public static VueloClaseTurista getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new VueloClaseTurista();
        }
        return instancia;
    }
}