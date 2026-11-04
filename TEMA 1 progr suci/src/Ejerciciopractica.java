import java.util.Scanner;

public class Ejerciciopractica {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Pon un numero su primico");
        int numero1 = teclado.nextInt();

        System.out.println("Pon otro numero surmanico");
        int numero2 = teclado.nextInt();

        if (numero1 == numero2){
            System.out.print("los numeros son iguales");
        }
        if (numero1 < numero2) {
            System.out.println("El primer numero es menor");
        }
        if (numero1 > numero2) {
            System.out.println("El segundo numero es mayor");
        }
    }
}
