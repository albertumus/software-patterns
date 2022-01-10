package com.mycompany.Paquetes;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class FabricaPaqueteAhorro implements FabricaPaquetesPreHechos {

	public FabricaPaqueteAhorro(){

	}

	public void finalize() throws Throwable {

	}

    @Override
    public void setHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVuelo(Vuelo vuelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//end FabricaPaqueteAhorro