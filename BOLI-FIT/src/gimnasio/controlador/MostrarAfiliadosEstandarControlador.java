package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class MostrarAfiliadosEstandarControlador implements MostrarAfiliadosEstandarControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public String[][] mostrarAfiliadosEstandar() {
		
		return api.obtenerAfiliadosEstandar();
	}

}
