package Administracion;


/**
 * @author admin
 * @version 1.0
 * @created 04-ene.-2022 18:37:09
 */
public class ProxyFichaEmpleado implements FichaEmpleadoInterface {

	public FichaEmpleado m_FichaEmpleado;

	public ProxyFichaEmpleado(){

	}

	public void finalize() throws Throwable {

	}
}//end ProxyFichaEmpleado