package gimnasio.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import gimnasio.controlador.AltaAfiliadoPremiumControlador;
import gimnasio.controlador.AltaAfiliadoPremiumControladorInterfaz;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class RegistroPremium extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public RegistroPremium() {
		setLayout(null);
		
		JLabel lblRegistratepremium = new JLabel("REGISTRATE (PREMIUM)");
		lblRegistratepremium.setBounds(168, 21, 309, 36);
		lblRegistratepremium.setForeground(new Color(255, 255, 255));
		lblRegistratepremium.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		lblRegistratepremium.setBackground(Color.WHITE);
		add(lblRegistratepremium);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("DNI del cliente");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setBounds(55, 115, 160, 17);
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre del cliente");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(55, 152, 177, 14);
		lblNewLabel_1_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellido del cliente");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setBounds(55, 177, 193, 24);
		lblNewLabel_1_1_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Numero de telefono del cliente");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setBounds(55, 212, 286, 14);
		lblNewLabel_1_1_3_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Correo electronico del cliente");
		lblNewLabel_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setBounds(55, 246, 259, 14);
		lblNewLabel_1_1_4.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Direccion del cliente");
		lblNewLabel_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5.setBounds(55, 282, 213, 14);
		lblNewLabel_1_1_5.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_5);
		
		textField = new JTextField();
		textField.setBounds(382, 115, 143, 20);
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(382, 151, 143, 20);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(382, 181, 143, 20);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(382, 211, 143, 20);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(382, 245, 143, 20);
		textField_4.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_4.setColumns(10);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(382, 281, 143, 20);
		textField_5.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_5.setColumns(10);
		add(textField_5);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setBounds(257, 345, 98, 29);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-11, -16, 689, 475);
		add(lblNewLabel);
		
		JLabel errorNewLabel = new JLabel("");
		errorNewLabel.setForeground(Color.green);
		errorNewLabel.setBounds(79, 239, 319, 34);
		add(errorNewLabel);
		
		
		btnNewButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					AltaAfiliadoPremiumControladorInterfaz controlador=new AltaAfiliadoPremiumControlador();
				
					String dni=textField.getText();
				
					String nombre=textField_1.getText();
				
					String apellido = textField_2.getText();
				
					String telefono = textField_3.getText();
					
					String correo = textField_4.getText();
					
					String direccion = textField_5.getText();
				
					controlador.altaAfiliadoPremium(dni, nombre, apellido, telefono, correo, direccion);
					
					errorNewLabel.setText("Alta finalizada");
					
					textField.setText("");
					
				 	textField_1.setText("");
		            
		            textField_2.setText("");
		            
		            textField_3.setText("");
		            
		            textField_4.setText("");
		            
		            textField_5.setText("");
					
				}
				catch(NumberFormatException ex) {
					
					System.out.println("Formato incorrecto");
					
					errorNewLabel.setText("Formato texto incorrecto");
					
				}
			}
			
			
		});

	}
}
