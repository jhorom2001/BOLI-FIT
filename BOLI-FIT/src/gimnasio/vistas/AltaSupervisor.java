package gimnasio.vistas;

import javax.swing.JPanel;

import gimnasio.controlador.AltaSupervisorControlador;
import gimnasio.controlador.AltaSupervisorControladorInterfaz;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class AltaSupervisor extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AltaSupervisor() {
		setLayout(null);
		
		JLabel lblAltaClienteSupervisor = new JLabel("ALTA SUPERVISOR");
		lblAltaClienteSupervisor.setForeground(new Color(255, 255, 255));
		lblAltaClienteSupervisor.setBounds(179, 26, 279, 36);
		lblAltaClienteSupervisor.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		add(lblAltaClienteSupervisor);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("DNI del empleado");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(52, 142, 177, 17);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Nombre del empleado");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_1.setBounds(52, 182, 218, 20);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Productividad del supervisor (\u20AC) ");
		lblNewLabel_1_1_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_1_1.setBounds(52, 227, 279, 29);
		add(lblNewLabel_1_1_3_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(389, 142, 143, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(389, 184, 143, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(389, 233, 143, 20);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(259, 325, 98, 29);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img\\imagennnnn.png"));
		lblNewLabel.setBounds(0, 0, 680, 486);
		add(lblNewLabel);
		
		JLabel errorNewLabel = new JLabel("");
		errorNewLabel.setForeground(Color.green);
		errorNewLabel.setBounds(79, 239, 319, 34);
		add(errorNewLabel);
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					AltaSupervisorControladorInterfaz controlador=new AltaSupervisorControlador();
					
					String dni=textField.getText();
					
					String nombre=textField_1.getText();
					
					double productividad=Double.parseDouble(textField_2.getText());
					
					controlador.altaSupervisor(dni, nombre, productividad);
					
					errorNewLabel.setText("Alta Finalizada");
					
					textField.setText("");
		            
		            textField_1.setText("");
		            
		            textField_2.setText("");
					
				}
				catch(NumberFormatException ex) {
					
					System.out.println("Formato incorrecto");
					
					errorNewLabel.setText("Formato numero incorrecto");
				}
					
				
			}
			
			
		});

	}

}
