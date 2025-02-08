import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.print("Por favor ingrese las medidas de la base en metros: ");
        var length = sc.nextDouble();

        System.out.print("Por favor ingrese las medidas de la altura en metros: ");
        var width = sc.nextDouble();

        var area = length * width;

        var perimetro  = length * 2 + width * 2;
        System.out.println("El area del rectangulo es de "+area+" metros cuadrados");

        System.out.println("El perimetro del rectangulo es de "+perimetro);


        
        sc.close();
    }
}
