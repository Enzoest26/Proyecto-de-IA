package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ModificarLavadora extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCapacidad;
	private JTextField txtfondo;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JTextField txtPrecio;
	private JButton btnGrabar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarLavadora dialog = new ModificarLavadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarLavadora() {
		setTitle("Modificar lavadora");
		setBounds(100, 100, 512, 233);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 18, 103, 14);
			contentPanel.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 49, 103, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 80, 96, 14);
			contentPanel.add(lblAncho);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(10, 139, 103, 14);
			contentPanel.add(lblFondo);
		}
		{
			JLabel lblCapacidad = new JLabel("Capacidad (kg)");
			lblCapacidad.setBounds(10, 167, 103, 14);
			contentPanel.add(lblCapacidad);
		}
		{
			txtCapacidad = new JTextField();
			txtCapacidad.setColumns(10);
			txtCapacidad.setBounds(123, 164, 204, 20);
			contentPanel.add(txtCapacidad);
		}
		{
			txtfondo = new JTextField();
			txtfondo.setColumns(10);
			txtfondo.setBounds(123, 133, 204, 20);
			contentPanel.add(txtfondo);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setColumns(10);
			txtAlto.setBounds(123, 105, 204, 20);
			contentPanel.add(txtAlto);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setColumns(10);
			txtAncho.setBounds(123, 74, 204, 20);
			contentPanel.add(txtAncho);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(123, 43, 204, 20);
			contentPanel.add(txtPrecio);
		}
		{
			JComboBox cmbModelo = new JComboBox();
			cmbModelo.setModel(new DefaultComboBoxModel(new String[] {"WHIRLPOOL WWI16BSBLA", "SAMSUNG WA17T6260BW", "MABE LMA72200WDBB1", "WINIA WLA-195ECG", "LG TS1604NW"}));
			cmbModelo.setBounds(123, 11, 204, 22);
			contentPanel.add(cmbModelo);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(395, 11, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.setBounds(395, 45, 89, 23);
			contentPanel.add(btnGrabar);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(10, 108, 103, 14);
			contentPanel.add(lblAlto);
		}
	}

}
