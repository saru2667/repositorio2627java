//Realizar un programa que solicite 3 números cualesquiera y los muestre por
//pantalla ordenados de menor a mayor.
import java.util.Scanner;

public class Ejercicio1B3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime 3 números");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int aux;

        // Dejo el menor en "a"
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        // Ahora a es el menor; falta comparar b y c
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Ordenados: " + a + " " + b + " " + c);
    }
}