import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {

        int numero = 0;

        System.out.println("Dime un número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();

        if (numero %2 == 0){
            System.out.println("El número " + numero + " es múltiplo de 2");
        } else {
            if (numero %3 == 0){
                System.out.println("El número " + numero + " es múltiplo de 3");
            }
        }



    }
}