import java.util.Scanner;

//Realizar un programa que lea un número entero positivo y averigüe si es
//perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
//excepto él mismo. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse.
public class Ejercicio9 {
    static void main(String[] args) {

        //tecladiño
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero positivo y te diré si es perfecto");
        //Variabliñas
        int numeroPositivo;
        int SumaDivisores;
        int divisor;

        //Bucle
        do {
            System.out.println("Escribe un numero positivo");
            numeroPositivo = teclado.nextInt();
        } while (numeroPositivo <1);

        SumaDivisores = 0;
        divisor = 1;

        while (divisor <= numeroPositivo /2) {
            if (numeroPositivo % divisor == 0) {
                SumaDivisores = SumaDivisores + divisor;
            }
            divisor++;
        }
        if (SumaDivisores == numeroPositivo) {
            System.out.println("Es un número perfecto");
        }
        while (SumaDivisores !=numeroPositivo) ;
    }
}

