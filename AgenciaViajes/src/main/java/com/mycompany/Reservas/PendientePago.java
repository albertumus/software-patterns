package com.mycompany.Reservas;


public class PendientePago extends EstadoReserva {
    @Override
    public void anular() {}
    @Override
    public void pagar() {
        this.getReserva().setEstado(new Pagado());
        System.out.println("Reserva pagada");
    }
    @Override
    public void pagarParcialmente() {
        this.getReserva().setEstado(new PagadoParcialmente());
        System.out.println("Reserva pagada parcialmente");
    }
    @Override
    public void enviarDatosConfirmacion() {}
    @Override
    public void enviarDatosAProveedores() {}

}