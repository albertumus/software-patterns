package com.mycompany.Paquetes;

import java.io.Serializable;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public abstract class Vuelo implements Serializable {
    
    Integer precio; 
        
    public Integer getPrecio() {
        return precio;
    }

}