package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gimnasio.controlador.MostrarSupervisoresControlador;
import gimnasio.controlador.MostrarSupervisoresControladorInterfaz;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MostrarSupervisores extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarSupervisores() {
		setLayout(null);
		
		JLabel tituloNewLabel = new JLabel("MOSTRAR SUPERVISORES");
		
		tituloNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		
		tituloNewLabel.setBounds(120, 0, 166, 28);
		
		add(tituloNewLabel);
		
		
		MostrarSupervisoresControladorInterfaz controlador=new MostrarSupervisoresControlador();
		
		String[][] supervisores=controlador.mostrarSupervisores();
		
		final String[] cabeceraTabla= {"CodigoEmpleado", "DNI", "Nombre", "Sueldo", "Productividad"};
		
		JTable tablaMonitores=new JTable(supervisores,cabeceraTabla) {
			
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
