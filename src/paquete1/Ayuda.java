package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class Ayuda extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ayuda dialog = new Ayuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ayuda() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tienda 1.0");
			lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
			lblNewLabel.setBounds(142, 31, 113, 29);
			contentPanel.add(lblNewLabel);
		}
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 71, 414, 2);
		contentPanel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(165, 96, 65, 22);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(154, 214, 89, 23);
		contentPanel.add(btnCerrar);
	}
}
