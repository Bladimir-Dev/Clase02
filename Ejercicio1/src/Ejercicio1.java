public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        var calculadora = 6 / 2 * (1 + 2);

        System.out.println(calculadora);

        /*
         * &Primero, resuelves el paréntesis: 1 + 2 = 3
         * &Luego, la operación se convierte en: 6/2*3
         & &Utilizamos el orden de las operaciones, que es el siguiente
         & Paréntesis (Brackets)
         & Exponentes (Exponents)
         & Multiplicación y División (Multiplication and Division)
         & Suma y Resta (Addition and Subtraction)
         * Entonces, primero resuelves la división: 6/2 = 3
         * Y luego multiplicas el resultado por 3: 3*3 = 9
         */
    }
}
