package com.mycompany.Administracion;

import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class Gestor extends Empleado {
    
    private Director director;

    public Gestor( String nombre, String apellidos, Director director, String dni, String genero, String direccion, Date fechaAlta, String identificador, Integer sueldo, String numeroSS, String estadoCivil ){
        super( nombre, apellidos, 
                 dni, 
                genero,  
                direccion,  
                fechaAlta,
                identificador,
                sueldo,  
                numeroSS,  
                estadoCivil  );
        this.director = director;
        this.director.añadirSubordinado(this);
    }
    
    @Override
    public void añadirSubordinado(Empleado e) {}

    @Override
    public void eliminarSubordinado(Empleado e) {} 

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}