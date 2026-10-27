//Realizar un programa que lea la edad de una persona menor a 100 años e
//informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-
//29) o un adulto.


package Boletín1;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad (debe ser menor que 100)");
        int edad = teclado.nextInt();
        if (edad > 100) {
            System.out.println("Error, te dije que pusieses un número menor que 100.");
        } else if (edad < 13) {
            System.out.println("Eres un niño");
        } else if (edad < 18 && edad > 12) {
            System.out.println("Eres un adolescente");
        } else if (edad < 30 && edad > 17) {
            System.out.println("Eres un joven");
        } else if (edad > 29) {
            System.out.println("Eres un adulto");
        }
    }
}