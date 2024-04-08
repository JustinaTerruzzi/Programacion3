package práctica1_array_ej3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Estudiante () {
		
	}
	
	public Estudiante (String nombre, String apellido) {
        // Utilizamos los setters para asignar los valores
        this.setNombre(nombre);
        this.setApellido(apellido);
    }
	
	public String tusDatos() {
		String miString = "Mi nombre es "+ this.getNombre();
		return miString; 
	}
	@Override
	public boolean equals (Object obj) {
		boolean eq = false;
		if (obj == null || getClass() != obj.getClass()) {
            eq = false;
        }
		Estudiante estudiante = (Estudiante) obj;
		if (this.nombre == estudiante.getNombre() && this.apellido == estudiante.getApellido()) {
			eq = true;
		}
		return eq;
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
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
