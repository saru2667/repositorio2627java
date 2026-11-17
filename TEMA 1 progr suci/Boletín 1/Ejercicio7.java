
//Realizar un programa que lea el estado civil de una persona (S-Soltero, C-
//Casado, V-Viudo y D-Divorciado) y su edad. Después debe mostrar por
//pantalla el porcentaje de retención que debe aplicársele de acuerdo con las
//siguientes reglas:
// A los solteros o divorciados menores de 35 años, un 12%
// Todas las personas mayores de 50 años, un 8.5%
// A los viudos o casados menores de 35 años, un 11.3%
// Al resto de casos se le aplica un 10.5%


import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduciendo únicamente la primera letra, dime cuál es tu estado civil");

        String letraec = teclado.nextLine();

        System.out.println("Ahora introduce tu edad");

        int edad = teclado.nextInt();

        if (edad > 34 && edad < 51) {
            System.out.println("Se te aplica un 10.5%");
        } else if (edad < 35 && letraec.equals("s") || letraec.equals("d")) {
            System.out.println("Se te aplica un 12%");
        } else if (edad < 35 && letraec.equals("v") || letraec.equals("c")) {
            System.out.println("Se te aplica un 11.3%");
        } else if (edad > 50) {
            System.out.println("Se te aplica un 12 %");
        }
    }
}
