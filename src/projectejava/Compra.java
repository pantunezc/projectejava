package projectejava;

public class Compra {
	private Cliente cliente;
	private Producto productos;
	private String articulo;
	private double precio;
	private int cantidad;
	
	
	public Compra(Cliente cliente, Producto productos, String articulo, double precio, int cantidad) {
		super();
		this.cliente = cliente;
		this.productos = productos;
		this.articulo = articulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Producto getProductos() {
		return productos;
	}


	public void setProductos(Producto productos) {
		this.productos = productos;
	}


	public String getArticulo() {
		return articulo;
	}


	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
