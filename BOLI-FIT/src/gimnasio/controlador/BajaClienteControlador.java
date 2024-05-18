package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class BajaClienteControlador implements BajaClienteControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void bajaCliente(int codigo) {
		
		api.bajaCliente(codigo);
	}

	public int existeEmpleado(int codigo) {
		
		return api.buscarEmpleado(codigo);
		
	}

}
