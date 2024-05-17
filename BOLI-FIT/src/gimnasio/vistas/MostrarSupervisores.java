package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MostrarSupervisores extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarSupervisores() {
		setLayout(null);
		
		JLabel lblSup = new JLabel("SUPERVISORES");
		lblSup.setForeground(Color.WHITE);
		lblSup.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblSup.setBounds(214, 32, 215, 36);
		add(lblSup);
		
		JLabel lblCodigodninombresueldozona = new JLabel("CODIGO--NOMBRE--SUELDO--PRODUCTIVIDAD");
		lblCodigodninombresueldozona.setForeground(Color.WHITE);
		lblCodigodninombresueldozona.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCodigodninombresueldozona.setBounds(45, 101, 482, 43);
		add(lblCodigodninombresueldozona);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(-15, -24, 702, 492);
		add(lblNewLabel);

	}

}
