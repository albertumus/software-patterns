package com.mycompany.Reservas;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class VisitanteReservaInvierno implements VisitanteReserva {
    
    public double visitar(  ReservaDeFamiliar reserva ) {
        return 0.00;
    }
    public double visitar(  ReservaNormal reserva ) {
        return 15.00;
    }

}