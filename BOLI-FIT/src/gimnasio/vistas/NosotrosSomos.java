package gimnasio.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class NosotrosSomos extends JPanel {

	/**
	 * Create the panel.
	 */
	public NosotrosSomos() {
		setLayout(null);
		
		JLabel lblporQueBolifit = new JLabel("\u00BFPor que Boli-Fit?");
		lblporQueBolifit.setForeground(Color.WHITE);
		lblporQueBolifit.setFont(new Font("Arial Narrow", Font.BOLD, 37));
		lblporQueBolifit.setBackground(Color.WHITE);
		lblporQueBolifit.setBounds(175, 39, 282, 48);
		add(lblporQueBolifit);
		
		JLabel lblNewLabel_1 = new JLabel("En todos nuestros gimnasios encontrar\u00E1s maquinaria de \u00FAltima ");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(81, 168, 498, 31);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("generaci\u00F3n de Matrix y TechnoGym. \u00A1Todo lo que necesitas ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(91, 197, 474, 31);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("para un perfecto entrenamiento! Adem\u00E1s, cuidamos de la higiene");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1.setBounds(71, 225, 508, 31);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("y un entorno limpio y saludable, lo cual es important\u00EDsimo");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1_1.setBounds(81, 255, 474, 31);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("en estos momentos. Entrena de forma libre en la sala de fitness");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1_2.setBounds(71, 286, 508, 31);
		add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("o sigue nuestras clases colectivas presenciales y virtuales");
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1_2_1_1.setBounds(81, 316, 466, 31);
		add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("en las salas destinadas para ello.");
		lblNewLabel_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(161, 345, 282, 31);
		add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img\\imagennnnn.png"));
		lblNewLabel.setBounds(0, -8, 669, 464);
		add(lblNewLabel);

	}

}
