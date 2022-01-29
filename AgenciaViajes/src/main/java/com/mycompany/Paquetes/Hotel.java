package com.mycompany.Paquetes;

import java.io.Serializable;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public abstract class Hotel implements Serializable {
    
    Integer precio;
    Integer precio_desayuno;
        
    public Integer getPrecio() {
        return precio;
    }
    
    public Integer getPrecioDesayuno() {
        return precio_desayuno;
    }
        
        

}