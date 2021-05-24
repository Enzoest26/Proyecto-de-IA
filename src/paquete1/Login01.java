package paquete1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login01 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pssContrasenia;
	private JButton btnIngresar;
	private JButton btnBorrar;
	private JButton btnSalir;
	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JLabel lblSubtitulo;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login01 frame = new Login01();
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
	public Login01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(102, 204, 204));
		contentPane_1.setBounds(0, 0, 444, 271);
		contentPane.add(contentPane_1);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(61, 112, 62, 14);
		contentPane_1.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(186, 109, 86, 20);
		contentPane_1.add(txtUsuario);
		
		lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(61, 137, 62, 14);
		contentPane_1.add(lblContrasenia);
		
		pssContrasenia = new JPasswordField();
		pssContrasenia.setBounds(186, 135, 86, 20);
		contentPane_1.add(pssContrasenia);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBackground(Color.GREEN);
		btnIngresar.setBounds(61, 199, 89, 23);
		contentPane_1.add(btnIngresar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBackground(Color.BLACK);
		btnBorrar.setBounds(183, 199, 89, 23);
		contentPane_1.add(btnBorrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBackground(Color.RED);
		btnSalir.setBounds(306, 199, 89, 23);
		contentPane_1.add(btnSalir);
		
		lblTitulo = new JLabel("NombreEmpresa");
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTitulo.setBounds(166, 16, 126, 27);
		contentPane_1.add(lblTitulo);
		
		lblSubtitulo = new JLabel("Bienvenido estimado usuario");
		lblSubtitulo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSubtitulo.setBounds(118, 61, 199, 17);
		contentPane_1.add(lblSubtitulo);
	}
	public void actionPerformed(ActionEvent e) {
		//Validamos la primera opción
		if(e.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(e);
		}
		//Validamos la segunda opción
		if(e.getSource() == btnBorrar) {
			
			actionPerformedBtnBorrar(e);
		}
		if(e.getSource() == btnSalir) {
			//Validamos la tercera opción
			actionPerformedBtnSalir(e);
		}
		
		
	}
	
	public void actionPerformedBtnIngresar(ActionEvent e) {
		
		//Crear una variable como la contraseña igual a python
		
		char[] clave = pssContrasenia.getPassword();
		//
		String clavefinal = new String(clave);
		
		//Validamos si puesto por el usuario es igual y asi con la clave
		
		if(txtUsuario.getText().equals("") && clavefinal.equals("")) {
			dispose();
			
			//Mostrar la ventana de dialogo
			
			JOptionPane.showMessageDialog(null, "Bienvenido usuario Enzo al sistema" , "INGRESASTE",
					JOptionPane.INFORMATION_MESSAGE);
			//Llamado al proyecto
			PrincipalVentana p = new PrincipalVentana();
			p.setVisible(true);
		}
		
		
		else {
			//Si no es verdad, el shoe message es para poner una ventana
			JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			txtUsuario.setText("");
			pssContrasenia.setText("");
			}
			
		}
			
	
	
	public void actionPerformedBtnBorrar(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Datos Borrados", "Listo", JOptionPane.INFORMATION_MESSAGE);
		txtUsuario.setText("");
		pssContrasenia.setText("");
	}
	
	public void actionPerformedBtnSalir(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación, que tenga un buen día","Salida",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
