package com.mycompany.Reservas;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Pagado extends EstadoReserva {
    @Override
    public void anular() {
        this.getReserva().setEstado(new PendientePago());
        System.out.println("Reserva devuelta");
    }
    @Override
    public void pagar() {}
    @Override
    public void pagarParcialmente() {}
    @Override
    public void enviarDatosConfirmacion() {
        System.out.println("Datos enviados al cliente");
    }
    @Override
    public void enviarDatosAProveedores() {
        System.out.println("Datos enviados a proveedores");
    }
    

}