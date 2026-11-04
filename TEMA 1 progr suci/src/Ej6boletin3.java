//Realizar un programa que lea dos números enteros cualesquiera numeroA
//y numeroB, y calcule el producto los números mediante sumas, es decir,
//sin usar el operador *

import java.util.Scanner;

public class Ej6boletin3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el primer número");
        int numero1 = teclado.nextInt();

        System.out.println("dime el segundo número");
        int numero2 = teclado.nextInt();

        int resultado = 0;

        for (int i = 0; i<numero2; i++) {
            resultado = resultado + numero1;
        }
        System.out.println("El resultado es "+resultado);





    }
}
