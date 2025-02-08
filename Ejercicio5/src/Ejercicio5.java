public class Ejercicio5 {
    public static void main(String[] args) throws Exception {

        // & var preciosinDescuento = 660.0;
        // & var descuento = 100.0;
        // & var totalaPagar = preciosinDescuento / descuento * 90;
        // & System.out.println("El total a pagar es "+totalaPagar);

        var preciosinDescuento = 660.0;
        var descuento = 0.10;
        var totalDescuento = preciosinDescuento * descuento;
        var totalaPagar = preciosinDescuento - totalDescuento;
        System.out.println("El total a pagar es "+totalaPagar);

    }
}
