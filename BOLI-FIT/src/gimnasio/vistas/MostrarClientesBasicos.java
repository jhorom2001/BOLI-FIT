package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;

public class MostrarClientesBasicos extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarClientesBasicos() {
		setLayout(null);
		
		JLabel lblClientes = new JLabel("CLIENTES BASICOS");
		lblClientes.setForeground(Color.WHITE);
		lblClientes.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblClientes.setBounds(173, 30, 275, 36);
		add(lblClientes);
		
		JLabel lblCodigodninombresueldo = new JLabel("CODIGO--DNI--NOMBRE--APELLIDO--NUMERO--CORREO ELECTRONICO-- DIRECCION");
		lblCodigodninombresueldo.setForeground(Color.WHITE);
		lblCodigodninombresueldo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCodigodninombresueldo.setBounds(23, 89, 615, 43);
		add(lblCodigodninombresueldo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-15, -25, 696, 507);
		add(lblNewLabel);

	}

}
