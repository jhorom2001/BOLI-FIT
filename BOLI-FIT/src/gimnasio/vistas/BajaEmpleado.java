package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class BajaEmpleado extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public BajaEmpleado() {
		setLayout(null);
		
		JLabel lblBajaEmpleado = new JLabel("BAJA EMPLEADO");
		lblBajaEmpleado.setForeground(new Color(255, 255, 255));
		lblBajaEmpleado.setBounds(201, 29, 256, 36);
		lblBajaEmpleado.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		add(lblBajaEmpleado);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del empleado a dar de baja");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1.setBounds(51, 199, 302, 23);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(423, 202, 143, 20);
		add(textField);
		
		JButton btnNewButton = new JButton("DAR BAJA");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(265, 332, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\imagennnnn.png"));
		lblNewLabel.setBounds(0, 0, 672, 479);
		add(lblNewLabel);

	}

}
