package gimnasio.modelo;

import java.util.ArrayList;

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
	
	public String[] obtenerSupervisorOrdenadosNombre(){
		
		gimnasio.ordenarEmpleadoNombre();

	    ArrayList<Empleado> empleados = gimnasio.getEmpleados();

	    ArrayList<String> empleadosStringList = new ArrayList<>();

	    for (Empleado empleado : empleados) {
	    	
	        if (empleado instanceof Supervisor) {
	        	
	            Supervisor supervisor = (Supervisor) empleado;
	            
	            String empleadoString = supervisor.getCodigoEmpleado() + "-" +
	            
	                                    supervisor.getNombre() + "-" +
	                                    
	                                    supervisor.getSueldo() + "-" +
	                                    
	                                    supervisor.getProductividad() + "-";
	            
	            empleadosStringList.add(empleadoString);
	        }
	    }

	    String[] empleadosStringArray = new String[empleadosStringList.size()];
	    
	    empleadosStringArray = empleadosStringList.toArray(empleadosStringArray);

	    return empleadosStringArray;
	}
	
	public String[] obtenerMonitoresOrdenadosNombre() {
	   
	    gimnasio.ordenarEmpleadoNombre();

	    ArrayList<Empleado> empleados = gimnasio.getEmpleados();

	    ArrayList<String> empleadosStringList = new ArrayList<>();

	    for (Empleado empleado : empleados) {
	    	
	        if (empleado instanceof Monitor) {
	        	
	            Monitor monitor = (Monitor) empleado;
	            
	            String empleadoString = monitor.getCodigoEmpleado() + "-" +
	            
	                                    monitor.getNombre() + "-" +
	                                    
	                                    monitor.getSueldo() + "-" +
	                                    
	                                    monitor.getZona().getNombre() + "-" +
	                                    
	                                    monitor.getAnnosContrato() + "-";
	            
	            empleadosStringList.add(empleadoString);
	        }
	    }

	    String[] empleadosStringArray = new String[empleadosStringList.size()];
	    
	    empleadosStringArray = empleadosStringList.toArray(empleadosStringArray);

	    return empleadosStringArray;
	}
	
	public String[] obtenerAfiliadosBasicos() {

	    ArrayList<Cliente> clientes = gimnasio.getClientes();

	    ArrayList<String> clientesStringList = new ArrayList<String>();

	    for (Cliente cliente : clientes) {
	    	
	        if (cliente instanceof AfiliadoBasico) {
	        	
	            AfiliadoBasico AF = (AfiliadoBasico) cliente;
	            
	            String clienteString = AF.getCodigoCliente() + "-" +
	            
	                                    AF.getDni() + "-" +
	                                    
	                                    AF.getNombre() + "-" +
	                                    
	                                    AF.getApellido() + "-" +
	                                    
	                                    AF.getNumTelefono() + "-" +
	            
	            						AF.getCorreoElectronico() + "-" +
	            						
	            						AF.getDireccion() + "-" +
	            						
	            						AF.getCosteMensual() + "-" + 
	            						
	            						AF.isVentajas();
	            						
	            
	            clientesStringList.add(clienteString);
	        }
	    }

	    String[] clientesStringArray = new String[clientesStringList.size()];
	    
	    clientesStringArray = clientesStringList.toArray(clientesStringArray);

	    return clientesStringArray;
	}
	
	public String[] obtenerAfiliadosEstandar() {

	    ArrayList<Cliente> clientes = gimnasio.getClientes();

	    ArrayList<String> clientesStringList = new ArrayList<String>();

	    for (Cliente cliente : clientes) {
	    	
	        if (cliente instanceof AfiliadoEstandar) {
	        	
	            AfiliadoEstandar AE = (AfiliadoEstandar) cliente;
	            
	            String clienteString = AE.getCodigoCliente() + "-" +
	            
	                                    AE.getDni() + "-" +
	                                    
	                                    AE.getNombre() + "-" +
	                                    
	                                    AE.getApellido() + "-" +
	                                    
	                                    AE.getNumTelefono() + "-" +
	            
	            						AE.getCorreoElectronico() + "-" +
	            					
	            						AE.getDireccion() + "-" +
	            						
	            						AE.isZonaBoxeo() + "-" + 
	            						
	            						AE.getCostePrimerPago() + "-" +
	            						
	            						AE.getCosteSegundoPago() + "-" + 
	            						
	            						AE.getCosteAnual();
	            						
	            
	            clientesStringList.add(clienteString);
	        }
	    }

	    String[] clientesStringArray = new String[clientesStringList.size()];
	    
	    clientesStringArray = clientesStringList.toArray(clientesStringArray);

	    return clientesStringArray;
	}
	
	public String[] obtenerAfiliadosPremium() {

	    ArrayList<Cliente> clientes = gimnasio.getClientes();

	    ArrayList<String> clientesStringList = new ArrayList<String>();

	    for (Cliente cliente : clientes) {
	    	
	        if (cliente instanceof AfiliadoPremium) {
	        	
	            AfiliadoPremium AP = (AfiliadoPremium) cliente;
	            
	            String clienteString = AP.getCodigoCliente() + "-" +
	            
	                                    AP.getDni() + "-" +
	                                    
	                                    AP.getNombre() + "-" +
	                                    
	                                    AP.getApellido() + "-" +
	                                    
	                                    AP.getNumTelefono() + "-" +
	            
	            						AP.getCorreoElectronico() + "-" +
	            						
	            						AP.getDireccion() + "-" +
	            						
	            						AP.isPiscina() + "-" + 
	            						
	            						AP.isMerchandisingGratis() + "-" +
	            						
	            						AP.getCosteAnual();
	            						
	            
	            clientesStringList.add(clienteString);
	        }
	    }

	    String[] clientesStringArray = new String[clientesStringList.size()];
	    
	    clientesStringArray = clientesStringList.toArray(clientesStringArray);

	    return clientesStringArray;
	}




}
