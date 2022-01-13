package com.mycompany;

import com.mycompany.Paquetes.CreadorPaquetes;
import com.mycompany.Paquetes.Extra;
import com.mycompany.Paquetes.FabricaPaquetePreHecho;
import com.mycompany.Paquetes.HotelCuatroEstrellas;
import com.mycompany.Paquetes.PaqueteNormalBuilder;
import com.mycompany.Paquetes.PaqueteVacacional;
import com.mycompany.Paquetes.VueloClaseTurista;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ClasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Ejemplo para Crear un paquete prehecho de tipo Ahorro para un hotel de 3 estrellas 
        PaqueteVacacional paquete = new FabricaPaquetePreHecho()
                .getPaquete(0).createPaquete3Estrellas( new Date(2022, 1, 1), new Date(2022,1,2) );
        */ 
        
        /* Ejemplo para Crear un paquete prehecho de tipo Lujo para un hotel de 5 estrellas 
        PaqueteVacacional paquete = new FabricaPaquetePreHecho()
                .getPaquete(0).createPaquete5Estrellas( new Date(2022, 1, 1), new Date(2022,1,2) );
        */
        
        /* Ejemplo de Patron Builder para construir un paquete paso a paso
        
        CreadorPaquetes creador = new CreadorPaquetes( new PaqueteNormalBuilder() );
        creador.crearPaquete();
        
        PaqueteVacacional paquetev1 = creador.getPaquete();
        
        System.out.println(paquetev1.getHotel());
        
        creador.crearPaquete( 
            HotelCuatroEstrellas.getInstancia(),
            VueloClaseTurista.getInstancia(),
            true,
            new ArrayList<Extra>(),
            new Date(2022, 1,1),
            new Date(2022, 1,2)           
        );
        
        PaqueteVacacional paquetev2 = creador.getPaquete();
        
        System.out.println(paquetev2.getHotel());
        System.out.println(paquetev2.getTotalPaquete());

        */
        
        /*
        Prueba de clonacion de un paquete siguiendo el patron prototype
        */
        
        /*
        PaqueteVacacional paquete = new FabricaPaquetePreHecho()
        .getPaquete(0).createPaquete5Estrellas( new Date(2022, 1, 1), new Date(2022,1,2) );
        
        System.out.println(paquete.getHotel());
        System.out.println(paquete.getTotalPaquete());
        
        PaqueteVacacional copia  = (PaqueteVacacional)paquete.clone();
        
        System.out.println(copia.getHotel());
        System.out.println(copia.getTotalPaquete());
        */

        
        
        
    }
    
}
