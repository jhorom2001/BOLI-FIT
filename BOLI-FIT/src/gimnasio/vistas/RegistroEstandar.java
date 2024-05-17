package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class RegistroEstandar extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public RegistroEstandar() {
		setLayout(null);
		
		JLabel lblRegistrateestandar = new JLabel("REGISTRATE (ESTANDAR)");
		lblRegistrateestandar.setBounds(151, 24, 325, 36);
		lblRegistrateestandar.setForeground(new Color(255, 255, 255));
		lblRegistrateestandar.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		lblRegistrateestandar.setBackground(Color.WHITE);
		add(lblRegistrateestandar);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("DNI del cliente");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setBounds(58, 81, 143, 17);
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre del cliente");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(58, 114, 177, 14);
		lblNewLabel_1_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellido del cliente");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setBounds(58, 149, 177, 22);
		lblNewLabel_1_1_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Numero de telefono del cliente");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setBounds(58, 182, 280, 14);
		lblNewLabel_1_1_3_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Correo electronico del cliente");
		lblNewLabel_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setBounds(58, 215, 261, 14);
		lblNewLabel_1_1_4.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Direccion del cliente");
		lblNewLabel_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5.setBounds(58, 251, 189, 14);
		lblNewLabel_1_1_5.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_5_1 = new JLabel("Primer pago");
		lblNewLabel_1_1_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5_1.setBounds(58, 287, 126, 25);
		lblNewLabel_1_1_5_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_5_1);
		
		JLabel lblNewLabel_1_1_5_2 = new JLabel("Segundo pago");
		lblNewLabel_1_1_5_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5_2.setBounds(58, 323, 126, 25);
		lblNewLabel_1_1_5_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_5_2);
		
		textField = new JTextField();
		textField.setBounds(381, 81, 143, 20);
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(381, 113, 143, 20);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(381, 143, 143, 20);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(381, 176, 143, 20);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(381, 214, 143, 20);
		textField_4.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_4.setColumns(10);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(381, 250, 143, 20);
		textField_5.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_5.setColumns(10);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(381, 291, 143, 20);
		textField_6.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_6.setColumns(10);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(381, 327, 143, 20);
		textField_7.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_7.setColumns(10);
		add(textField_7);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setBounds(240, 377, 98, 29);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(0, 0, 670, 463);
		add(lblNewLabel);

	}
}
