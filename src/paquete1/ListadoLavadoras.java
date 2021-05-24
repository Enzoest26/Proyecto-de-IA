package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoLavadoras extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextArea txtAreaResultado;
	private JScrollPane scpScroll;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoLavadoras dialog = new ListadoLavadoras();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoLavadoras() {
		setTitle("Listado de lavadoras");
		setBounds(100, 100, 448, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 11, 414, 239);
			contentPanel.add(scpScroll);
			{
				txtAreaResultado = new JTextArea();
				txtAreaResultado.setBackground(UIManager.getColor("ComboBox.selectionBackground"));
				scpScroll.setViewportView(txtAreaResultado);
			}
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnCerrar.setBounds(106, 261, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			btnListar = new JButton("Listar");
			btnListar.setBounds(240, 261, 89, 23);
			contentPanel.add(btnListar);
		}
	}

}
