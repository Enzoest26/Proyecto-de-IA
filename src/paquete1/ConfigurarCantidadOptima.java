package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigurarCantidadOptima extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCantidadOptima;
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCantidadOptima dialog = new ConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCantidadOptima() {
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 450, 154);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblCantidadOptima.setBounds(10, 40, 235, 14);
			contentPanel.add(lblCantidadOptima);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setBounds(244, 37, 44, 20);
			contentPanel.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 36, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(335, 70, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

}
