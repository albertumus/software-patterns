package com.mycompany.Paquetes;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class CreadorPaquetes {
    
    private PaqueteBuilder constructor;

    public CreadorPaquetes( PaqueteBuilder constructor ){
        this.constructor = constructor;
    }
    
    public PaqueteVacacional getPaquete() {
        return this.constructor.getPaquete();
    }
    
    public void crearPaquete( 
            Hotel hotel, 
            Vuelo vuelo,
            Boolean desayuno, 
            ArrayList<Extra> extras,
            Date desde,
            Date hasta )
    {
        this.constructor.crearPaquete();
        this.constructor.setHotel(hotel);
        this.constructor.setDesayuno(desayuno);
        this.constructor.setVuelo(vuelo);
        this.constructor.setExtras(extras);
        this.constructor.setHasta(hasta);
        this.constructor.setDesde(desde);
        
    }
    
    public void crearPaquete()
    {
        this.constructor.crearPaquete();
        this.constructor.setHotel();
        this.constructor.setDesayuno();
        this.constructor.setVuelo();
        this.constructor.setExtras();
        this.constructor.setHasta();
        this.constructor.setDesde();
     
    }
    
    public PaqueteBuilder getConstructor() {
        return constructor;
    }

    public void setConstructor(PaqueteBuilder constructor) {
        this.constructor = constructor;
    }
        
        

}