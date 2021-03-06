package com.mycompany.Reservas;

import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Empleado;
import com.mycompany.Administracion.Tarjeta;
import com.mycompany.Paquetes.PaqueteVacacional;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public abstract class  Reserva implements AccionesReserva, Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    protected PaqueteVacacional paquete;
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
        this.cliente.getHistorial().addReserva( this );
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

    public PaqueteVacacional getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteVacacional paquete) {
        this.paquete = paquete;
    }

    public Double getPrecio() {
        return this.getPaquete().getTotalPaquete();
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void imprimirFactura() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String fechaIDA = format.format(this.getPaquete().getDesde());
        String fechaVUELTA = format.format(this.getPaquete().getHasta());
        
        String Ach_Text = "./Facturas/Factura-"+ this.getCliente().getFicha().getDni() + "_" + fechaIDA + "_" + fechaVUELTA +".txt";
        
        
        try {
            
            FileWriter text = new FileWriter(Ach_Text, true);
            PrintWriter pw = new PrintWriter(text);

            
            pw.println("Nombre: " + this.getCliente().getNombre());
            pw.println("Apellidos: " + this.getCliente().getApellidos());
            pw.println("----------------------------------------------------------------------");
            pw.println("Direccion: " + this.getCliente().getFicha().getDireccion());
            pw.println("Email: " + this.getCliente().getEmail());
            pw.println("DNI: " + this.getCliente().getFicha().getDni());
            pw.println("----------------------------------------------------------------------");
            pw.println("Fecha de reserva: " + format.format(this.getFechaReserva()));
            pw.println("Fecha de salida: " + format.format(this.getPaquete().getDesde()));
            pw.println("Fecha de regreso: " + format.format(this.getPaquete().getHasta()));
            pw.println("----------------------------------------------------------------------");
            pw.println("TOTAL : " + this.getPaquete().getTotalPaquete());
            
            text.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}