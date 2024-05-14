package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class AltaAfiliadoEstandarControlador implements AltaAfiliadoEstandarControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void altaAfiliadoEstandar(String dni, String nombre, String apellido, String numTelefono,
			String correoElectronico, String direccion, double costePrimerPago, double costeSegundoPago) {
		
		api.altaAfiliadoEstandar(dni, nombre, apellido, numTelefono, correoElectronico, direccion, costePrimerPago, costeSegundoPago);
	}

}
