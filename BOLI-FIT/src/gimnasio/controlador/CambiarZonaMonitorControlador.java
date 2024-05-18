package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;
import gimnasio.modelo.Zona;

public class CambiarZonaMonitorControlador implements CambiarZonaMonitorControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void cambiarZonaMonitor(int cod, Zona nomZona) {
		
		api.cambiarZonaMonitor(cod, nomZona);
	}

	public int existeEmpleado(int codigo) {
		
		return api.buscarEmpleado(codigo);
	}

}
