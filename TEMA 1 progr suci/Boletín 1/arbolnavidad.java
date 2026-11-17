public class arbolnavidad {
    public static void main(String[] args) {
        int altura = 5; // Número de filas del follaje del árbol

        // 1. Dibujar el follaje del árbol
        for (int i = 0; i < altura; i++) {
            // Imprimir espacios en blanco para centrar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos del follaje
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Salto de línea por cada fila
            System.out.println();
        }
    }
}