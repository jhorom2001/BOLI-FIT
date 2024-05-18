package gimnasio.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import gimnasio.controlador.AltaAfiliadoBasicoControlador;
import gimnasio.controlador.AltaAfiliadoBasicoControladorInterfaz;
import gimnasio.modelo.Zona;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class RegistroBasico extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public RegistroBasico() {
		setBackground(new Color(240, 240, 240));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATE (BASICO)");
		lblNewLabel.setBounds(168, 26, 296, 36);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("DNI del cliente");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(75, 90, 137, 14);
		lblNewLabel_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre del cliente");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(75, 132, 177, 14);
		lblNewLabel_1_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellido del cliente");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setBounds(75, 168, 177, 20);
		lblNewLabel_1_1_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Numero de telefono del cliente");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setBounds(75, 210, 271, 14);
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Correo electronico del cliente");
		lblNewLabel_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setBounds(75, 252, 271, 14);
		lblNewLabel_1_1_4.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Direccion del cliente");
		lblNewLabel_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5.setBounds(75, 290, 207, 14);
		lblNewLabel_1_1_5.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		add(lblNewLabel_1_1_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(385, 89, 143, 20);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(385, 131, 143, 20);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(385, 170, 143, 20);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(385, 209, 143, 20);
		textField_4.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_4.setColumns(10);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(385, 251, 143, 20);
		textField_5.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_5.setColumns(10);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(385, 289, 143, 20);
		textField_6.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_6.setColumns(10);
		add(textField_6);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setBounds(266, 359, 98, 25);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 696, 469);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		add(lblNewLabel_2);
		
		JLabel errorNewLabel = new JLabel("");
		errorNewLabel.setForeground(Color.green);
		errorNewLabel.setBounds(79, 239, 319, 34);
		add(errorNewLabel);
		
		
		btnNewButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					AltaAfiliadoBasicoControladorInterfaz controlador=new AltaAfiliadoBasicoControlador();
				
					String dni=textField_1.getText();
				
					String nombre=textField_2.getText();
				
					String apellido = textField_3.getText();
				
					String telefono = textField_4.getText();
					
					String correo = textField_5.getText();
					
					String direccion = textField_6.getText();
				
					controlador.altaAfiliadoBasico(dni, nombre, apellido, telefono, correo, direccion);
					
					errorNewLabel.setText("Alta finalizada");
		            
		            textField_1.setText("");
		            
		            textField_2.setText("");
		            
		            textField_3.setText("");
		            
		            textField_4.setText("");
		            
		            textField_5.setText("");
		            
		            textField_6.setText("");
					
				}
				catch(NumberFormatException ex) {
					
					System.out.println("Formato incorrecto");
					
					errorNewLabel.setText("Formato texto incorrecto");
					
				}
			}
			
			
		});

	}
}
