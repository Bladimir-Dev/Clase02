import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.print("Por favor ingrese el primer numero: ");
        var numero1 = sc.nextDouble();

        System.out.print("Por favor ingrese el segundo numero: ");
        var numero2 = sc.nextDouble();

        var suma = numero1 + numero2;
        var resta = numero1 - numero2;
        var multimplicacion = numero1 * numero2;
        var division = numero1 / numero2;

        System.out.println("La suma de los numeros ingresado es " + suma);
        System.out.println("La resta de los numeros ingresado es " + resta);
        System.out.println("La multiplicacion de los numeros ingresado es " + multimplicacion);
        System.out.println("La division de los numeros ingresado es " + division);

        sc.close();
    }
}
