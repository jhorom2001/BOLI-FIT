package gimnasio.vistas;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import gimnasio.controlador.BajaClienteControlador;
import gimnasio.controlador.BajaClienteControladorInterfaz;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class DarBajaCliente extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public DarBajaCliente() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Baja Cliente");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		lblNewLabel.setBounds(248, 11, 154, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del cliente a dar de baja");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
		lblNewLabel_1.setBounds(50, 153, 280, 30);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(418, 160, 112, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DAR BAJA");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(279, 321, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("img\\sgf.png"));
		lblNewLabel_2.setBounds(0, -21, 703, 511);
		add(lblNewLabel_2);
		
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Boton baja");
				
				BajaClienteControladorInterfaz controlador=new BajaClienteControlador();
				
				int codigo=controlador.existeEmpleado(Integer.parseInt(textField.getText()));
				
				if (codigo==-1) {
					
					System.out.println("Cliente no encontrado.");
					
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnNewButton),"Cliente no encontrado");
					
				}
				else {
					System.out.println("Mensajero encontrado con codigo " + codigo );
					
					int n = JOptionPane.showConfirmDialog(JOptionPane.getFrameForComponent(btnNewButton), "¿Estas seguro de eliminar el cliente con codigo "+codigo+" ?", "Eliminar mensajero", JOptionPane.YES_NO_OPTION);
					if (n==0) {
						
						controlador.bajaCliente(codigo);
						
						textField.setText("");
						
					}
				}
				
				
			}
			
			
		});

	}

}
