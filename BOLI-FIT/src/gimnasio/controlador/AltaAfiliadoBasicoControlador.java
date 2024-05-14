package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class AltaAfiliadoBasicoControlador implements AltaAfiliadoBasicoControladorInterfaz {

	private APIBolifit api=APIBolifit.getInstance();
	
	public void altaAfiliadoBasico(String dni, String nombre, String apellido, String numTelefono,
			String correoElectronico, String direccion) {
		
		api.altaAfiliadoBasico(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
	}

}
