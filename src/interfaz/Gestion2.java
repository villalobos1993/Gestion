package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import interfaceGrafica.*;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Font; 
public class Gestion2 {

	public JFrame frame2;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private	JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;
    private JSlider slider;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JButton btnCrear;
    private JTextPane textPane;
    private JLabel fecha;
    private JToggleButton tglbtnVacaciones;
    private List<Persona> lista = new LinkedList<Persona>();
    private JLabel lblMostrarDinero;
    private JButton btnleft ;
    private  JButton btnRigth;
    private ListIterator it = lista.listIterator(lista.size());
    private JLabel lblTitulo;
    private JLabel lblComentarios;
    private JLabel lblPuestoEnLa;
    private JMenuBar menuBar ;
    private JMenu mnModo;
    private JMenuItem mntmLeer;
    private JMenuItem mntmCrear;
    private JMenu mnAyuda;
    private JLabel lblSueldo ;
    private JTextField fechas;
    private JList list;
    private String[] trabajos={"Jefe supremo", "Currante", "Programador","Becario"};
    private Iterator<Persona> i;
    private JMenuItem mntmSalir;
    private int id;
    private JTextField txtSexo;
   
    private JLabel lblSexo;
    private JTextField txtPuesto;
    private JLabel lblnumero;
    private JButton btnBorrar;
    private JButton btnEditar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion2 window = new Gestion2();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gestion2() {
		frame2 = new JFrame();

		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		slider = new JSlider();
		slider.setPaintTicks(true);
		
		
		lblNombre = new JLabel("Nombre");
		lblApellido = new JLabel("Apellido");
		fecha = new JLabel("Antiguedad");
		btnCrear = new JButton("Crear");
		
		textPane = new JTextPane();
		
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		tglbtnVacaciones = new JToggleButton("Esta de Vacaciones");
		
		lblMostrarDinero = new JLabel("");
		
		btnleft = new JButton("");
		btnleft.setEnabled(false);
		btnRigth = new JButton("");
		btnRigth.setEnabled(false);
		
		menuBar = new JMenuBar();
		
		
		mnModo = new JMenu("Modo");
		menuBar.add(mnModo);
		
		mntmLeer = new JMenuItem("Leer");
		
		mnModo.add(mntmLeer);
		
		mntmCrear = new JMenuItem("Crear");
		mnModo.add(mntmCrear);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmSalir = new JMenuItem("Salir");
		
	    lblSueldo = new JLabel("Sueldo (0-10000)");
	    fechas = new JTextField();
	    lblTitulo = new JLabel("Gestion de Personal - Modo Crear");
	    list = new JList();
	    Iterator<Persona> i= lista.iterator();
	    id=0;
	    lblSexo = new JLabel("Sexo");
	    txtSexo = new JTextField();
	    txtSexo.setEnabled(false);
	    
	    
		txtPuesto = new JTextField();
		txtPuesto.setEnabled(false);
		lblComentarios = new JLabel("Comentarios");
		lblPuestoEnLa = new JLabel("Puesto en la empresa");
		lblnumero = new JLabel("");
		btnBorrar = new JButton("Borrar");
		btnEditar = new JButton("Editar");
	
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Propiedades
		Propiedades();
		//Eventos
		eventos();
		
	}

	private void Propiedades(){
		frame2.setBounds(100, 100, 633, 457);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
	
		
		lblNombre.setBounds(58, 86, 46, 14);
		frame2.getContentPane().add(lblNombre);
		
		lblApellido.setBounds(58, 123, 46, 14);
		frame2.getContentPane().add(lblApellido);
		
		
		rdbtnMujer.setBounds(34, 159, 70, 23);
		frame2.getContentPane().add(rdbtnMujer);
		
	
		rdbtnHombre.setBounds(128, 159, 86, 23);
		frame2.getContentPane().add(rdbtnHombre);
		
		
		slider.setBounds(371, 123, 200, 34);
		frame2.getContentPane().add(slider);
		
		
		btnCrear.setBounds(58, 345, 156, 47);
		frame2.getContentPane().add(btnCrear);
		
		
		textPane.setBounds(323, 231, 270, 136);
		frame2.getContentPane().add(textPane);
		
		
		fecha.setBounds(10, 296, 108, 14);
		frame2.getContentPane().add(fecha);
		
		
		txtNombre.setBounds(128, 83, 86, 20);
		frame2.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtApellido.setBounds(128, 120, 86, 20);
		frame2.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		
		tglbtnVacaciones.setBounds(371, 53, 192, 47);
		frame2.getContentPane().add(tglbtnVacaciones);
		
		slider.setMaximum(10000);
		
		
		lblMostrarDinero.setBounds(371, 152, 192, 54);
		frame2.getContentPane().add(lblMostrarDinero);
		

	
		btnleft.setIcon(new ImageIcon(Gestion2.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		btnleft.setBounds(430, 11, 46, 23);
		frame2.getContentPane().add(btnleft);
		
		btnRigth.setIcon(new ImageIcon(Gestion2.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlay.png")));
		
		
		btnRigth.setBounds(547, 11, 46, 23);
		frame2.getContentPane().add(btnRigth);
		
		
		lblTitulo.setToolTipText("");
		lblTitulo.setLabelFor(frame2);
		lblTitulo.setBounds(10, 11, 300, 30);
		frame2.getContentPane().add(lblTitulo);
		
		
		lblComentarios.setBounds(313, 206, 68, 14);
		frame2.getContentPane().add(lblComentarios);
		
		
		lblPuestoEnLa.setBounds(10, 201, 104, 14);
		frame2.getContentPane().add(lblPuestoEnLa);
		
		
		lblSueldo.setBounds(265, 123, 96, 23);
		frame2.getContentPane().add(lblSueldo);
		
		frame2.setJMenuBar(menuBar);
		lblMostrarDinero.setHorizontalAlignment(SwingConstants.CENTER);
		lblMostrarDinero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMostrarDinero.setForeground(Color.GREEN);
		tglbtnVacaciones.setForeground(Color.BLUE);
		
		
		fechas.setBounds(128, 293, 86, 20);
		frame2.getContentPane().add(fechas);
		fechas.setColumns(10);
		
		
		list.setBounds(124, 205, 156, 77);
		frame2.getContentPane().add(list);
		list.setListData(trabajos);
		txtSexo.setBounds(128, 160, 86, 20);
		frame2.getContentPane().add(txtSexo);
		txtSexo.setColumns(10);
		
		
		lblSexo.setEnabled(false);
		lblSexo.setBounds(58, 163, 46, 14);
		
		frame2.getContentPane().add(lblSexo);
		txtPuesto.setBounds(128, 203, 86, 20);
		frame2.getContentPane().add(txtPuesto);
		txtPuesto.setColumns(10);
		mnAyuda.add(mntmSalir);
		
		
		lblnumero.setBounds(486, 11, 51, 23);
		frame2.getContentPane().add(lblnumero);
		
		
		
		btnEditar.setBounds(15, 357, 89, 23);
		frame2.getContentPane().add(btnEditar);
		btnEditar.setVisible(false);
		
		
		btnBorrar.setBounds(157, 357, 89, 23);
		btnBorrar.setVisible(false);
		frame2.getContentPane().add(btnBorrar);
		lblnumero.setVisible(false);
		txtSexo.setVisible(false);
		
	}
	private void eventos(){
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean datos = true;
				String aux = "";
				boolean pulsado = false;
				String puesto="";
				String vacaciones = "Esta trabajando";
				
				if(txtNombre.getText().equals(""))
				{
					datos = false;
					txtNombre.setBackground(Color.RED);
					
				}

				if(txtApellido.getText().equals(""))
				{
					txtApellido.setBackground(Color.RED);
					datos = false;
				}
				
				
				
				if(fechas.getText().equals(""))
				{
					fechas.setBackground(Color.RED);
					datos = false;
				}
				
				
				if(rdbtnMujer.isSelected())
				{
					aux = rdbtnMujer.getText();
					pulsado= true;					
				}
				
				if(rdbtnHombre.isSelected())
				{
					aux = rdbtnHombre.getText();
					pulsado= true;	
				}
			    
				for(int i = 0; i<trabajos.length; i++){
					 
					if(list.getSelectedValue() == trabajos[i]){
						puesto = trabajos[i];
						
					}
				}
				if(puesto.equals("")){
					datos=false;
				}
				if(aux.equals(""))
				{
					datos = false;
				}
				
				if(tglbtnVacaciones.isSelected()){
					
					vacaciones ="Esta de vacaciones";
				}
				else{
					vacaciones = "Esta trabajando";
				}
				if(datos && pulsado==true){
				Persona p = new Persona(txtNombre.getText(),txtApellido.getText(),puesto,lblMostrarDinero.getText(),fechas.getText(),aux,vacaciones);
				System.out.println(p);
				lista.add(p);
				
				}
				
			}
		});
		//Evento del slider
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				String aux=String.valueOf(slider.getValue());
				lblMostrarDinero.setText(aux);;
			} 
		});
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		btnRigth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lista.isEmpty()){
					JOptionPane.showMessageDialog(null,"No tiene empleados ahora mismo");
				}
				
				
				if(id < (lista.size()-1)){
				id+=1;

				txtNombre.setText(lista.get(id).getNombre());
				txtApellido.setText(lista.get(id).getApellido());
				lblSexo.setText(lista.get(id).getSexo());
				txtSexo.setText(lista.get(id).getSexo());
				txtPuesto.setText(lista.get(id).getPuesto());
				fecha.setText(lista.get(id).getFecha());
				lblnumero.setText( (id+1) +" De "+ (lista.size()));
				lblSueldo.setText(lista.get(id).getSueldo());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No existen mas empleados");
				}
				
			}
		});
		
		mntmLeer.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent e) {
				btnleft.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if(lista.isEmpty()){
							JOptionPane.showMessageDialog(null,"No tiene empleados ahora mismo");
						}
						if(id == 0){
							
							id=0;
						}
							
						
						if(id > 0){
							id-=1;	
						
							txtNombre.setText(lista.get(id).getNombre());
							txtApellido.setText(lista.get(id).getApellido());
							lblSexo.setText(lista.get(id).getSexo());
							txtSexo.setText(lista.get(id).getSexo());
							txtPuesto.setText(lista.get(id).getPuesto());
							fecha.setText(lista.get(id).getFecha());
							lblnumero.setText( (id+1) +" De "+ (lista.size()));
							lblSueldo.setText(lista.get(id).getSueldo());
							}
							else{
								JOptionPane.showMessageDialog(null, "No existen mas empleados");
							}
						
						
							
						}
				});
				
				if(lista.isEmpty()){
					JOptionPane.showMessageDialog(null, "La lista esta vacia.");
					
				}else{
					
				
					lblTitulo.setText("Gestion del personal - Modo Leer");
					btnRigth.setEnabled(true);
					btnleft.setEnabled(true);
					txtNombre.setText(lista.get(id).getNombre());
					txtApellido.setText(lista.get(id).getApellido());
					
					rdbtnHombre.setVisible(false);
					rdbtnMujer.setVisible(false);
					
					lblSexo.setEnabled(true);
					lblSexo.setVisible(true);
					lblSexo.setText(lista.get(id).getSexo());
					txtSexo.setText(lista.get(id).getSexo());
					list.setVisible(false);
					txtPuesto.setText(lista.get(id).getPuesto());
					fechas.setText(lista.get(id).getFecha());
					lblnumero.setVisible(true);
					lblnumero.setText( (id+1) +" De "+ (lista.size()));
					lblSueldo.setText(lista.get(id).getSueldo());
					btnBorrar.setVisible(true);
					btnEditar.setVisible(true);
					btnCrear.setVisible(false);
					
					
					
				}}
				
		});
		
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				txtNombre.setText(txtNombre.getText());
				txtApellido.setText(txtApellido.getText());
				lblSexo.setText(lblSexo.getText());
				txtSexo.setText(txtSexo.getText());
				txtPuesto.setText(txtPuesto.getText());
				fecha.setText(fecha.getText());			
				lblSueldo.setText(lista.get(id).getSueldo());
				
			lista.get(id).setNombre(txtNombre.getText());
			lista.get(id).setApellido(txtApellido.getText());
			lista.get(id).setSexo(lblSexo.getText());
			lista.get(id).setPuesto(txtPuesto.getText());
			lista.get(id).setFecha(fecha.getText());
			lista.get(id).setSueldo(lblSueldo.getText());
		
			}
		});
		
		mntmSalir.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
