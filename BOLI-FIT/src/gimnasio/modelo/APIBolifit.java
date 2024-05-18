package gimnasio.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import gimnasio.modelo.*;

public class APIBolifit {
	
	private static APIBolifit instancia = new APIBolifit();
	
    private Gimnasio gimnasio;

    private APIBolifit() {
    	
        gimnasio = new Gimnasio("Terra", "Madrid");
        
        gimnasio.annadirZona(new Zona("Cardio"));
        
        gimnasio.annadirZona(new Zona("Piscina"));
        
        gimnasio.annadirZona(new Zona("Musculacion"));
		
	}
	
	public Gimnasio getGimnasio() {
		
		return gimnasio;
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
	
	public void cambiarZonaMonitor(int cod, Zona zona) {
		
	    Monitor monitor = gimnasio.obtenerMonitorPorZona(cod);
	    
	    Zona zonaNueva = gimnasio.obtenerZona(zona);
	    
	    Zona zonaActual = monitor.getZona();
	    

	    zonaNueva.annadirMonitor(monitor);
	        
	    zonaActual.borrarMonitor(monitor);
	        
	    monitor.setZona(zonaNueva);
	        
	}
	
	public String[][] obtenerSupervisorOrdenadosNombre(){
		
		 ArrayList<Empleado> empleados = gimnasio.getEmpleados();
		    
		    List<Supervisor> supervisores = empleados.stream()
		    		
		                                             .filter(e -> e instanceof Supervisor)
		                                             
		                                             .map(e -> (Supervisor) e)
		                                             
		                                             .collect(Collectors.toList());

		   
		    String[][] empleadosArray = new String[supervisores.size()][5];

		    for (int i = 0; i < supervisores.size(); i++) {
		    	
		        Supervisor supervisor = supervisores.get(i);
		        
		        empleadosArray[i][0] = String.valueOf(supervisor.getCodigoEmpleado());
		        
		        empleadosArray[i][1] = supervisor.getDni();
		        
		        empleadosArray[i][2] = supervisor.getNombre();
		        
		        empleadosArray[i][3] = String.valueOf(supervisor.getSueldo()) + " euros";
		        
		        empleadosArray[i][4] = String.valueOf(supervisor.getProductividad());
		    }
		    
		    return empleadosArray;
		
	}
	
	public String[][] obtenerMonitoresOrdenadosNombre() {
		
		ArrayList<Empleado> empleados = gimnasio.getEmpleados();
	    
	    List<Monitor> monitores = empleados.stream()
	    		
	                                             .filter(e -> e instanceof Monitor)
	                                             
	                                             .map(e -> (Monitor) e)
	                                             
	                                             .collect(Collectors.toList());

	   
	    String[][] empleadosArray = new String[monitores.size()][6];

	    for (int i = 0; i < monitores.size(); i++) {
	    	
	        Monitor monitor = monitores.get(i);
	        
	        empleadosArray[i][0] = String.valueOf(monitor.getCodigoEmpleado());
	        
	        empleadosArray[i][1] = monitor.getDni();
	        
	        empleadosArray[i][2] = monitor.getNombre();
	        
	        empleadosArray[i][3] = monitor.getSueldo() + " euros";
	        
	        empleadosArray[i][4] = monitor.getZona().getNombre();
	        
	        empleadosArray[i][5] = String.valueOf(monitor.getAnnosContrato());
	    }
	    
	    return empleadosArray;
	}
	
	public String[][] obtenerAfiliadosBasicos() {

		ArrayList<Cliente> clientes = gimnasio.getClientes();
	    
	    List<AfiliadoBasico> AB = clientes.stream()
	    		
	                                             .filter(e -> e instanceof AfiliadoBasico)
	                                             
	                                             .map(e -> (AfiliadoBasico) e)
	                                             
	                                             .collect(Collectors.toList());

	   
	    String[][] clientesArray = new String[AB.size()][7];

	    for (int i = 0; i < AB.size(); i++) {
	    	
	        AfiliadoBasico AFbasic = AB.get(i);
	        
	        clientesArray[i][0] = String.valueOf(AFbasic.getCodigoCliente());
	        
	        clientesArray[i][1] = AFbasic.getDni();
	        
	        clientesArray[i][2] = AFbasic.getNombre();
	        
	        clientesArray[i][3] = AFbasic.getApellido();
	        
	        clientesArray[i][4] = AFbasic.getNumTelefono();
	        
	        clientesArray[i][5] = AFbasic.getCorreoElectronico();
	        
	        clientesArray[i][6] = AFbasic.getDireccion();
	    }
	    
	    return clientesArray;
	}
	
	public String[][] obtenerAfiliadosEstandar() {

		ArrayList<Cliente> clientes = gimnasio.getClientes();
	    
	    List<AfiliadoEstandar> AE = clientes.stream()
	    		
	                                             .filter(e -> e instanceof AfiliadoEstandar)
	                                             
	                                             .map(e -> (AfiliadoEstandar) e)
	                                             
	                                             .collect(Collectors.toList());

	   
	    String[][] clientesArray = new String[AE.size()][9];

	    for (int i = 0; i < AE.size(); i++) {
	    	
	        AfiliadoEstandar AFest = AE.get(i);
	        
	        clientesArray[i][0] = String.valueOf(AFest.getCodigoCliente());
	        
	        clientesArray[i][1] = AFest.getDni();
	        
	        clientesArray[i][2] = AFest.getNombre();
	        
	        clientesArray[i][3] = AFest.getApellido();
	        
	        clientesArray[i][4] = AFest.getNumTelefono();
	        
	        clientesArray[i][5] = AFest.getCorreoElectronico();
	        
	        clientesArray[i][6] = AFest.getDireccion();
	        
	        clientesArray[i][7] = String.valueOf(AFest.getCosteAnual());
	        
	        clientesArray[i][8] = String.valueOf(AFest.isZonaBoxeo()); 
	        
	        
	    }
	    
	    return clientesArray;
	}
	
	public String[][] obtenerAfiliadosPremium() {

		ArrayList<Cliente> clientes = gimnasio.getClientes();
	    
	    List<AfiliadoPremium> AP = clientes.stream()
	    		
	                                             .filter(e -> e instanceof AfiliadoPremium)
	                                             
	                                             .map(e -> (AfiliadoPremium) e)
	                                             
	                                             .collect(Collectors.toList());

	   
	    String[][] clientesArray = new String[AP.size()][10];

	    for (int i = 0; i < AP.size(); i++) {
	    	
	        AfiliadoPremium AFprem = AP.get(i);
	        
	        clientesArray[i][0] = String.valueOf(AFprem.getCodigoCliente());
	        
	        clientesArray[i][1] = AFprem.getDni();
	        
	        clientesArray[i][2] = AFprem.getNombre();
	        
	        clientesArray[i][3] = AFprem.getApellido();
	        
	        clientesArray[i][4] = AFprem.getNumTelefono();
	        
	        clientesArray[i][5] = AFprem.getCorreoElectronico();
	        
	        clientesArray[i][6] = AFprem.getDireccion();
	        
	        clientesArray[i][7] = String.valueOf(AFprem.isPiscina());
	        
	        clientesArray[i][8] = String.valueOf(AFprem.isMerchandisingGratis());
	        
	        clientesArray[i][9] = String.valueOf(AFprem.getCosteAnual());
	        
	        
	    }
	    
	    return clientesArray;
	}
	
	public int buscarEmpleado(int cod) {
		
		return gimnasio.buscarEmpleado(cod);
		
	}
	
	public int buscarCliente(int cod) {
		
		return gimnasio.buscarCliente(cod);
		
	}
	
}
