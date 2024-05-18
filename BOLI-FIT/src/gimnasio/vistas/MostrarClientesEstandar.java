package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gimnasio.controlador.MostrarAfiliadosEstandarControlador;
import gimnasio.controlador.MostrarAfiliadosEstandarControladorInterfaz;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MostrarClientesEstandar extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarClientesEstandar() {
		
		setLayout(null);
		
		JLabel tituloNewLabel = new JLabel("MOSTRAR CLIENTES PAQUETE ESTANDAR");
		
		tituloNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		
		tituloNewLabel.setBounds(120, 0, 166, 28);
		
		add(tituloNewLabel);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-13, -27, 713, 506);
		add(lblNewLabel);
		
		
		MostrarAfiliadosEstandarControladorInterfaz controlador=new MostrarAfiliadosEstandarControlador();
		
		String[][] AE= controlador.mostrarAfiliadosEstandar();
		
		final String[] cabeceraTabla= {"CodigoCliente", "DNI", "Nombre", "Apellido", "Telefono", "Correo", "Direccion", "Coste Anual", "Ventajas"};
		
		JTable tablaMonitores=new JTable(AE,cabeceraTabla) {
			
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
