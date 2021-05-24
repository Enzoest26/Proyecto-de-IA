package paquete1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PrincipalVentana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfigurar;
	private JMenu mnAyuda;
	private JMenuItem mntmConsultarLavadora;
	private JMenuItem mntmModificarLavadora;
	private JMenuItem mntmListarLavadora;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmCantidadOptima;
	private JMenuItem mntmTienda;
	private JLabel lblBienvenido;
	private JButton btnVender;
	private JButton btnGenerarReportes;
	private JButton btnConsultarLavadora;
	private JButton btnConfigurarDescuentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVentana frame = new PrincipalVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalVentana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 367);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarLavadora = new JMenuItem("Consultar Lavadora");
		mnMantenimiento.add(mntmConsultarLavadora);
		
		mntmModificarLavadora = new JMenuItem("Modificar Lavadora");
		mnMantenimiento.add(mntmModificarLavadora);
		
		mntmListarLavadora = new JMenuItem("Listar Lavadora");
		mnMantenimiento.add(mntmListarLavadora);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfigurar = new JMenu("Configurar");
		menuBar.add(mnConfigurar);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuento");
		mnConfigurar.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mnConfigurar.add(mntmConfigurarObsequios);
		
		mntmCantidadOptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mnConfigurar.add(mntmCantidadOptima);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmTienda = new JMenuItem("Acerca de la Tienda");
		mnAyuda.add(mntmTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBienvenido = new JLabel("Bienvenido querido: ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido.setBounds(92, 11, 276, 70);
		contentPane.add(lblBienvenido);
		
		btnConsultarLavadora = new JButton("Consultar Lavadora");
		btnConsultarLavadora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConsultarLavadora.setBounds(61, 134, 188, 37);
		contentPane.add(btnConsultarLavadora);
		
		btnConfigurarDescuentos = new JButton("Configurar Descuentos");
		btnConfigurarDescuentos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfigurarDescuentos.setBounds(61, 198, 188, 37);
		contentPane.add(btnConfigurarDescuentos);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVender.setBounds(354, 134, 188, 37);
		contentPane.add(btnVender);
		
		btnGenerarReportes = new JButton("Generar Reportes");
		btnGenerarReportes.addActionListener(this);
		btnGenerarReportes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGenerarReportes.setBounds(354, 198, 188, 37);
		contentPane.add(btnGenerarReportes);
		
		JLabel lblNewLabel = new JLabel("\"Usuario\"");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(365, 14, 126, 68);
		contentPane.add(lblNewLabel);
	}
	//Comenzamos a modificar los botones
	public void actionPerformed(ActionEvent e){
		//Boton el salir
		if(e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		//Boton Generar Reportes
		if(e.getSource() == mntmGenerarReportes || e.getSource() == btnGenerarReportes) {
			actionPerformedGenerarReportes(e);
		}
		
		//Boton y Item Vender
		
		if(e.getSource() == mntmVender || e.getSource() == btnVender) {
			actionPerformedVender(e);
		}
		
	}
	
	
	public void actionPerformedMntmSalir(ActionEvent e) {
		//Cerramos
		System.exit(0);
	}
	
	
	//Generar Reportes
	
	public void actionPerformedGenerarReportes(ActionEvent e) {
		
		GenerarReportes reporte = new GenerarReportes();
		reporte.setVisible(true);
		
	}
	
	//Vender
	
	public void actionPerformedVender(ActionEvent e) {
		Vender venta = new Vender();
		venta.setVisible(true);
	}
}
