package com.mycompany.Paquetes;

import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public interface FabricaPaquetesPreHechosInterface {
    
    public PaqueteVacacional createPaquete5Estrellas( Date desde, Date hasta );
    public PaqueteVacacional createPaquete4Estrellas( Date desde, Date hasta );
    public PaqueteVacacional createPaquete3Estrellas( Date desde, Date hasta );
    
}