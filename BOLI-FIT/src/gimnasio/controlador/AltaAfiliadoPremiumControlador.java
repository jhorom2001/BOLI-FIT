package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;

public class AltaAfiliadoPremiumControlador implements AltaAfiliadoPremiumControladorInterfaz {
	
	private APIBolifit api=APIBolifit.getInstance();

	public void altaAfiliadoPremium(String dni, String nombre, String apellido, String numTelefono,
			String correoElectronico, String direccion) {
		
		api.altaAfiliadoPremium(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
	}

}
