package gimnasio.vistas;

import javax.swing.JPanel;
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
		
		JLabel lblClientesEstandar = new JLabel("CLIENTES ESTANDAR");
		lblClientesEstandar.setForeground(Color.WHITE);
		lblClientesEstandar.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblClientesEstandar.setBounds(176, 33, 297, 36);
		add(lblClientesEstandar);
		
		JLabel lblCodigodninombreapellidonumerocorreoElectronicoDireccion = new JLabel("CODIGO--DNI--NOMBRE--APELLIDO--NUMERO--GMAIL--DIRECCION--COSTE MENSUAL--VENTAJAS");
		lblCodigodninombreapellidonumerocorreoElectronicoDireccion.setForeground(Color.WHITE);
		lblCodigodninombreapellidonumerocorreoElectronicoDireccion.setFont(new Font("Dialog", Font.BOLD, 13));
		lblCodigodninombreapellidonumerocorreoElectronicoDireccion.setBounds(20, 94, 630, 43);
		add(lblCodigodninombreapellidonumerocorreoElectronicoDireccion);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-13, -27, 713, 506);
		add(lblNewLabel);

	}

}
