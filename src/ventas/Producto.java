package ventas;

public class Producto {
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private EstrategiaDeVenta estrategiaDeVenta;

    public Producto(String nombre, double precioUnitario, int cantidad, EstrategiaDeVenta estrategiaDeVenta) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.estrategiaDeVenta = estrategiaDeVenta;
    }

    public double calcularPrecio() {
        return estrategiaDeVenta.calcularPrecio(cantidad, precioUnitario);
    }
}
