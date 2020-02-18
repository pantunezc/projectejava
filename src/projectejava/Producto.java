package projectejava;

public class Producto {
	protected int cantidad,id;
	protected double precio;
	protected String nombre;
	
	public Producto(int cantidad, int id, double precio, String nombre) {
		super();
		this.cantidad = cantidad;
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
