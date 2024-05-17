package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MostrarClientesPremium extends JPanel {

	/**
	 * Create the panel.
	 */
	public MostrarClientesPremium() {
		setLayout(null);
		
		JLabel lblClientesPremium = new JLabel("CLIENTES PREMIUM");
		lblClientesPremium.setForeground(Color.WHITE);
		lblClientesPremium.setFont(new Font("Arial Narrow", Font.BOLD, 33));
		lblClientesPremium.setBounds(183, 37, 275, 36);
		add(lblClientesPremium);
		
		JLabel lblCodigodninombreapellidonumerogmaildireccioncosteMensualventajas = new JLabel("CODIGO--DNI--NOMBRE--APELLIDO--NUMERO--GMAIL--DIRECCION--PISCINA--MERCHANDISING--COSTE ANUAL");
		lblCodigodninombreapellidonumerogmaildireccioncosteMensualventajas.setForeground(Color.WHITE);
		lblCodigodninombreapellidonumerogmaildireccioncosteMensualventajas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodigodninombreapellidonumerogmaildireccioncosteMensualventajas.setBounds(10, 96, 630, 43);
		add(lblCodigodninombreapellidonumerogmaildireccioncosteMensualventajas);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\sgf.png"));
		lblNewLabel.setBounds(0, -20, 674, 498);
		add(lblNewLabel);

	}

}
