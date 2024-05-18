package gimnasio.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;

import gimnasio.controlador.CambiarZonaMonitorControlador;
import gimnasio.controlador.CambiarZonaMonitorControladorInterfaz;
import gimnasio.modelo.APIBolifit;
import gimnasio.modelo.Gimnasio;
import gimnasio.modelo.Zona;

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
		
		JLabel errorNewLabel = new JLabel("");
		errorNewLabel.setForeground(Color.green);
		errorNewLabel.setBounds(79, 239, 319, 34);
		add(errorNewLabel);
		
		
		btnCambiar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            
		            APIBolifit api = APIBolifit.getInstance();
		            
		            Gimnasio gimnasio = api.getGimnasio();

		            int codigoEmpleado = Integer.parseInt(textField.getText());
		            
		            String zonaText = textField_1.getText();

		            Zona nuevaZona = gimnasio.getZonas().stream()
		                                     .filter(z -> z.getNombre().equalsIgnoreCase(zonaText))
		                                     
		                                     .findFirst()
		                                     
		                                     .orElse(null);

		            if (nuevaZona == null) {
		                
		                System.out.println("Zona no encontrada.");
		                
		                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnCambiar), "Zona no encontrada");
		                return;
		            }

		            CambiarZonaMonitorControladorInterfaz controlador = new CambiarZonaMonitorControlador();
		            
		            int codigo = controlador.existeEmpleado(codigoEmpleado);

		            if (codigo == -1) {
		                
		                System.out.println("Empleado no encontrado.");
		                
		                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnCambiar), "Empleado no encontrado");
		                
		            } else {
		                
		                System.out.println("Empleado encontrado con código " + codigo);
		                
		                int n = JOptionPane.showConfirmDialog(JOptionPane.getFrameForComponent(btnCambiar),
		                        "¿Estás seguro de cambiar la zona del empleado con código " + codigo + " a " + nuevaZona.getNombre() + "?",
		                        "Cambiar zona del empleado", JOptionPane.YES_NO_OPTION);

		                if (n == JOptionPane.YES_OPTION) {
		                    
		                    controlador.cambiarZonaMonitor(codigo, nuevaZona);

		                    textField.setText("");
		                    
		                    textField_1.setText("");
		                    
		                    errorNewLabel.setText("Cambio finalizado");
		                    
		                }
		            }
		        } 
		        catch (NumberFormatException ex) {
		        
		            System.out.println("Formato incorrecto");
		            
		            errorNewLabel.setText("Formato de texto incorrecto");
		        
		        }
		    }
		});
	}	
}
