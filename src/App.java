import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in );
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        //int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //metodosBusqueda.printArreglo(arreglo);
        //int posicion = metodosBusqueda.busquedaSecuencial(arreglo,50);
        
        /*if (posicion !=-1) {
            System.out.println("El valor se encuentra en la posicion "+"["+posicion+"]");
        } else{
        System.out.println("El valor no se ha encontrado");
        }*/

        
        int[] arr = new int[100000];
        int posicion = metodosBusqueda.busquedaSecuencial(arr,50418);

        for (int i = 0; i < arr.length+1; i++) {
            System.out.print(i+" ");
        }
        if (posicion == arr.length) {
            System.out.println("Valor encontrado en la  "+"["+posicion+"]");
            
        } else{
            System.out.println("Valor no encontrad0");
        }
    }
}
