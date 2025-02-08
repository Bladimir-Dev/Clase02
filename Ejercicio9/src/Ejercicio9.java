import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.print(
                "Ingrese la temperatura en grados Celcius que desea convertir a grados Fahrenheit y grados Kelvin: ");

        var celcius = sc.nextDouble();

        var fahrenheit = celcius * 9 / 5 + 32;

        var kelvin = celcius + 273.15;

        System.out.println("Al convertir la temperatura dada nos da un resultado de " + fahrenheit
                + " grados Fahrenheit y " + kelvin + " en grados Kelvin");

        sc.close();
    }
}
