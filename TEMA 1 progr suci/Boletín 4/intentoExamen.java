import java.util.Scanner;

public class intentoExamen {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre del piloto");
        String nombrepiloto = teclado.next();
        int vueltas;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número de vueltas que realizará");
            vueltas = sc.nextInt();
        }
        while (vueltas<3 || vueltas >10);

        int tiempo;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el tiempo objetivo");
            tiempo = sc.nextInt();
        }
        while (tiempo <= 0);




    }
}
