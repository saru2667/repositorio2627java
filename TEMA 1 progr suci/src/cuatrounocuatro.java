import java.time.LocalTime;
import java.util.Scanner;
//Realiza un programa que pregunte al usuario la hora actual (hora, minutos y
//segundos), y luego pregunte otra hora que deberá sumar a la primera, teniendo en
//cuenta el cambio de día.
//Los siguientes son salidas esperadas para las entradas:
//Introduce la hora base: 13
//Introduce los minutos base: 27
//Introduce los segundos base: 10
//¿Cuántas horas quieres sumar?: 1
//¿Cuántos minutos quieres sumar?: 0
//¿Cuántos segundos quieres sumar?: 55
//La hora resultante es: 14:28:05
//Introduce la hora base: 19
//Introduce los minutos base: 0
//Introduce los segundos base: 0
//¿Cuántas horas quieres sumar?: 5
//¿Cuántos minutos quieres sumar?: 0
//¿Cuántos segundos quieres sumar?: 0
//La hora resultante es: 00:00:00 (del día siguiente)
public class cuatrounocuatro {
    static void main(String[] args) {
        //Scanner, preguntas y variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la hora en formato hora->minutos->segundos");
        System.out.println("Hora:");
        int horausuario = teclado.nextInt();
        System.out.println("Minutos:");
        int minutosusuario = teclado.nextInt();
        System.out.println("Segundos:");
        int segundos = teclado.nextInt();
        //faltan las comprobaciones pero mejor me limito a prestar atencion ahora..


        System.out.println("Dime la hora a sumar en formato hora->minutos->segundos");
        int horausuario2 = teclado.nextInt();
        System.out.println("Minutos:");
        int minutosusuario2 = teclado.nextInt();
        System.out.println("Segundos:");
        int segundos2 = teclado.nextInt();

    }
}
