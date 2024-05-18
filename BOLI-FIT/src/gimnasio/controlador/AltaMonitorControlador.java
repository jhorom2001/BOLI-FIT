package gimnasio.controlador;

import gimnasio.modelo.APIBolifit;
import gimnasio.modelo.Gimnasio;
import gimnasio.modelo.Monitor;
import gimnasio.modelo.Zona;

public class AltaMonitorControlador implements AltaMonitorControladorInterfaz {

    @Override
    public void altaMonitor(String dni, String nombre, Zona zona, int annosContrato) {
    	
        APIBolifit api = APIBolifit.getInstance();
        
        Gimnasio gimnasio = api.getGimnasio();

        Monitor monitor = new Monitor(dni, nombre, zona, annosContrato);
        
        gimnasio.annadirEmpleado(monitor);
        
        zona.annadirMonitor(monitor);
    }
}