/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoQshort;
import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class QshortCodigo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Archivo a leer: ");
        String rutaArchivo = teclado.nextLine();
        int[] num = leerArchivo(rutaArchivo);
        if(num == null){
            System.out.println("Error al leer el archivo");
            return;
        }
        System.out.println("Numeros del archivo: ");
        mostrar(num);
        quickSort(num, 0, num.length -1);
        System.out.println("Numeros ordenados: ");
        mostrar(num);
    }
        public static int[] leerArchivo(String rutaArchivo){
            List<Integer> listaNum = new ArrayList<>();
            try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
                String linea;
                while((linea = br.readLine()) != null){
                    listaNum.add(Integer.parseInt(linea.trim()));
                }
            }catch(IOException e){
                System.out.println("Error al leer el archivo: " +e.getMessage());
                return null;
            }
            int[] arreglo = new int[listaNum.size()];
            for(int i = 0; i < listaNum.size(); i++){
                arreglo[i] = listaNum.get(i);
            }
            return arreglo;
        }
        public static void quickSort(int[] arr, int inicio, int fin){
            if(inicio < fin){
                int indiceP = particion(arr, inicio, fin);
                quickSort(arr, inicio, indiceP - 1);
                quickSort(arr, indiceP + 1, fin);
                
            }
        }
        public static int particion(int[] arr, int inicio, int fin){
            int pivote = arr[fin];
            int i = (inicio - 1);
            for(int j = inicio; j < fin; j++){
                if(arr[j] <= pivote){
                    i++;
                    int tempo = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempo;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[fin];
            arr[fin] = temp;
            return i +1 ;
        }
        public static void mostrar(int[] arr){
            for(int n : arr){
                System.out.println(n + "");
            }
            System.out.println();
        }
}