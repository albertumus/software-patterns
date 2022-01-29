/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Reservas;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public abstract class EstadoReserva implements AccionesReserva, Serializable {
    
    private Reserva reserva;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
   
    
    
}
