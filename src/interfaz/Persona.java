package interfaz;

public class Persona {

	private String nombre;
    private String apellido;
    private String sueldo;
    private String fecha;
    private String sexo;
    private String puesto;
    private String vacaciones;
    


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public String getVacaciones() {
		return vacaciones;
	}


	public void setVacaciones(String vacaciones) {
		this.vacaciones = vacaciones;
	}


	public Persona(String nombre, String apellido, String puesto,String sueldo, String fecha, String sexo, String vacaciones) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.fecha = fecha;
		this.sexo = sexo;
		this.puesto=puesto;
	}
    
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getSueldo() {
		return sueldo;
	}


	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", fecha=" + fecha
				+ ", sexo=" + sexo + "]";
	}
    
    
	

	
	
	
}
