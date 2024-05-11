package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

import gimnasio.modelo.Zona;

public class AltaMonitorControlador implements AltaMonitorControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void altaMonitor(String dni, String nombre, Zona zona, int annosContrato) {
		
		api.altaMonitor(dni, nombre, zona, annosContrato);
	}

}
