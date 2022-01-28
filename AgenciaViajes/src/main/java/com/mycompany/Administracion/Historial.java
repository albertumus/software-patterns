/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Administracion;

import com.mycompany.Reservas.Reserva;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Historial implements Serializable{
    
    public ArrayList<Reserva> reservas;
    
    public Historial() {   
        reservas = new ArrayList<Reserva>();   
    }
    
    public void addReserva(Reserva r) {
        this.reservas.add(r);
    }
    
    public void removeReserva(Reserva r) {
        this.reservas.remove(r);
    }
    
}
