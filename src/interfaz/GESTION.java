package interfaz;
import interfaceGrafica.*;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class GESTION {
	private JFrame frame;
	private JTextField txtUsuario;
    private JButton btnAceptar;
    private JTextPane txtpnUsuario;
    private JTextPane txtContraseña ;
    private JPasswordField passwordField;
 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GESTION window = new GESTION();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GESTION() {
		frame = new JFrame();
		btnAceptar = new JButton("Aceptar");
		
		txtUsuario = new JTextField();
		txtpnUsuario = new JTextPane();
		txtContraseña = new JTextPane();
		passwordField = new JPasswordField();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Propiedades
		propiedades();
		//Eventos
		Eventos();
	}
	private void propiedades(){
		frame.setBounds(100, 100, 366, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAceptar.setBounds(118, 228, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		
		txtUsuario.setBounds(83, 98, 166, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		
		txtpnUsuario.setBackground(Color.LIGHT_GRAY);
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBounds(83, 67, 42, 20);
		frame.getContentPane().add(txtpnUsuario);
		
		
		txtContraseña.setBackground(Color.LIGHT_GRAY);
		txtContraseña.setText("Contrase\u00F1a");
		txtContraseña.setBounds(83, 133, 62, 20);
		frame.getContentPane().add(txtContraseña);
		
	
		passwordField.setBounds(83, 164, 166, 20);
		frame.getContentPane().add(passwordField);
	}
	private void Eventos(){
		
		btnAceptar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				Gestion2 ventana=new Gestion2();
				ventana.frame2.setVisible(true);
				frame.dispose();
			
			}
		});
		
		
	}
}
