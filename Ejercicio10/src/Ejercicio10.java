import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.print("Por favor ingrese el primer numero: ");
        var numero1 = sc.nextDouble();

        System.out.print("Por favor ingrese el segundo numero: ");
        var numero2 = sc.nextDouble();

        System.out.print("Y por favor ingrse el ultimo numero para realizar el calculo de la media aritmetica: ");
        var numero3 = sc.nextDouble();

        var total = numero1 + numero2 + numero3;

        var mediaAritmetica = total / 3;

        System.out.println("La media aritmetica de los numeros dados es de "+mediaAritmetica);

        sc.close();
    }
}
