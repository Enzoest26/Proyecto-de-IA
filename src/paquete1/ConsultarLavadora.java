package paquete1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ConsultarLavadora extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JTextField txtCapacidad;
	private JLabel lblCapacidad;
	private JButton btnCerrar;
	private JComboBox cmbModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarLavadora dialog = new ConsultarLavadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarLavadora() {
		setTitle("Consultar lavadora");
		setBounds(100, 100, 512, 233);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 18, 103, 14);
			contentPanel.add(lblModelo);
		}
		{
			lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 49, 103, 14);
			contentPanel.add(lblPrecio);
		}
		{
			lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 80, 103, 14);
			contentPanel.add(lblAncho);
		}
		{
			lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(10, 108, 103, 14);
			contentPanel.add(lblAlto);
		}
		{
			lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(10, 139, 103, 14);
			contentPanel.add(lblFondo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(123, 43, 204, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setEditable(false);
			txtAncho.setBounds(123, 74, 204, 20);
			contentPanel.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setEditable(false);
			txtAlto.setBounds(123, 105, 204, 20);
			txtAlto.setColumns(10);
			contentPanel.add(txtAlto);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setEditable(false);
			txtFondo.setBounds(123, 133, 204, 20);
			txtFondo.setColumns(10);
			contentPanel.add(txtFondo);
		}
		
		cmbModelo = new JComboBox();
		cmbModelo.setModel(new DefaultComboBoxModel(new String[] {"WHIRLPOOL WWI16BSBLA", "SAMSUNG WA17T6260BW", "MABE LMA72200WDBB1", "WINIA WLA-195ECG", "LG TS1604NW"}));
		cmbModelo.setBounds(123, 11, 204, 22);
		contentPanel.add(cmbModelo);
		{
			txtCapacidad = new JTextField();
			txtCapacidad.setEditable(false);
			txtCapacidad.setColumns(10);
			txtCapacidad.setBounds(123, 164, 204, 20);
			contentPanel.add(txtCapacidad);
		}
		{
			lblCapacidad = new JLabel("Capacidad (kg)");
			lblCapacidad.setBounds(10, 167, 103, 14);
			contentPanel.add(lblCapacidad);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(395, 11, 89, 23);
			contentPanel.add(btnCerrar);
		}
		
	}
	

	
	public void actionPerformed(ActionEvent e) {
		
	}
		
}

	/*cmbModelo.addActionListener (new ActionListener () {
		  //public void actionPerformed(ActionEvent e) {
		    //	int marcaslavadoras;
		    	//marcaslavadoras = cmbModelo.getSelectedIndex();
		
		        
		    	//if(marcaslavadoras == 0) {
		        	txtPrecio.setText("999.00");
		        	txtAncho.setText("67.0");
		        	txtAlto.setText("64.0");
		        	txtFondo.setText("105.0");
		        	txtCapacidad.setText("16.0");
		        	
		    	}
		        if (marcaslavadoras == 1) {
		        	txtPrecio.setText("1199.00");
		        	txtAncho.setText("63.0");
		        	txtAlto.setText("108.0");
		        	txtFondo.setText("69.0");
		        	txtCapacidad.setText("17.0");
		        }
		        if (marcaslavadoras == 2) {
		        	txtPrecio.setText("1599.00");
		        	txtAncho.setText("68.0");
		        	txtAlto.setText("109.0");
		        	txtFondo.setText("68.0");
		        	txtCapacidad.setText("22.0");
		        }
		        if (marcaslavadoras == 3) {
		        	txtPrecio.setText("899.0");
		        	txtAncho.setText("52.5");
		        	txtAlto.setText("85.5");
		        	txtFondo.setText("53.5");
		        	txtCapacidad.setText("6.5");
		        }	
		        else if (marcaslavadoras == 4) {
		        	txtPrecio.setText("1099.0");
		        	txtAncho.setText("63.20");
		        	txtAlto.setText("102.0");
		        	txtFondo.setText("67");
		        	txtCapacidad.setText("17.0");
		        }
		    	        	    
		    }
		});
	}*/
	
	
