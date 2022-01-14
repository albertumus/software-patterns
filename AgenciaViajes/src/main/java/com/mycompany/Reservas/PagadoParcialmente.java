package com.mycompany.Reservas;

public class PagadoParcialmente extends EstadoReserva {
    @Override
    public void anular() {
        this.getReserva().setEstado(new PendientePago());
        System.out.println("Reserva devuelta");
    }
    @Override
    public void pagar() {
        this.getReserva().setEstado(new Pagado());
        System.out.println("Reserva pagada");
    }
    @Override
    public void pagarParcialmente() {}
    
    @Override
    public void enviarDatosConfirmacion() {
        System.out.println("Datos enviados al cliente");
    }
    @Override
    public void enviarDatosAProveedores() {}

}