package ventas;

public class VentaPorUnidad implements EstrategiaDeVenta {
    @Override
    public double calcularPrecio(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }
}
