package projectejava;

public class Comanda {
	private Empresa empresa;
	private Proveedor proveedor;
	private String articulo;
	private double precio;
	private int cantidad;
	
	
	public Comanda(Empresa empresa, Proveedor proveedor, String articulo, double precio, int cantidad) {
		super();
		this.empresa = empresa;
		this.proveedor = proveedor;
		this.articulo = articulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
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
