/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Paquetes;

import java.util.Date;

/**
 *
 * @author admin
 */
public class FabricaPaquetePreHecho {
    
    public static final int AHORRO  = 0;
    public static final int LUJO    = 1;
    
    public FabricaPaquetesPreHechosInterface getPaquete( int tipo ) {
        if (tipo == AHORRO ) {
            return new FabricaPaqueteAhorro();
        } else {
            return new FabricaPaqueteDeLujo();
        }
    }
    
    
    
    
}
