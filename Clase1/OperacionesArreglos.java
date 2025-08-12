import java.util.Arrays;
import java.util.Random;
 
public class OperacionesArreglos {
 
    /*
     * Método para llenar el arreglo con números enteros y retornarlo
     */
    public int[] llenarArregloEnteros(int tam){
 
        Random r = new Random();
 
        int[] a = new int[tam];
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt() * 100 + 1;
        }
 
        return a;
    }
 
    /*
     * Método para mostrar el arreglo de números enteros
     */
 
    public void mostrarArregloEnteros(int[] a){
        System.out.println(Arrays.toString(a));
    }
 
}

