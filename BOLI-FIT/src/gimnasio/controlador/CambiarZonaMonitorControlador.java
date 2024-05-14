package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class CambiarZonaMonitorControlador implements CambiarZonaMonitorControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void cambiarZonaMonitor(int cod, String nomZona) {
		
		api.cambiarZonaMonitor(cod, nomZona);
	}

}
