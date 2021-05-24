package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenerarReportes extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JLabel lblReporte;
	private JScrollPane scrollPane;
	private JComboBox cmbReporte;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReportes dialog = new GenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReportes() {
		setBounds(100, 100, 561, 337);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblReporte = new JLabel("Tipo de Reporte");
		lblReporte.setBounds(10, 11, 90, 14);
		contentPanel.add(lblReporte);
		
		cmbReporte = new JComboBox();
		cmbReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la cantidad \u00F3ptima de unidades vendidas", "Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores"}));
		cmbReporte.setBounds(110, 7, 326, 22);
		contentPanel.add(cmbReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(446, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 525, 243);
		contentPanel.add(scrollPane);
		
		JTextArea txtAreaResultado = new JTextArea();
		scrollPane.setViewportView(txtAreaResultado);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	
	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
		
	}
	
}
