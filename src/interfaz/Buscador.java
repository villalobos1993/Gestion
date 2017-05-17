package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buscador {

	private JFrame frame3;
	private JRadioButton rdbtnNombre;
	private JRadioButton rdbtnSueldo;
	private JRadioButton rdbtnPuesto;
	private JRadioButton rdbtnAntiguedad;
	private JTextField txtNombre;
	private JTextField txtDesde;
	private JTextField txtHasta;
	private JButton btnGo;
	private JLabel lblDesde;
	private JLabel lblHasta;
	private JList list;
	private JLabel lblText;
	private String[] trabajos = {"Jefe supremo", "Currante","Programador","Becario"};
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscador window = new Buscador();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buscador() {
		frame3 = new JFrame();
		
		rdbtnNombre = new JRadioButton("Nombre");
		
		rdbtnSueldo = new JRadioButton("Sueldo");
		
		rdbtnPuesto = new JRadioButton("Puesto");
		
		rdbtnAntiguedad = new JRadioButton("Antiguedad");
		
		txtNombre = new JTextField();
		txtDesde = new JTextField();
		txtHasta = new JTextField();
		btnGo = new JButton("Go");
		
		lblDesde = new JLabel("Desde");
		list = new JList();
		lblHasta = new JLabel("Hasta");
		lblText = new JLabel("");
		
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		propiedades();
		
		Eventos();	
		
	}
	
	private void propiedades(){
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame3.getContentPane().setLayout(null);
		rdbtnNombre.setBounds(6, 30, 80, 23);
		frame3.getContentPane().add(rdbtnNombre);
		
		
		rdbtnSueldo.setBounds(88, 30, 80, 23);
		frame3.getContentPane().add(rdbtnSueldo);
		
		
		rdbtnPuesto.setBounds(170, 30, 66, 23);
		frame3.getContentPane().add(rdbtnPuesto);
		
		
		rdbtnAntiguedad.setBounds(247, 30, 86, 23);
		frame3.getContentPane().add(rdbtnAntiguedad);
		
		txtNombre.setBounds(21, 112, 86, 28);
		frame3.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setVisible(false);
		
		
		txtDesde.setBounds(324, 98, 86, 20);
		frame3.getContentPane().add(txtDesde);
		txtDesde.setColumns(10);
		txtDesde.setVisible(false);
		
		txtHasta.setBounds(325, 140, 86, 20);
		frame3.getContentPane().add(txtHasta);
		txtHasta.setColumns(10);
		txtHasta.setVisible(false);
		
		btnGo.setBounds(281, 228, 89, 23);
		frame3.getContentPane().add(btnGo);
		
		
		lblDesde.setBounds(262, 101, 46, 14);
		frame3.getContentPane().add(lblDesde);
		lblDesde.setVisible(false);
		
		lblHasta.setBounds(262, 143, 46, 14);
		frame3.getContentPane().add(lblHasta);
		lblHasta.setVisible(false);
		
		
		list.setBounds(117, 98, 135, 87);
		frame3.getContentPane().add(list);
		list.setListData(trabajos);
		list.setVisible(false);
		
		
		lblText.setBounds(21, 87, 86, 23);
		frame3.getContentPane().add(lblText);
		
	}
	
	private void Eventos(){
		
		/**
		 * Mostrar Nombre
		 */
		rdbtnNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				rdbtnAntiguedad.setSelected(false);
			    rdbtnPuesto.setSelected(false);
			    rdbtnSueldo.setSelected(false);
			    txtDesde.setVisible(false);
				txtHasta.setVisible(false);
				lblHasta.setVisible(false);
				lblDesde.setVisible(false);
				list.setVisible(false);
			    
			    txtNombre.setVisible(true);
				
				
			}
		});
		
		/**
		 * Mostrar sueldo
		 */
		rdbtnSueldo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				rdbtnAntiguedad.setSelected(false);
			    rdbtnPuesto.setSelected(false);
			    rdbtnNombre.setSelected(false);
				txtDesde.setVisible(false);
				txtHasta.setVisible(false);
				lblHasta.setVisible(false);
				lblDesde.setVisible(false);
				list.setVisible(false);
				
				txtNombre.setVisible(true);
			}
		});
		/**
		 * Mostrar Puesto
		 */
		rdbtnPuesto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnAntiguedad.setSelected(false);
			    rdbtnSueldo.setSelected(false);
			    rdbtnNombre.setSelected(false);
				txtDesde.setVisible(false);
				txtHasta.setVisible(false);
				lblHasta.setVisible(false);
				lblDesde.setVisible(false);
				txtNombre.setVisible(false);
				
				list.setVisible(true);
			}
		});
		
		/**
		 * Antiguedad
		 */
		rdbtnAntiguedad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				rdbtnPuesto.setSelected(false);
			    rdbtnSueldo.setSelected(false);
			    rdbtnNombre.setSelected(false);
			    list.setVisible(false);
			    txtNombre.setVisible(false);
			    
				txtDesde.setVisible(true);
				txtHasta.setVisible(true);
				lblHasta.setVisible(true);
				lblDesde.setVisible(true);
			}
		});
		
		/**
		 * Boton GO
		 */
		btnGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/**
				 * Antiguedad
				 */
				if(rdbtnAntiguedad.isSelected()){
                      if(txtDesde.getText().equals("")){
						JOptionPane.showMessageDialog(null,"No has introducido Texto");
					}
                      
                    if(txtHasta.getText().equals("")){
                    	JOptionPane.showMessageDialog(null,"No has introducido Texto");
                       }
					else{
						Buscador2 b2 = new Buscador2();
						frame3.setVisible(false);
						b2.getFrame4().setVisible(true);
					}
				}
				
				/**
				 * Puesto
				 */
				if(rdbtnPuesto.isSelected()){
					String puesto = "";
					for(int i = 0; i<trabajos.length; i++){
						 
						if(list.getSelectedValue() == trabajos[i]){
							puesto = trabajos[i];
						}
					}
					if(puesto.equals("")){
						JOptionPane.showMessageDialog(null,"No has introducido Texto");
					}else{
						
						Buscador2 b2 = new Buscador2();
						frame3.setVisible(false);
						b2.getFrame4().setVisible(true);
					}
				}
				/**
				 * Sueldo
				 */
				if(rdbtnSueldo.isSelected()){
                     
                    if(txtNombre.getText().equals("")){
						
						JOptionPane.showMessageDialog(null,"No has introducido Texto");
					}
					else{
						
						Buscador2 b2 = new Buscador2();
						frame3.setVisible(false);
						b2.getFrame4().setVisible(true);
					}
				}
				
				/**
				 * Nombre
				 */
				if(rdbtnNombre.isSelected()){
					
                    if(txtNombre.getText().equals("")){
						
						JOptionPane.showMessageDialog(null,"No has introducido Texto");
					}
					else{
						
						Buscador2 b2 = new Buscador2();
						frame3.setVisible(false);
						b2.getFrame4().setVisible(true);
					}
					
				}
			}
		});
		
		
		
	}

	public JFrame getFrame3() {
		return frame3;
	}

	public void setFrame3(JFrame frame3) {
		this.frame3 = frame3;
	}

}
