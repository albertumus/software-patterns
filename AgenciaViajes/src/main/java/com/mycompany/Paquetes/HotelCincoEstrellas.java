package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class HotelCincoEstrellas extends Hotel {
    
    public final Integer precio             = 250;
    public final Integer precio_desayuno    = 20;
    private static HotelCincoEstrellas instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }
    
    @Override
    public Integer getPrecioDesayuno() {
        return this.precio_desayuno;
    }

    public static HotelCincoEstrellas getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new HotelCincoEstrellas();
        }
        return instancia;
    }

}