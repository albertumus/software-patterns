package com.mycompany;

import com.mycompany.Administracion.Baja;
import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Desactivado;
import com.mycompany.Administracion.Director;
import com.mycompany.Administracion.Gestor;
import com.mycompany.Paquetes.CreadorPaquetes;
import com.mycompany.Paquetes.Extra;
import com.mycompany.Paquetes.FabricaPaquetePreHecho;
import com.mycompany.Paquetes.HotelCuatroEstrellas;
import com.mycompany.Paquetes.PaqueteNormalBuilder;
import com.mycompany.Paquetes.PaqueteVacacional;
import com.mycompany.Paquetes.VueloClaseTurista;
import com.mycompany.Reservas.Reserva;
import com.mycompany.Reservas.ReservaNormal;
import com.mycompany.Reservas.VisitanteReservaInvierno;
import com.mycompany.Reservas.VisitanteReservaVerano;
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
        
       
        PaqueteVacacional paquete = new FabricaPaquetePreHecho()
        .getPaquete(0).createPaquete5Estrellas( new Date(2022, 1, 1), new Date(2022,1,2) );
        
        System.out.println(paquete.getHotel());
        System.out.println(paquete.getTotalPaquete());
        
        PaqueteVacacional copia  = (PaqueteVacacional)paquete.clone();
        
        System.out.println(copia.getHotel());
        System.out.println(copia.getTotalPaquete());
  

        /* 
        Ejemplo para crear emplados, clientes, directores, gestores... 
        */
        
        Director d1 = new Director("Superintendente", "Martinez", "dni1", "hombre", "asdasd", new Date(), "0001", 2000, "0000123", "Casado" );
        Gestor g1 = new Gestor( "Gestor", "1", d1, "dni1", "hombre", "asdasd", new Date(), "0001", 1500, "0000123", "Casado");
        Gestor g2 = new Gestor( "Gestor", "2", d1, "dni1", "hombre", "asdasd", new Date(), "0001", 1500, "0000123", "Casado");
        
        Cliente c1 = new Cliente( "Cliente", "1", g1,"tarjeya1", "dni1", "hombre", "asdasd", new Date() );
        Cliente c2 = new Cliente( "Cliente", "2", g2,"tarjeya2", "dni1", "hombre", "asdasd", new Date() );
        Cliente c3 = new Cliente( "Cliente", "3", d1,"tarjeya3", "dni1", "hombre", "asdasd", new Date() );
        
        /*
        Ejemplo de las acciones sobre lo empleados en funcion del estado
        */
        g1.pagarSueldo();
        g1.darDeBaja();
        g1.pagarSueldo();
        g1.setEstado( new Desactivado());
        g1.pagarSueldo();
        
        /*
        Ejemmplo de las acciones de la reserva en funcion del estado
        */
        
        Reserva reserva = new ReservaNormal(
           paquete,
           new Date(),
           g1,
           c1
        );
        
        reserva.pagar();
        reserva.enviarDatosAProveedores();
        reserva.enviarDatosConfirmacion();
        reserva.anular();
        reserva.enviarDatosAProveedores();
        reserva.enviarDatosConfirmacion();
        reserva.pagarParcialmente();
        reserva.enviarDatosAProveedores();
        reserva.enviarDatosConfirmacion();
        
        /* 
        Ejemplo del patron visitor para calcular los precios finales de una reserva
        */
        
        System.out.println(reserva.getPrecioReserva(new VisitanteReservaVerano() ) );
        System.out.println(reserva.getPrecioReserva(new VisitanteReservaInvierno() ) );
        
        /*
        Ejemplo del patron proxy para acceder a los datos de los empleados en funcion del status
        */
        
    }
    
}
