package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class HotelCuatroEstrellas extends Hotel {
    
    public final Integer precio             = 100;
    public final Integer precio_desayuno    = 10;
    private static HotelCuatroEstrellas instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }
    
    @Override
    public Integer getPrecioDesayuno() {
        return this.precio_desayuno;
    }



    public static HotelCuatroEstrellas getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new HotelCuatroEstrellas();
        }
        return instancia;
    }

}