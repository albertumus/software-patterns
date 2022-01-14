package com.mycompany.Administracion;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Director extends Empleado {
    
    private ArrayList<Empleado> gestores = new ArrayList<Empleado>();

    public Director( String nombre, String apellidos, String dni, String genero, String direccion, Date fechaAlta,String identificador, Integer sueldo, String numeroSS, String estadoCivil ){
        super(nombre, apellidos, 
                dni, 
                genero,  
                direccion,  
                fechaAlta,
                identificador,
                sueldo,  
                numeroSS,  
                estadoCivil );
        
    }
    
    @Override
    public void añadirSubordinado(Empleado e) {
        gestores.add(e);
    }

    @Override
    public void eliminarSubordinado(Empleado e) {
        gestores.remove(e);
    } 

    public ArrayList<Empleado> getGestores() {
        return gestores;
    }

    public void setGestores(ArrayList<Empleado> gestores) {
        this.gestores = gestores;
    }
    
    
    
    

}