/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Paquetes;

/**
 *
 * @author admin
 */
public class TransporteVIP extends Extra {
    
    public final Integer precio = 25;
    private static TransporteVIP instancia;
    
    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    public static TransporteVIP getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new TransporteVIP();
        }
        return instancia;
    }
    
}
