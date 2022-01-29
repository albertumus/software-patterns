package com.mycompany.Paquetes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public abstract class PaqueteBuilder implements Cloneable, Serializable {

    protected PaqueteVacacional paquete;
    
    public PaqueteVacacional getPaquete() {
        return paquete;
    }
       
    public void crearPaquete() {
        this.paquete = new PaqueteVacacional();
    }
    public abstract void setHotel( Hotel hotel );
    public abstract void setVuelo( Vuelo vuelo );
    public abstract void setDesayuno( Boolean desayuno );
    public abstract void setDesde( Date desde );
    public abstract void setHasta( Date hasta );
    public abstract void setExtras( ArrayList<Extra> extras );
    public abstract void setHotel();
    public abstract void setVuelo();
    public abstract void setDesayuno();
    public abstract void setDesde();
    public abstract void setHasta();
    public abstract void setExtras();
}