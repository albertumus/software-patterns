package com.mycompany.Reservas;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public interface VisitanteReserva {
    
    public double visitar(  ReservaDeFamiliar reserva );
    public double visitar(  ReservaNormal reserva );

}