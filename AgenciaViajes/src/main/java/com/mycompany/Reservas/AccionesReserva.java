package com.mycompany.Reservas;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public interface AccionesReserva {
    
    public void anular();
    public void pagar();
    public void pagarParcialmente();
    public void enviarDatosConfirmacion();
    public void enviarDatosAProveedores();
    

}