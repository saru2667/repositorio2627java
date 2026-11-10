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
    // ORDENAR INT ARRAY CON UN METODO BURBUJA
    public static int[] ordenarArray(int[] array) {

        // ORDENAR ARRAY CON METODO BURBUJA
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;

                }
            }
        }

        return array;
    }

}