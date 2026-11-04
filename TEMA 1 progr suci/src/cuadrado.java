import java.util.Scanner;

public class cuadrado {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mecagoenmividaentera = teclado.nextInt();

        for (int i = 0; i < mecagoenmividaentera; i++) {
            for (int k = 0; k < mecagoenmividaentera; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
