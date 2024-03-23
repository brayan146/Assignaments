package ventas;

public class RunnerProducto {
    public static void main(String[] args) {
        EstrategiaDeVenta estrategiaDeVenta = new VentaPorUnidad();
        Producto producto = new Producto("Producto 1", 10, 10, estrategiaDeVenta);
        System.out.println(producto.calcularPrecio());
        estrategiaDeVenta = new VentaPorDocena();
        producto = new Producto("Producto 2", 10, 10, estrategiaDeVenta);
        System.out.println(producto.calcularPrecio());
    }
}
