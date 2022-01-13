package com.mycompany.Paquetes;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class PaqueteNormalBuilder extends PaqueteBuilder {


    @Override
    public  void setHotel( Hotel hotel ){
        this.paquete.setHotel(hotel);
    }
    @Override
    public  void setVuelo( Vuelo vuelo ) {
        this.paquete.setVuelo(vuelo);
    }
    @Override
    public  void setDesayuno( Boolean desayuno ) {
        this.paquete.setDesayuno(desayuno);
    }
    @Override
    public  void setDesde( Date desde ){
        this.paquete.setDesde(desde);
    }
    @Override
    public  void setHasta( Date hasta ) {
        this.paquete.setHasta(hasta);
    }
    @Override
    public  void setExtras( ArrayList<Extra> extras ) {
        this.paquete.setExtras(extras);
    }
    @Override
    public  void setHotel(){}
    @Override
    public  void setVuelo() {}
    @Override
    public  void setDesayuno() {}
    @Override
    public  void setDesde(){}
    @Override
    public  void setHasta() {}
    @Override
    public  void setExtras() {}
    
    

}