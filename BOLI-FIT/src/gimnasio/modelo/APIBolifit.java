package gimnasio.modelo;

import java.util.ArrayList;
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
		
		gimnasio.ordenarEmpleadoNombre();

	    ArrayList<Empleado> supervisores = gimnasio.getEmpleados();
	    
	    String[][] S = new String[supervisores.size()][5];
	    
	    for (int i = 0; i < supervisores.size(); i++) {
	    	
	        Empleado empleado = supervisores.get(i);
	        
	        S[i][0] = String.valueOf(empleado.getCodigoEmpleado());
	        
	        S[i][1] = empleado.getDni();
	        
	        S[i][2] = empleado.getNombre();
	        
	        S[i][3] = String.valueOf(empleado.getSueldo()) + " euros";
	        
	        if (empleado instanceof Supervisor) {
	        	
	            Supervisor superv = (Supervisor) empleado;
	            
	            S[i][4] = String.valueOf(superv.getProductividad());
	            
	        }
	        
	         else {
	        	 
	            S[i][4] = "";
	            
	         }
	    }
	    
	    return S;
	}
	
	public String[][] obtenerMonitoresOrdenadosNombre() {
		
	    gimnasio.ordenarEmpleadoNombre();

	    ArrayList<Empleado> monitores = gimnasio.getEmpleados();
	    
	    String[][] M = new String[monitores.size()][6];
	    
	    for (int i = 0; i < monitores.size(); i++) {
	    	
	        Empleado empleado = monitores.get(i);
	        
	        M[i][0] = String.valueOf(empleado.getCodigoEmpleado());
	        
	        M[i][1] = empleado.getDni();
	        
	        M[i][2] = empleado.getNombre();
	        
	        M[i][3] = String.valueOf(empleado.getSueldo()) + " euros";
	        
	        if (empleado instanceof Monitor) {
	        	
	            Monitor monitor = (Monitor) empleado;
	            
	            M[i][4] = monitor.getZona().getNombre();
	            
	            M[i][5] = String.valueOf(monitor.getAnnosContrato());
	            
	        } else {
	            M[i][4] = "";
	            
	            M[i][5] = "";
	        }
	    }
	    
	    return M;
	}
	
	public String[][] obtenerAfiliadosBasicos() {

		    ArrayList<Cliente> clientes = gimnasio.getClientes();
		    
		    String[][] AB = new String[clientes.size()][7];
		    
		    for (int i = 0; i < clientes.size(); i++) {
		    	
		        Cliente cliente = clientes.get(i);
		        
		        AB[i][0] = String.valueOf(cliente.getCodigoCliente());
		        
		        AB[i][1] = cliente.getDni();
		        
		        AB[i][2] = cliente.getNombre();
		        
		        AB[i][3] = cliente.getApellido();
		        
		        AB[i][4] = cliente.getNumTelefono();
		        
		        AB[i][5] = cliente.getCorreoElectronico();
		        
		        AB[i][6] = cliente.getDireccion();
		        
		    }
		    
		    return AB;
	}
	
	public String[][] obtenerAfiliadosEstandar() {

		ArrayList<Cliente> clientes = gimnasio.getClientes();
	    
	    String[][] AE = new String[clientes.size()][9];
	    
	    for (int i = 0; i < clientes.size(); i++) {
	    	
	        AfiliadoEstandar cliente = (AfiliadoEstandar) clientes.get(i);
	        
	        AE[i][0] = String.valueOf(cliente.getCodigoCliente());
	        
	        AE[i][1] = cliente.getDni();
	        
	        AE[i][2] = cliente.getNombre();
	        
	        AE[i][3] = cliente.getApellido();
	        
	        AE[i][4] = cliente.getNumTelefono();
	        
	        AE[i][5] = cliente.getCorreoElectronico();
	        
	        AE[i][6] = cliente.getDireccion();
	        
	        AE[i][7] = String.valueOf(cliente.getCosteAnual());
	        
            AE[i][8] = String.valueOf(cliente.isZonaBoxeo());
	        
	    }
	    
	    return AE;
	}
	
	public String[][] obtenerAfiliadosPremium() {

		ArrayList<Cliente> clientes = gimnasio.getClientes();
	    
	    String[][] AP = new String[clientes.size()][10];
	    
	    for (int i = 0; i < clientes.size(); i++) {
	    	
	        AfiliadoPremium cliente = (AfiliadoPremium) clientes.get(i);
	        
	        AP[i][0] = String.valueOf(cliente.getCodigoCliente());
	        
	        AP[i][1] = cliente.getDni();
	        
	        AP[i][2] = cliente.getNombre();
	        
	        AP[i][3] = cliente.getApellido();
	        
	        AP[i][4] = cliente.getNumTelefono();
	        
	        AP[i][5] = cliente.getCorreoElectronico();
	        
	        AP[i][6] = cliente.getDireccion();
	        
	        AP[i][7] = String.valueOf(cliente.isPiscina());
	        
            AP[i][8] = String.valueOf(cliente.isMerchandisingGratis());
            
            AP[i][9] = String.valueOf(cliente.getCosteAnual());
            
	        
	    }
	    
	    return AP;
	}
	
	public int buscarEmpleado(int cod) {
		
		return gimnasio.buscarEmpleado(cod);
		
	}
	
	public int buscarCliente(int cod) {
		
		return gimnasio.buscarCliente(cod);
		
	}




}
