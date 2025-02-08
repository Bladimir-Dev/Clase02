import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        var sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de peces rojos: ");
        var pRojos = sc.nextInt();

        System.out.print("Ingrese la cantidad de peces azules: ");
        var pAzules = sc.nextInt();

        var totalPeces = pRojos + pAzules;

        System.out.println("El total de peces dentro del acuario es " + totalPeces);

        sc.close();
    }
}
