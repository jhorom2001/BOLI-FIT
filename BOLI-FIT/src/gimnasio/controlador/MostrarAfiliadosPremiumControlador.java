package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class MostrarAfiliadosPremiumControlador implements MostrarAfiliadosPremiumControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public String[] mostrarAfiliadosPremium() {
		
		return api.obtenerAfiliadosPremium();
	}

}
