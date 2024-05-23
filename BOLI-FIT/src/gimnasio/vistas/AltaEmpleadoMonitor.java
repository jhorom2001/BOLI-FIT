package gimnasio.vistas;

import javax.swing.JPanel;

 
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gimnasio.controlador.AltaMonitorControlador;
import gimnasio.controlador.AltaMonitorControladorInterfaz;
import gimnasio.modelo.*;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class AltaEmpleadoMonitor extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public AltaEmpleadoMonitor() {
		setLayout(null);
		
		JLabel lblAltaClienteMonitor = new JLabel("ALTA MONITOR");
		lblAltaClienteMonitor.setForeground(new Color(255, 255, 255));
		lblAltaClienteMonitor.setBounds(200, 23, 240, 36);
		lblAltaClienteMonitor.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		add(lblAltaClienteMonitor);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("DNI del empleado");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(45, 131, 177, 19);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Nombre del empleado");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_1.setBounds(45, 176, 212, 19);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Zona asignada ");
		lblNewLabel_1_1_3_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_2.setBounds(45, 219, 361, 19);
		add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Annos de contrato del empleado");
		lblNewLabel_1_1_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_1_1.setBounds(45, 285, 296, 20);
		add(lblNewLabel_1_1_3_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(413, 132, 143, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(413, 177, 143, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(413, 233, 143, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(413, 287, 143, 20);
		add(textField_3);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(259, 347, 98, 29);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1_3_2_1 = new JLabel("(Musculacion, Piscina, Cardio)");
		lblNewLabel_1_1_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_2_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1_1_3_2_1.setBounds(45, 242, 361, 19);
		add(lblNewLabel_1_1_3_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img\\imagennnnn.png"));
		lblNewLabel.setBounds(0, 0, 704, 486);
		add(lblNewLabel);
		
		JLabel errorNewLabel = new JLabel("");
		errorNewLabel.setForeground(Color.green);
		errorNewLabel.setBounds(79, 239, 319, 34);
		add(errorNewLabel);
		
		
		btnNewButton.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					APIBolifit api = APIBolifit.getInstance();
					
		            Gimnasio gimnasio = api.getGimnasio();
		            
			
		            AltaMonitorControladorInterfaz controlador = new AltaMonitorControlador();

		            String dni = textField.getText();
		            
		            String nombre = textField_1.getText();
		            
		            String zonaText = textField_2.getText();
		            
		            int annos = Integer.parseInt(textField_3.getText());

		            
		            Zona zona = gimnasio.getZonas().stream()
		                                .filter(z -> z.getNombre().equalsIgnoreCase(zonaText))
		                                .findFirst()
		                                .orElse(null);

		            if (zona == null) {
		                
		                System.out.println("Zona no encontrada.");
		                
		                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnNewButton), "Zona no encontrada");
		                return;
		            }

		            controlador.altaMonitor(dni, nombre, zona, annos);
		            
		            errorNewLabel.setText("Alta finalizada");
		            
		            textField.setText("");
		            
		            textField_1.setText("");
		            
		            textField_2.setText("");
		            
		            textField_3.setText("");
					
				}
				catch(NumberFormatException ex) {
					
					System.out.println("Formato incorrecto");
					
					errorNewLabel.setText("Formato numero incorrecto");
					
				}
			}
			
			
		});
			
		}

	}
