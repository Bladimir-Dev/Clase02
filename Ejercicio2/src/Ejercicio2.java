import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        var cienGramos = 5.95;
        var kiloGramos = cienGramos * 10;

        System.out.println("El precio correcto es: "+kiloGramos);
        sc.close();
    }
}
