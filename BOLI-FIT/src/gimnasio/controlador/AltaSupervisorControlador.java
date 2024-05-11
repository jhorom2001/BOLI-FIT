package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class AltaSupervisorControlador implements AltaSupervisorControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void altaSupervisor(String dni, String nombre, double productividad) {
		
		api.altaSupervisor(dni, nombre, productividad);
		
	}

}
