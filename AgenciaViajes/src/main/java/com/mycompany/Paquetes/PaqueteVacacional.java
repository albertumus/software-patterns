package com.mycompany.Paquetes;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class PaqueteVacacional implements Cloneable {

    public Hotel hotel;
    public Vuelo vuelo;
    public ArrayList<Extra> extras;
    public Date desde;
    public Date hasta;
    public String descripcion;
    
    public Boolean desayuno    = false;
    public Double pctDescuento = 0.00;

    public PaqueteVacacional(){

    }

    public PaqueteVacacional(Hotel hotel, Vuelo vuelo, ArrayList<Extra> extras, Date desde, Date hasta) {
        this.hotel = hotel;
        this.vuelo = vuelo;
        this.extras = extras;
        this.desde = desde;
        this.hasta = hasta;
    }
    
    public Double getTotalPaquete() {
        
        Integer numeroDias  = this.getTotalDias();
       
        Integer precioTotal = 
                ( hotel.getPrecio() * numeroDias ) +
                this.vuelo.getPrecio() +
                this.getTotalExtras(); 
        
        if ( this.desayuno ) {
            precioTotal += this.hotel.getPrecioDesayuno() * numeroDias;
        }
        
        Double precioFinal  = Double.valueOf( precioTotal ) - ( Double.valueOf( precioTotal ) * ( this.pctDescuento / 100 )  );
        
        return precioFinal;
    }
    
    public Integer getTotalExtras() {
        
        Integer totalExtras = 0;
        
        for ( int i=0;i<this.extras.size();i++ ) {
            totalExtras += this.extras.get(i).getPrecio();
        }
        
        return totalExtras;
    }
    
    public Integer getTotalDias() {
        
        long date1InMs = this.desde.getTime();
        long date2InMs = this.hasta.getTime();
		
        long timeDiff = 0;
        if(date1InMs > date2InMs) {
                timeDiff = date1InMs - date2InMs;
        } else {
                timeDiff = date2InMs - date1InMs;
        }
        
        return (int) (timeDiff / (1000 * 60 * 60* 24));
    }
    
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Extra> getExtras() {
        return extras;
    }

    public void setExtras(ArrayList<Extra> extras) {
        this.extras = extras;
    }
    
    public void removeExtras() {
        this.extras.clear();
    }
    
    public void addExtra( Extra e ) {
        this.extras.add( e );
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    public void setPctDescuento(Double pctDescuento) {
        this.pctDescuento = pctDescuento;
    }

    public Boolean getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Boolean desayuno) {
        this.desayuno = desayuno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public Object clone() {
        PaqueteVacacional otra = null;
        try {
            otra = (PaqueteVacacional) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        // Esta excepción no debería aparecer

        return otra;
    }
}