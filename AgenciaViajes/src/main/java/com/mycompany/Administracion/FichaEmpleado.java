package com.mycompany.Administracion;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class FichaEmpleado extends Ficha implements FichaEmpleadoInterface {
     
    private String identificador;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private Integer sueldo;
    private String numeroSS;
    private String estadoCivil;

    public FichaEmpleado(String dni, String genero, String direccion, Date fechaAlta, String identificador, Integer sueldo, String numeroSS, String estadoCivil) {
        super( dni, genero, direccion, fechaAlta );
        this.identificador = identificador;
        this.sueldo = sueldo;
        this.numeroSS = numeroSS;
        this.estadoCivil = estadoCivil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void añadirCliente( Cliente c ) {
        this.clientes.add(c);
    }
    
    public void eliminarCliente( Cliente c ) {
        this.clientes.remove(c);
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}