import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        //variable
        int numero;
        int total = 1;
        //scanner
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a positive number");
            numero = sc.nextInt();
        }while (numero<0);
        //calcular factorial
        for (int i = 1; i <= numero; i++) {
            total = i * total;
        }
        System.out.println("El factorial es " + total);
    }
}
