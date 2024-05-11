package gimnasio.modelo;

public class APIBolifit {
	
	private static APIBolifit instancia=new APIBolifit();
	
	private Gimnasio gimnasio;
	
	private APIBolifit() {
		
		gimnasio=new Gimnasio("Terra", "Madrid");
		
	}
	
	public static APIBolifit getInstance() {
		
		return instancia;
		
	}
	
	public void altaMonitor(String dni, String nombre, Zona zona, int annosContrato) {
		
		Monitor monitor=new Monitor(dni, nombre, zona, annosContrato);
		
		gimnasio.annadirEmpleado(monitor);
		
	}
	
	public void bajaEmpleado(int codigo) {
		
		gimnasio.borrarEmpleado(codigo);
		
	}
	
	public void altaSupervisor(String dni, String nombre, double productividad) {
		
		Supervisor supervisor=new Supervisor(dni, nombre, productividad);
		
		gimnasio.annadirEmpleado(supervisor);
		
	}
	
	public void altaAfiliadoBasico(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion) {
		
		AfiliadoBasico AB=new AfiliadoBasico(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
		gimnasio.annadirCliente(AB);
		
	}
	
	public void altaAfiliadoEstandar(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion,
			double costePrimerPago, double costeSegundoPago) {
		
		AfiliadoEstandar AE=new AfiliadoEstandar(dni, nombre, apellido, numTelefono, correoElectronico, direccion, costePrimerPago,
				costeSegundoPago);
		
		gimnasio.annadirCliente(AE);
		
	}
	
	public void altaAfiliadoPremium(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion) {
		
		AfiliadoPremium AP=new AfiliadoPremium(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
		gimnasio.annadirCliente(AP);
		
	}
	
	public void bajaCliente(int codigo) {
		
		gimnasio.borrarCliente(codigo);
		
	}
	
	public void cambiarZonaMonitor(int cod, String nomZona) {
		
		Monitor monitor=gimnasio.obtenerMonitorPorZona(cod);
		
		Zona zonaNueva=gimnasio.obtenerZona(nomZona);
		
		Zona zonaActual=monitor.getZona();
		
		
		zonaNueva.annadirMonitor(monitor);
		
		zonaActual.borrarMonitor(monitor);
		
		monitor.setZona(zonaNueva);
		
	}
	
	
	
	
	
	

}
