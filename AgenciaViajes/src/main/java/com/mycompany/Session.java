package com.mycompany;


public class Session {
    
    private static Session instancia;

    public String email;
    public String nombre;
    public int role;

    private Session(){
    }
    
    public static Session getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new Session();
        }
        return instancia;
    }
    
    public void login( String email, String nombre, int role ) {
        this.email  = email;
        this.nombre = nombre;
        this.role   = role;
    }
    
    public void logout() {
        this.email  = null;
        this.nombre = null;
        this.role   = -1;
    }
    
    public Boolean isLogged() {
        return false;
    }
 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
        
        
}