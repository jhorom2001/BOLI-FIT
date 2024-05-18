package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class BajaEmpleadoControlador implements BajaEmpleadoControladorInterfaz {
	
	private APIBolifit api=APIBolifit.getInstance();
	
	
	public void eliminarEmpleado(int codigo) {
		
		api.bajaEmpleado(codigo);
		
	}

	public int existeEmpleado(int codigo) {
		
		return api.buscarEmpleado(codigo);
	}

}
