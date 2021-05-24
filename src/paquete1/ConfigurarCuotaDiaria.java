package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigurarCuotaDiaria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuotaDiariaEsperada;
	private JLabel lblCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCuotaDiaria dialog = new ConfigurarCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 154);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/)");
			lblCuotaDiaria.setBounds(10, 33, 154, 14);
			contentPanel.add(lblCuotaDiaria);
		}
		{
			txtCuotaDiariaEsperada = new JTextField();
			txtCuotaDiariaEsperada.setColumns(10);
			txtCuotaDiariaEsperada.setBounds(184, 30, 104, 20);
			contentPanel.add(txtCuotaDiariaEsperada);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 29, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(335, 63, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

}
