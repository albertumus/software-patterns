package com.mycompany.Administracion;

import com.mycompany.Reservas.Reserva;
import java.io.Serializable;

/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class Tarjeta implements Serializable{

    
    private String numeroTarjeta;

    public Tarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    


}