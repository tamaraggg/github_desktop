package usuarios;

public class Usuarios {
	private String dni;
	private String nombre;
	private String apellidos;
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuarios(String dni, String nombre, String apellidos) {
		super();
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
