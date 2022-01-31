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
        Director d1 = new Director("Antonio", "Martinez", "32549988C", "Hombre", "Calle False N1", new Date(), "32549988C", 2000, "0000001", "Casado", "antonio.martinez@traveair.com", "antonio" );
        Gestor g1 = new Gestor( "Antonia", "Almodovar", d1, "25086788K", "Mujer", "Calle Numeral N2", new Date(), "25086788K", 1500, "0000002", "Casado", "antonia.almodovar@traveair.com", "antonia");
        Gestor g2 = new Gestor( "Samuel", "Terron", d1, "10808819S", "Otro", "Calle Numpcial 5", new Date(), "10808819S", 1500, "0000003", "Casado", "samuel.terron@traveair.com", "samuel");
        
        Cliente c1 = new Cliente( "Adriana", "Gonzalez", g1,"1234567890123456", "34190069V", "Mujer", "asdasd", new Date(), "adriana12@yahoo.com", "adriana" );
        Cliente c2 = new Cliente( "Raquel", "Garcia", g2,"2345678901234567", "57460746F", "Mujer", "asdasd", new Date(), "raquelgar@hotmail.com", "raquel" );
        Cliente c3 = new Cliente( "Raul", "Vazquez", d1,"3456789012345678", "81359583G", "Hombre", "asdasd", new Date(), "raulvazquez@gmail.com", "raul123" );
        
        ArrayList <Persona> usuarios = new ArrayList();
        
        PaqueteVacacional p1 = new FabricaPaquetePreHecho().getPaquete(0).createPaquete5Estrellas(new Date(122, 1, 1), new Date(122,1,2));
        PaqueteVacacional p2 = new FabricaPaquetePreHecho().getPaquete(1).createPaquete5Estrellas(new Date(122, 1, 3), new Date(122,1,5));
        PaqueteVacacional p3 = new FabricaPaquetePreHecho().getPaquete(0).createPaquete5Estrellas(new Date(122, 1, 5), new Date(122,1,8));
        PaqueteVacacional p4 = new FabricaPaquetePreHecho().getPaquete(1).createPaquete5Estrellas(new Date(122, 1, 7), new Date(122,1,11));
        PaqueteVacacional p5 = new FabricaPaquetePreHecho().getPaquete(0).createPaquete5Estrellas(new Date(122, 1, 9), new Date(122,1,14));
        PaqueteVacacional p6 = new FabricaPaquetePreHecho().getPaquete(1).createPaquete5Estrellas(new Date(122, 1, 11), new Date(122,1,25));
        
        Reserva r1 = new ReservaNormal(p1,new Date(),g1,c1);
        Reserva r2 = new ReservaNormal(p2,new Date(),d1,c1);
        Reserva r3 = new ReservaNormal(p3,new Date(),g1,c2);
        Reserva r4 = new ReservaNormal(p4,new Date(),g2,c2);
        Reserva r5 = new ReservaNormal(p5,new Date(),d1,c3);
        Reserva r6 = new ReservaNormal(p6,new Date(),g2,c3);
        
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
