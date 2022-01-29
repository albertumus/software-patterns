package com.mycompany.Paquetes;

import java.io.Serializable;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public abstract class Vuelo implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    
    Integer precio; 
        
    public Integer getPrecio() {
        return precio;
    }

}