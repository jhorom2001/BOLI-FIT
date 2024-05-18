package gimnasio.principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gimnasio.vistas.AltaEmpleadoMonitor;
import gimnasio.vistas.AltaSupervisor;
import gimnasio.vistas.BajaEmpleado;
import gimnasio.vistas.CambiarMonitorZona;
import gimnasio.vistas.DarBajaCliente;
import gimnasio.vistas.MostrarClientesBasicos;
import gimnasio.vistas.MostrarClientesEstandar;
import gimnasio.vistas.MostrarClientesPremium;
import gimnasio.vistas.MostrarMonitores;
import gimnasio.vistas.MostrarSupervisores;
import gimnasio.vistas.NosotrosSomos;
import gimnasio.vistas.RegistroBasico;
import gimnasio.vistas.RegistroEstandar;
import gimnasio.vistas.RegistroPremium;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BolifitInterfaz extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mnItem;
	private JMenuItem mnItem2;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_9;
	private	JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_12;
	private JMenuItem mntmNewMenuItem_11;
	
	/**
	 * Create the frame.
	 */
	public BolifitInterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Boli-Fit");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bodoni MT", Font.BOLD, 43));
		lblNewLabel_1.setBounds(32, 344, 186, 55);
		contentPane.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 712, 35);
		menuBar.setBackground(new Color(192, 192, 192));
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Nosotros Somos");
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_2 = new JMenuItem("\u00BFPor qu\u00E9 Boli-Fit?");
		mntmNewMenuItem_2.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(this);
		
		mntmNewMenuItem_4 = new JMenuItem("Mostrar Clientes Basicos");
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(this);
		
		mntmNewMenuItem_3 = new JMenuItem("Mostrar Clientes Estandar");
		mntmNewMenuItem_3.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(this);
		
		mntmNewMenuItem_10 = new JMenuItem("Mostrar Cliente Premium");
		mntmNewMenuItem_10.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_10);
		mntmNewMenuItem_10.addActionListener(this);
		
		mntmNewMenuItem_12 = new JMenuItem("Mostrar Monitores");
		mntmNewMenuItem_12.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_12);
		mntmNewMenuItem_12.addActionListener(this);
		
		mntmNewMenuItem_11 = new JMenuItem("Mostrar Supervisores");
		mntmNewMenuItem_11.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem_11);
		mntmNewMenuItem_11.addActionListener(this);
		
		JMenu mnOpciones = new JMenu("Apuntate");
		mnOpciones.setForeground(new Color(0, 0, 0));
		mnOpciones.setBackground(new Color(0, 0, 0));
		mnOpciones.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnOpciones);
		
		mnItem = new JMenuItem("Basico");
		mnItem.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnOpciones.add(mnItem);
		mnItem.addActionListener(this);
		
		mntmNewMenuItem_7 = new JMenuItem("Estandar");
		mntmNewMenuItem_7.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnOpciones.add(mntmNewMenuItem_7);
		mntmNewMenuItem_7.addActionListener(this);
		
		mnItem2 = new JMenuItem("Premium");
		mnItem2.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnOpciones.add(mnItem2);
		mnItem2.addActionListener(this);
		
		mntmNewMenuItem_8 = new JMenuItem("Dar Baja");
		mntmNewMenuItem_8.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnOpciones.add(mntmNewMenuItem_8);
		mntmNewMenuItem_8.addActionListener(this);
		
		JMenu mnNewMenu2 = new JMenu("\u00A1\u00DAnete!");
		mnNewMenu2.setForeground(new Color(0, 0, 0));
		mnNewMenu2.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnNewMenu2);
		
		mntmNewMenuItem = new JMenuItem("Alta Empleado Monitor");
		mntmNewMenuItem.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu2.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(this);
		
		mntmNewMenuItem_6 = new JMenuItem("Alta Empleado Supervisor");
		mntmNewMenuItem_6.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu2.add(mntmNewMenuItem_6);
		mntmNewMenuItem_6.addActionListener(this);
		
		mntmNewMenuItem_1 = new JMenuItem("Baja Empleado");
		mntmNewMenuItem_1.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu2.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(this);
		
		mntmNewMenuItem_9 = new JMenuItem("Cambiar Monitor Zona");
		mntmNewMenuItem_9.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu2.add(mntmNewMenuItem_9);
		mntmNewMenuItem_9.addActionListener(this);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salir");
		mntmNewMenuItem_5.setFont(new Font("Georgia", Font.PLAIN, 13));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Alu1DAM02\\Pictures\\imagennnnn.png"));
		lblFondo.setBounds(-30, -211, 919, 812);
		contentPane.add(lblFondo);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuItem.setBounds(10, 124, 137, 26);
		contentPane.add(menuItem);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		if (e.getSource()==mntmNewMenuItem_7) {
			System.out.println("Estandar");
			RegistroEstandar registroEstandarVista=
				new RegistroEstandar();
			setContentPane(registroEstandarVista);
			setVisible(true);
		}
		else if (e.getSource()== mnItem)  {
			RegistroBasico registroVista = new RegistroBasico();
			setContentPane(registroVista);
			setVisible(true);
		}
		else if (e.getSource()== mnItem2) {
			RegistroPremium registroPremiumvista = new RegistroPremium();
			setContentPane(registroPremiumvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_8) {
			DarBajaCliente darbajaclientevista = new DarBajaCliente();
			setContentPane(darbajaclientevista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem) {
			AltaEmpleadoMonitor altaempleadovista = new AltaEmpleadoMonitor();
			setContentPane(altaempleadovista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_6) {
			AltaSupervisor altasupervisorvista = new AltaSupervisor();
			setContentPane(altasupervisorvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_1) {
			BajaEmpleado bajaempleadovista = new BajaEmpleado();
			setContentPane(bajaempleadovista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_2) {
			NosotrosSomos nosotrossomosvista = new NosotrosSomos();
			setContentPane(nosotrossomosvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_9) {
			CambiarMonitorZona cambiarmonitorzona = new CambiarMonitorZona();
			setContentPane(cambiarmonitorzona);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_4) {
			MostrarClientesBasicos mostrarclientesbasicosvista = new MostrarClientesBasicos();
			setContentPane(mostrarclientesbasicosvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_3) {
			MostrarClientesEstandar mostrarclientesestandarvista = new MostrarClientesEstandar();
			setContentPane(mostrarclientesestandarvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_10) {
			MostrarClientesPremium mostrarclientespremiumvista = new MostrarClientesPremium();
			setContentPane(mostrarclientespremiumvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_12) {
			MostrarMonitores mostrarmonitoresvista = new MostrarMonitores();
			setContentPane(mostrarmonitoresvista);
			setVisible(true);
		}
		else if (e.getSource()== mntmNewMenuItem_11) {
			MostrarSupervisores mostrarsupervisoresvista = new MostrarSupervisores();
			setContentPane(mostrarsupervisoresvista);
			setVisible(true);
		}
		else {
			System.out.println("Otros");
		}
	}
}
