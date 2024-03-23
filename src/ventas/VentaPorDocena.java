package ventas;

public class VentaPorDocena implements EstrategiaDeVenta{
    @Override
    public double calcularPrecio(int cantidad, double precioUnitario) {
        return (cantidad *12)  *(10*precioUnitario) + (cantidad % 12) * precioUnitario;
    }
}
