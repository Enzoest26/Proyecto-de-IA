package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuentos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUnidades1;
	private JTextField txtUnidades2;
	private JTextField txtUnidades3;
	private JTextField txtUnidades4;
	private JLabel lblUnidades1;
	private JLabel lblUnidades2;
	private JLabel lblUnidades3;
	private JLabel lblUnidades4;
	private JButton btnCerrar;
	private JButton btnAceptar;
	private JLabel lblPorcentaje_1;
	private JLabel lblPorcentaje_2;
	private JLabel lblPorcentaje_3;
	private JLabel lblPorcentaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuentos dialog = new ConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 154);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblUnidades1 = new JLabel("1 a 5 unidades");
			lblUnidades1.setBounds(10, 11, 109, 14);
			contentPanel.add(lblUnidades1);
		}
		{
			lblUnidades2 = new JLabel("6 a 10 unidades");
			lblUnidades2.setBounds(10, 36, 109, 14);
			contentPanel.add(lblUnidades2);
		}
		{
			lblUnidades3 = new JLabel("11 a 15 unidades");
			lblUnidades3.setBounds(10, 61, 109, 14);
			contentPanel.add(lblUnidades3);
		}
		{
			lblUnidades4 = new JLabel("M\u00E1s de unidades");
			lblUnidades4.setBounds(10, 86, 109, 14);
			contentPanel.add(lblUnidades4);
		}
		{
			txtUnidades1 = new JTextField();
			txtUnidades1.setBounds(129, 8, 114, 20);
			contentPanel.add(txtUnidades1);
			txtUnidades1.setColumns(10);
		}
		{
			txtUnidades2 = new JTextField();
			txtUnidades2.setColumns(10);
			txtUnidades2.setBounds(129, 33, 114, 20);
			contentPanel.add(txtUnidades2);
		}
		{
			txtUnidades3 = new JTextField();
			txtUnidades3.setColumns(10);
			txtUnidades3.setBounds(129, 58, 114, 20);
			contentPanel.add(txtUnidades3);
		}
		{
			txtUnidades4 = new JTextField();
			txtUnidades4.setColumns(10);
			txtUnidades4.setBounds(129, 83, 114, 20);
			contentPanel.add(txtUnidades4);
		}
		{
			lblPorcentaje_1 = new JLabel("%");
			lblPorcentaje_1.setBounds(249, 11, 17, 14);
			contentPanel.add(lblPorcentaje_1);
		}
		{
			lblPorcentaje_2 = new JLabel("%");
			lblPorcentaje_2.setBounds(249, 36, 17, 14);
			contentPanel.add(lblPorcentaje_2);
		}
		{
			lblPorcentaje_3 = new JLabel("%");
			lblPorcentaje_3.setBounds(249, 61, 17, 14);
			contentPanel.add(lblPorcentaje_3);
		}
		{
			lblPorcentaje = new JLabel("%");
			lblPorcentaje.setBounds(249, 86, 17, 14);
			contentPanel.add(lblPorcentaje);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnCerrar.setBounds(335, 36, 89, 23);
			contentPanel.add(btnCerrar);
		}
	}

}
