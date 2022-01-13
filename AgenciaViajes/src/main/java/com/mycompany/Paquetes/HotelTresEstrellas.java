package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class HotelTresEstrellas extends Hotel {
    
    public final Integer precio             = 50;
    public final Integer precio_desayuno    = 5;
    private static HotelTresEstrellas instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }
    
    @Override
    public Integer getPrecioDesayuno() {
        return this.precio_desayuno;
    }



    public static HotelTresEstrellas getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new HotelTresEstrellas();
        }
        return instancia;
    }

}