import java.util.Scanner;

public class MiEntradaSalida {
    public String LeerCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        return sc.nextLine();
    }

    public static int leerINT(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int enterointroducido = Integer.parseInt(sc.nextLine());
        return enterointroducido;
    }


    void main(String[] args) {
        String nombre = LeerCadena("¿Cómo te llamas?");
        System.out.println("Hola " + nombre);
        int numerico = leerINT("Dime un número");
        System.out.println("El número es " + numerico);
    }
}
