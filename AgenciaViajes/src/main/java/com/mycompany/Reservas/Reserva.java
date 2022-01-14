package com.mycompany.Reservas;

import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Empleado;
import com.mycompany.Administracion.Tarjeta;
import com.mycompany.Paquetes.PaqueteVacacional;
import java.util.Date;

/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public abstract class  Reserva implements AccionesReserva {

    public PaqueteVacacional paquete;
    public EstadoReserva estado;

    public Date     fechaReserva;
    public Empleado encargado;
    public Cliente  cliente;
    public Tarjeta  tarjeta;
    
    public Double   precio;

    public Reserva(PaqueteVacacional paquete, Date fechaReserva, Empleado encargado, Cliente cliente ) {
        this.paquete        = paquete;
        this.fechaReserva   = fechaReserva;
        this.encargado      = encargado;
        this.cliente        = cliente;
        this.tarjeta        = this.cliente.getFicha().getTarjeta();
        this.estado         = new PendientePago();
        this.estado.setReserva(this);
        this.cliente.historial.addReserva( this );
        
    }
    @Override
    public void anular() {
        this.estado.anular();
    }
    @Override
    public void pagar() {
        this.estado.pagar();
    }
    @Override
    public void pagarParcialmente() {
        this.estado.pagarParcialmente();
    }
    @Override
    public void enviarDatosConfirmacion() {
        this.estado.enviarDatosConfirmacion();
    }
    @Override
    public void enviarDatosAProveedores() {
        this.estado.enviarDatosAProveedores();
    }
    
    public abstract double getPrecioReserva(VisitanteReserva visitante); 
    
    public AccionesReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
        this.estado.setReserva(this);
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }


}