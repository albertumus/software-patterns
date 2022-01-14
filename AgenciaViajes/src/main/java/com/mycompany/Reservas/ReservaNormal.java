/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Reservas;

import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Empleado;
import com.mycompany.Paquetes.PaqueteVacacional;
import java.util.Date;

/**
 *
 * @author admin
 */
public class ReservaNormal extends Reserva {
    
        
    public ReservaNormal( PaqueteVacacional paquete, Date fechaReserva, Empleado encargado, Cliente cliente ) {
        super( paquete, fechaReserva, encargado, cliente );
    }
    @Override
    public double getPrecioReserva(VisitanteReserva visitante) {
        return this.paquete.getTotalPaquete() + visitante.visitar(this);
    }
    
}
