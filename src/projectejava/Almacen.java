package projectejava;

public class Almacen {
    private String articulo, tipo;
    private double cantidad;
    
    public Almacen(String articulo, String tipo, double cantidad){
        this.articulo = articulo;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}

