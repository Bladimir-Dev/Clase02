public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        double precioConDescuento = 34.0;
        double porcentajeDescontado = 15.0;
        double porcentajePagado = 100.0 - porcentajeDescontado;
        double precioOriginal = (precioConDescuento * 100.0) / porcentajePagado;

        System.out.println("El precio original sin descuento es "+precioOriginal);
        
    }
}
