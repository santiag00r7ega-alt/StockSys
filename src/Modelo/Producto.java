package modelo;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private String categoria;
    private int cantidadStock;
    private double precioUnitario;

    public Producto() {
    }

    public Producto(String nombreProducto, String categoria, int cantidadStock, double precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}