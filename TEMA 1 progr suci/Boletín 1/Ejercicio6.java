//Realizar un programa que solicite un carácter por teclado e informe por
//pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
//mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Input a letter");

        String letra = teclado.nextLine();

        if (letra.equals("a")  || letra.equals("e")|| letra.equals("i")  || letra.equals("o")  || letra.equals("u")) {
            System.out.println("You wrote a vocal letter");
        } else {
            System.out.println("You wrote consonant");
        }

    }
}
