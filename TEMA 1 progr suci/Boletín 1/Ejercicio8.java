import java.util.Scanner;

//Realizar un programa que lea por teclado dos marcaciones de un reloj
//digital (horas, minutos, segundos) comprendidas entre las 0:0:0 y las
//23:59:59 e informe cual de ellas es mayor.
//Ejemplo:
//Hora 1: 12:35:37
//Hora 2: 12:38:36
//“Hora 2 es mayor”

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la hora, despues los minutos y luego los segundos");
        int hora = sc.nextInt();
        System.out.println("minutos");
        int minutos = sc.nextInt();
        System.out.println("segundos");
        int segundos = sc.nextInt();


    }
}
