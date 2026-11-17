import java.util.Scanner;

//Realizar un programa que solicite 4 números e imprima la media de los
//números. También debe imprimir aquellos números que son superiores a la
//media.

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int numero1 = teclado.nextInt();

        System.out.println("Dime el segundo número");
        int numero2 = teclado.nextInt();

        System.out.println("Dime el tercer número");
        int numero3 = teclado.nextInt();

        System.out.println("Dime el cuarto número");
        int numero4 = teclado.nextInt();

        double media = 0;
        double paramedia = 0;

        paramedia = (numero1 + numero2 + numero3 + numero4) ;
        media = (paramedia / 4) ;

        System.out.println("La media es " + media + " mi bro");

        if (numero1 > media) {
            System.out.println("El primer número es mayor que la media");
        }
        if (numero2 > media) {
            System.out.println("El segundo es mayor que la media");
        }
        if (numero3 > media) {
            System.out.println("El tercero es mayor que la media");
        }
        if (numero4 > media) {
            System.out.println("El cuarto es mayor que la media");
        }
    }
}
