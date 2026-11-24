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
        while (vueltas < 3 || vueltas > 10);

        for (int i = 0; i < vueltas; i++);


        int tiempo;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el tiempo objetivo");
            tiempo = sc.nextInt();
        }
        while (tiempo <= 0);

        int tiempov;
        System.out.println("Introduce el tiempo realizado");
        tiempov = teclado.nextInt();

        if (tiempov < tiempo) {
            System.out.println("tiempo mejorado");
        } else if (tiempov > tiempo) {
            System.out.println("tiempo empeorado");
        } else if (tiempov == tiempo) {
            System.out.println("tiempo igualado");
        }
    }
}
