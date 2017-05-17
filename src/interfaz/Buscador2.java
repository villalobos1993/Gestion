package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Buscador2 {

	private JFrame frame4;
	private JTextField Nombre;
	private JTextField Sueldo;
	private JTextField Puesto;
	private JTextField FechaAlta;
	private JLabel lblNomre ;
	private JLabel lblSueldo;
	private JLabel lblPuesto; 
    private JLabel lblFecha;
    private JButton btnLeft;
	private JButton btnRigth;
	private JButton btnVolver;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscador2 window = new Buscador2();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buscador2() {
		frame4 = new JFrame();
		lblNomre = new JLabel("Nombre");
		lblSueldo = new JLabel("Sueldo");
		lblPuesto = new JLabel("Puesto");
		lblFecha = new JLabel("Fecha Alta");
		Nombre = new JTextField();
		Sueldo = new JTextField();
		Puesto = new JTextField();
		FechaAlta = new JTextField();
		btnLeft = new JButton("Left");
		btnRigth = new JButton("Rigth");
		btnVolver = new JButton("Volver");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		propiedades();
		
		Eventos();
		
	}
	
	
	
	public void propiedades(){
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		
		lblNomre.setBounds(10, 54, 46, 14);
		frame4.getContentPane().add(lblNomre);
		
		
		lblSueldo.setBounds(10, 79, 46, 14);
		frame4.getContentPane().add(lblSueldo);
		
		
		lblPuesto.setBounds(10, 104, 46, 14);
		frame4.getContentPane().add(lblPuesto);
		
		
		lblFecha.setBounds(10, 129, 69, 14);
		frame4.getContentPane().add(lblFecha);
		
		
		Nombre.setBounds(89, 51, 86, 20);
		frame4.getContentPane().add(Nombre);
		Nombre.setColumns(10);
		
		
		Sueldo.setBounds(89, 76, 86, 20);
		frame4.getContentPane().add(Sueldo);
		Sueldo.setColumns(10);
		
		
		Puesto.setBounds(89, 101, 86, 20);
		frame4.getContentPane().add(Puesto);
		Puesto.setColumns(10);
		
		
		FechaAlta.setBounds(89, 126, 86, 20);
		frame4.getContentPane().add(FechaAlta);
		FechaAlta.setColumns(10);
		
		
		btnLeft.setBounds(240, 28, 89, 23);
		frame4.getContentPane().add(btnLeft);
		
		
		btnRigth.setBounds(339, 28, 89, 23);
		frame4.getContentPane().add(btnRigth);
		
		
		btnVolver.setBounds(290, 216, 89, 23);
		frame4.getContentPane().add(btnVolver);
	}

	
      public void Eventos(){
		
    	  
	  }
      
      
      /**
       * Getter and Setter
       * @return
       */
      public JFrame getFrame4() {
  		return frame4;
  	}

  	public void setFrame4(JFrame frame4) {
  		this.frame4 = frame4;
  	}

}
