package gimnasio.controlador;

import java.util.ArrayList;

import gimnasio.modelo.APIBolifit;

public class MostrarMonitoresControlador implements MostrarMonitoresControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public String[] mostrarMonitores() {
		
		return api.obtenerMonitoresOrdenadosNombre();
	}

}
