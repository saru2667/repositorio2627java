/*Realizar un programa que, dado un número introducido por el usuario, calcule su
número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
654321. Para este programa, no se deben utilizar métodos de la clase String,
Integer, o arrays; sólo deben utilizarse operaciones matemáticas. Ten en cuenta solo
valores positivos.*/

import java.util.Scanner;

public class Ejercicio1Bol4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo");

        int numero = sc.nextInt();
        int numeroInvertido = 0;

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numero = numero / 10;
        }

        System.out.println("El número a la inversa es: " + numeroInvertido);
        sc.close();
    }
}
