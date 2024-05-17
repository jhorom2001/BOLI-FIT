package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CambiarMonitorZona extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public CambiarMonitorZona() {
		setLayout(null);
		
		JLabel lblCambiarZonaDe = new JLabel("CAMBIAR ZONA DE MONITOR");
		lblCambiarZonaDe.setForeground(Color.WHITE);
		lblCambiarZonaDe.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblCambiarZonaDe.setBounds(129, 40, 428, 36);
		add(lblCambiarZonaDe);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Codigo monitor");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(71, 170, 177, 19);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Nueva zona");
		lblNewLabel_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_1.setBounds(71, 225, 212, 19);
		add(lblNewLabel_1_1_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(404, 171, 143, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(404, 237, 143, 20);
		add(textField_1);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCambiar.setBounds(273, 340, 98, 29);
		add(btnCambiar);
		
		JLabel lblNewLabel_1_1_3_2_1 = new JLabel("(Musculacion, Piscina, Cardio)");
		lblNewLabel_1_1_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_2_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_2_1.setBounds(71, 255, 361, 19);
		add(lblNewLabel_1_1_3_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\imagennnnn.png"));
		lblNewLabel.setBounds(0, 0, 714, 495);
		add(lblNewLabel);

	}
}
