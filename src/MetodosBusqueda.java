public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arr, int valorBuscado) {
        /*
         * int pos = -1; //Cuando no encuentra e valor
         * for (int i = 0; i < arreglo.length; i++) {
         * if (arreglo[i] == valorBuscado) {
         * pos = i; //cuando encuentra el valor
         * }
         * }
         * return pos;
         */

        // CODIGO OPTIMIZADO
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaBinaria(int[] arr, int value) {

        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {

            int medio = inicio + (fin - inicio) / 2; //Ecuacion para encontrar la mitad entera

            if (arr[medio] == value) {
                // ELEMENTO ENCONTRADO 
                return medio;
            }

            if (arr[medio] < value) {
                
                inicio = medio + 1; // BUscar en la mitad de la derecha
            } else {
                
                fin = medio - 1; // Buscar en la mitad de la izquierda
            }
        }

        return -1;
    }

    public void printArreglo(int[] arreglo) {

        for (int elem : arreglo) {
            System.out.println(elem + "");
        }
    }
}
