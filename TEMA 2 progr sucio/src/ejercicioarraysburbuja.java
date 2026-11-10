
public class ejercicioarraysburbuja {
    static void main(String[] args) {
        System.out.println("la serie de numeros es 4,1,3,2,5,6, y los voy a invertir");
        int[] numeros = {4, 1, 3, 2, 5, 6};

        numeros = MiEntradaSalida.ordenarArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor de " + i + " es " + numeros[i]);
        }
    }
}
