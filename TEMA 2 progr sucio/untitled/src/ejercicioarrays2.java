//Crea un programa que detecte cuántos números negativos hay en un array de
//enteros
public class ejercicioarrays2 {
    static void main(String[] args) {
        int[] numeros = {4, -2, 3, -1, -8, 6};

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                contador++;
            }
        }
        System.out.println("Hay"+ contador + " numeros negativos.");
    }
}
