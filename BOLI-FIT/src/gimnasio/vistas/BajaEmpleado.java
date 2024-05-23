package gimnasio.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import gimnasio.controlador.BajaEmpleadoControlador;
import gimnasio.controlador.BajaEmpleadoControladorInterfaz;

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
		lblNewLabel.setIcon(new ImageIcon("img\\imagennnnn.png"));
		lblNewLabel.setBounds(0, 0, 672, 479);
		add(lblNewLabel);
		
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Boton baja");
				
				BajaEmpleadoControladorInterfaz controlador=new BajaEmpleadoControlador();
				
				int codigo=controlador.existeEmpleado(Integer.parseInt(textField.getText()));
				
				if (codigo==-1) {
					
					System.out.println("Empleado no encontrado.");
					
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnNewButton),"Empleado no encontrado");
					
				}
				else {
					System.out.println("Mensajero encontrado con codigo " + codigo );
					
					int n = JOptionPane.showConfirmDialog(JOptionPane.getFrameForComponent(btnNewButton), "¿Estas seguro de borrar el Empleado con codigo "+codigo+" ?", "Eliminar mensajero", JOptionPane.YES_NO_OPTION);
					if (n==0) {
						
						controlador.eliminarEmpleado(codigo);
						
						textField.setText("");
						
					}
				}
				
				
			}
			
			
		});

	}

}
