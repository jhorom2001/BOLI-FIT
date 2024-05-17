package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;

public class MostrarMonitores extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarMonitores() {
		setLayout(null);
		
		JLabel lblEmpleados = new JLabel("MONITORES");
		lblEmpleados.setForeground(Color.WHITE);
		lblEmpleados.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblEmpleados.setBounds(229, 25, 184, 36);
		add(lblEmpleados);
		
		JLabel lblCodigodninombresueldo = new JLabel("CODIGO--DNI--NOMBRE--SUELDO--ZONA--A\u00D1OS DE CONTRATO");
		lblCodigodninombresueldo.setForeground(new Color(255, 255, 255));
		lblCodigodninombresueldo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCodigodninombresueldo.setBounds(33, 88, 505, 43);
		add(lblCodigodninombresueldo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(0, -49, 716, 500);
		add(lblNewLabel);

	}
}
