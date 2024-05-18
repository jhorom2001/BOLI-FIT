package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;

import gimnasio.controlador.MostrarMonitoresControlador;
import gimnasio.controlador.MostrarMonitoresControladorInterfaz;

public class MostrarMonitores extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarMonitores() {
		
		setLayout(null);
			
			JLabel tituloNewLabel = new JLabel("MOSTRAR MONITORES");
			
			tituloNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
			
			tituloNewLabel.setBounds(120, 0, 166, 28);
			
			add(tituloNewLabel);
			
			
			MostrarMonitoresControladorInterfaz controlador=new MostrarMonitoresControlador();
			
			String[][] monitores=controlador.mostrarMonitores();
			
			final String[] cabeceraTabla= {"CodigoEmpleado","DNI","Nombre", "Sueldo", "Zona", "Años de Contrato"};
			
			JTable tablaMonitores=new JTable(monitores,cabeceraTabla) {
				
				public boolean isCellEditable(int row, int column) {
					
			            return false;
			         }
			};
			
			tablaMonitores.setGridColor(Color.BLACK);

		
			JScrollPane scrollPane = new JScrollPane(tablaMonitores);
			scrollPane.setBounds(10, 32, 615, 222);
			add(scrollPane);
			
	}
}
