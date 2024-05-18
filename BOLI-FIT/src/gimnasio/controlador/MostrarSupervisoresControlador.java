package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class MostrarSupervisoresControlador implements MostrarSupervisoresControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public String[][] mostrarSupervisores() {
		
		return api.obtenerSupervisorOrdenadosNombre();
	}

}
