package projectejava;

public class Empresa {
	private int telefono ,cp;
	private String cif,nombre,direccion,pais;
	
	public Empresa(int telefono, String cif, String nombre, String direccion, String pais, int cp) {
		super();
		this.telefono = telefono;
		this.cif = cif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.pais = pais;
		this.cp = cp;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
	
	
	
}
