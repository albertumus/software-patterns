package com.mycompany.Ordenaciones;

import com.mycompany.Administracion.Persona;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class EstrategiaConcretaNombre implements EstrategiaEmpleados {

    private final ArrayList<Persona> usuarios;

    public EstrategiaConcretaNombre(ArrayList<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Persona> ordenDescendente(){
        ArrayList<Persona> ordenados = new ArrayList();
        ArrayList<String> nombre = new ArrayList();
        for (Persona persona : usuarios){
            nombre.add(persona.getNombre());
        }
        System.out.println(nombre);
        Collections.sort(nombre, String.CASE_INSENSITIVE_ORDER);
        System.out.println(nombre);
        ArrayList<Persona> temp = ordenados;
        int i = 0;
        while (ordenados.size() != usuarios.size()){
            try {
                if (nombre.get(0).equals(usuarios.get(i).getNombre())){
                    nombre.remove(0);
                    ordenados.add(usuarios.get(i));
                    i=0;
                }
            } catch (Exception e){
                e.printStackTrace();
                break;
            }
            if (i==usuarios.size()) i=0;
            else i++;
        }
        
        return ordenados;
    }
    public void finalize() throws Throwable {

    }
}//end EstrategiaConcretaNombre
