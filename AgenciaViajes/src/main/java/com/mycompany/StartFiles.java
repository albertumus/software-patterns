/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Director;
import com.mycompany.Administracion.Gestor;
import com.mycompany.Administracion.Persona;
import com.mycompany.Paquetes.FabricaPaquetePreHecho;
import com.mycompany.Paquetes.PaqueteVacacional;
import com.mycompany.Reservas.Reserva;
import com.mycompany.Reservas.ReservaNormal;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author razvanvc
 */
public class StartFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director d1 = new Director("Superintendente", "Martinez", "dni1", "hombre", "asdasd", new Date(), "0001", 2000, "0000123", "Casado", "emaild1@email.com", "passwordd1" );
        Gestor g1 = new Gestor( "Gestor", "1", d1, "dni1", "hombre", "asdasd", new Date(), "0001", 1500, "0000123", "Casado", "emailg1@email.com", "passwordg1");
        Gestor g2 = new Gestor( "Gestor", "2", d1, "dni1", "hombre", "asdasd", new Date(), "0001", 1500, "0000123", "Casado", "emailg2@email.com", "passwordg2");
        
        Cliente c1 = new Cliente( "Cliente A", "1", g1,"tarjeya1", "dni1", "hombre", "asdasd", new Date(), "a@a.com", "a" );
        Cliente c2 = new Cliente( "Cliente B", "2", g2,"tarjeya2", "dni1", "hombre", "asdasd", new Date(), "b@b.com", "b" );
        Cliente c3 = new Cliente( "Cliente C", "3", d1,"tarjeya3", "dni1", "hombre", "asdasd", new Date(), "c@c.com", "c" );
        
        ArrayList <Persona> usuarios = new ArrayList();
        
        PaqueteVacacional p1 = new FabricaPaquetePreHecho().getPaquete(0).createPaquete5Estrellas(new Date(122, 1, 1), new Date(122,1,2));
        PaqueteVacacional p2 = new FabricaPaquetePreHecho().getPaquete(0).createPaquete5Estrellas(new Date(122, 1, 3), new Date(122,1,5));
        
        Reserva r1 = new ReservaNormal(p1,new Date(),g1,c1);
        Reserva r2 = new ReservaNormal(p2,new Date(),g1,c1);
        
        usuarios.add(d1);
        usuarios.add(g1);
        usuarios.add(g2);
        usuarios.add(c1);
        usuarios.add(c2);
        usuarios.add(c3);
        
        String rutaUser = "./data/users";
        System.out.print(usuarios);
        try {
            FileOutputStream fichero = new FileOutputStream(rutaUser);

            try (ObjectOutputStream usuario = new ObjectOutputStream(fichero)) {
                usuario.writeObject(usuarios);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
