import java.util.Scanner;

public class ejerciciorelacion3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Su número es múltiplo de 2 y de 3");
        }
        else if (numero % 2 == 0) {
            System.out.println("Su número es múltiplo de 2");
        }
        else if (numero % 3 == 0) {
            System.out.println("Su número es múltiplo de 3");
        }

    }
}
