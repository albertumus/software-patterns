package Filtros;

import com.mycompany.Administracion.Cliente;
import com.mycompany.Administracion.Empleado;
import com.mycompany.Administracion.Persona;
import java.util.ArrayList;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:08
 */
public class FiltroPersonaNIF extends PersonaImp {

    private ArrayList<Persona> personas;
	public FiltroPersonaNIF(ArrayList<Persona> personas){
            this.personas = personas;
	}
        
        public ArrayList<Persona> encontrarPersona(String NIF){
            ArrayList<Persona> encontrados = new ArrayList ();
            for (Persona persona : personas){
                if (persona instanceof Empleado && ((Empleado) persona).getFicha().getDni().equals(NIF)) encontrados.add(persona);
                else if (persona instanceof Cliente && ((Cliente) persona).getFicha().getDni().endsWith(NIF)) encontrados.add(persona);
            }
            return encontrados;
        }

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end FiltroPersonaNIF