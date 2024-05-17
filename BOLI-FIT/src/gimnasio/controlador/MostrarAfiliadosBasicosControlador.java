package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class MostrarAfiliadosBasicosControlador implements MostrarAfiliadosBasicosControladorInterfaz{

	private APIBolifit api=APIBolifit.getInstance();
	
	public String[] mostrarAfiliadosBasicos() {
		
		return api.obtenerAfiliadosBasicos();
		
	}

}
