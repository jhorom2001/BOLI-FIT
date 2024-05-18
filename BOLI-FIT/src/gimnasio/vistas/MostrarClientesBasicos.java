package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;

import gimnasio.controlador.MostrarAfiliadosBasicosControlador;
import gimnasio.controlador.MostrarAfiliadosBasicosControladorInterfaz;

public class MostrarClientesBasicos extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarClientesBasicos() {
		
		setLayout(null);
		
		JLabel tituloNewLabel = new JLabel("MOSTRAR CLIENTES PAQUETE BASICO");
		
		tituloNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		
		tituloNewLabel.setBounds(120, 0, 166, 28);
		
		add(tituloNewLabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-15, -25, 696, 507);
		add(lblNewLabel);
		
		
		MostrarAfiliadosBasicosControladorInterfaz controlador=new MostrarAfiliadosBasicosControlador();
		
		String[][] AB= controlador.mostrarAfiliadosBasicos();
		
		final String[] cabeceraTabla= {"CodigoCliente", "DNI", "Nombre", "Apellido", "Telefono", "Correo", "Direccion"};
		
		JTable tablaMonitores=new JTable(AB,cabeceraTabla) {
			
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
