public class SelectionSort {

    public static void main(String[] args) {

        // 1. Creamos el arreglo
        int[] numeros = {5, 3, 8, 1, 2};

        // 2. Recorremos el arreglo
        for (int i = 0; i < numeros.length - 1; i++) {

            // 3. Suponemos que el elemento actual es el menor
            int posicionMenor = i;

            // 4. Buscamos el menor elemento en la parte restante
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[posicionMenor]) {
                    posicionMenor = j;
                }
            }

            // 5. Intercambiamos el elemento actual con el menor
            int temporal = numeros[i];
            numeros[i] = numeros[posicionMenor];
            numeros[posicionMenor] = temporal;
        }

        // 6. Mostramos el arreglo ordenado
        System.out.println("Arreglo ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}