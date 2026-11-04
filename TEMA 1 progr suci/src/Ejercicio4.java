import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúantos años tienes?");
        int numero = teclado.nextInt();

        if (numero < 13) {
            System.out.println("Eres un niño");
        } else if (numero < 18) {
            System.out.println("Eres un adolescente");
        } else if (numero < 30) {
            System.out.println("Eres un joven");
        } else if (numero > 29) {
            System.out.println("Eres un adulto");
        }
    }
}
