package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigurarObsequios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUnidad1;
	private JTextField txtUnidad2;
	private JTextField txtUnidad3;
	private JLabel lblUnidad1;
	private JLabel lblUnidad3;
	private JLabel lblUnidad2;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 154);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblUnidad1 = new JLabel("1 unidad");
			lblUnidad1.setBounds(10, 23, 89, 14);
			contentPanel.add(lblUnidad1);
		}
		{
			lblUnidad2 = new JLabel("2 a 5 unidades");
			lblUnidad2.setBounds(10, 48, 89, 14);
			contentPanel.add(lblUnidad2);
		}
		{
			lblUnidad3 = new JLabel("6 a m\u00E1s unidades");
			lblUnidad3.setBounds(10, 73, 89, 14);
			contentPanel.add(lblUnidad3);
		}
		{
			txtUnidad1 = new JTextField();
			txtUnidad1.setBounds(125, 20, 118, 20);
			contentPanel.add(txtUnidad1);
			txtUnidad1.setColumns(10);
		}
		{
			txtUnidad2 = new JTextField();
			txtUnidad2.setColumns(10);
			txtUnidad2.setBounds(125, 45, 118, 20);
			contentPanel.add(txtUnidad2);
		}
		{
			txtUnidad3 = new JTextField();
			txtUnidad3.setColumns(10);
			txtUnidad3.setBounds(125, 70, 118, 20);
			contentPanel.add(txtUnidad3);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 19, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(335, 44, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

}
