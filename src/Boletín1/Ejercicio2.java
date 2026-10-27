//Realizar un programa que solicite dos números por teclado e imprima en
//pantalla si son iguales, el primero mayor que el segundo o el primero más
//pequeño que el segundo.
package Boletín1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = teclado.nextInt();
        System.out.println("Dime otro número");
        int numero2 = teclado.nextInt();

        if (numero == numero2) {
            System.out.println("Son iguales");
        } else if (numero > numero2) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (numero < numero2) {
            System.out.println("El primer número es mayor que el segundo");
        }
    }
}
