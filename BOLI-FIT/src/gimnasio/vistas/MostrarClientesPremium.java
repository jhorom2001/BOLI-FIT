package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gimnasio.controlador.MostrarAfiliadosPremiumControlador;
import gimnasio.controlador.MostrarAfiliadosPremiumControladorInterfaz;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MostrarClientesPremium extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarClientesPremium() {
		
		setLayout(null);
		
		JLabel tituloNewLabel = new JLabel("MOSTRAR CLIENTES PAQUETE PREMIUM");
		
		tituloNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		
		tituloNewLabel.setBounds(120, 0, 166, 28);
		
		add(tituloNewLabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(0, -20, 674, 498);
		add(lblNewLabel);
		
		
		MostrarAfiliadosPremiumControladorInterfaz controlador=new MostrarAfiliadosPremiumControlador();
		
		String[][] AP= controlador.mostrarAfiliadosPremium();
		
		final String[] cabeceraTabla= {"CodigoCliente", "DNI", "Nombre", "Apellido", "Telefono", "Correo", "Direccion", "Piscina", "Merchandising", "Coste Anual"};
		
		JTable tablaMonitores=new JTable(AP,cabeceraTabla) {
			
			public boolean isCellEditable(int row, int column) {
				
		            return false;
		         }
		};
		
		tablaMonitores.setGridColor(Color.BLACK);

	
		JScrollPane scrollPane = new JScrollPane(tablaMonitores);
		scrollPane.setBounds(10, 32, 659, 222);
		add(scrollPane);

	}

}
