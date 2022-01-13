package com.mycompany.Paquetes;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class FabricaPaqueteAhorro implements FabricaPaquetesPreHechosInterface {

    @Override
    public PaqueteVacacional createPaquete5Estrellas( Date desde, Date hasta ) {
        
        ArrayList<Extra> extrasIncluidos = new ArrayList<>();
                
        PaqueteVacacional nuevoPaquete = new PaqueteVacacional( 
                HotelCincoEstrellas.getInstancia(),
                VueloClaseTurista.getInstancia(),
                extrasIncluidos,
                desde,
                hasta );
        
        nuevoPaquete.setPctDescuento(10.00);
        nuevoPaquete.setDesayuno(true);
        
        return nuevoPaquete;
        
    }
    
    @Override
    public PaqueteVacacional createPaquete4Estrellas( Date desde, Date hasta ) {
        
        ArrayList<Extra> extrasIncluidos = new ArrayList<>();
                
        PaqueteVacacional nuevoPaquete = new PaqueteVacacional( 
                HotelCuatroEstrellas.getInstancia(),
                VueloClaseTurista.getInstancia(),
                extrasIncluidos,
                desde,
                hasta );
        
        nuevoPaquete.setPctDescuento(10.00);
        nuevoPaquete.setDesayuno(true);
        
        return nuevoPaquete;
        
    }
    
    @Override
    public PaqueteVacacional createPaquete3Estrellas( Date desde, Date hasta ) {
        
        ArrayList<Extra> extrasIncluidos = new ArrayList<>();
        
        PaqueteVacacional nuevoPaquete = new PaqueteVacacional( 
                HotelTresEstrellas.getInstancia(),
                VueloClaseTurista.getInstancia(),
                extrasIncluidos,
                desde,
                hasta );
        
        nuevoPaquete.setPctDescuento(10.00);
        nuevoPaquete.setDesayuno(true);
        
        return nuevoPaquete;
    }




}