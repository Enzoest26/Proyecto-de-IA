package paquete1;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JDialog implements ActionListener{
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtAreaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender dialog = new Vender();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setBounds(100, 100, 577, 334);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 64, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 46, 14);
		getContentPane().add(lblCantidad);
		
		JComboBox cmbModelo = new JComboBox();
		cmbModelo.setBounds(95, 7, 208, 22);
		getContentPane().add(cmbModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(95, 33, 208, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(95, 58, 208, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(462, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(462, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 541, 198);
		getContentPane().add(scrollPane);
		
		txtAreaResultado = new JTextArea();
		scrollPane.setViewportView(txtAreaResultado);

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
			}
		if(e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	
	public void actionPerformedBtnVender(ActionEvent e) {
	}
	
	
	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}
}
