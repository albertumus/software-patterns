/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Paquetes;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public abstract class Extra implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    
    public Integer precio;

    public Integer getPrecio() {
        return precio;
    }
}
