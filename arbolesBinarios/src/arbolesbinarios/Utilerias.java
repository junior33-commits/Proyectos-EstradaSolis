/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Utilerias {
    public static void leerArchivo(ArbolBinario cola) {
        // String filePath = JOptionPane.showInputDialog(null,"Ingresa nombre de archivo con ruta\n"
        //     + "ejemplo: D:\\2025 Sep - dIC\\Mi material Estructura de datos\\numeros_arbol_binario.txt");
        String filePath = "C:\\Users\\DELL\\OneDrive - Universidad Tecnológica de León\\Escritorio\\LDSM402\\Estructura de Datos\\diccionario_arbol_binario.txt";
        try {
            Scanner s = new Scanner(new File(filePath), "UTF-8");    //Creamos el Scanner a partir del File. En este momento se comprueba que existe el mismo
            while (s.hasNext()) {   //Mientras haya tokens en el archivo
                String palabra = s.nextLine().trim();
                String significado = "";
                if(s.hasNextLine()){
                    significado = s.nextLine().trim();
                }
                if(!palabra.isEmpty()){
                    cola.insertar(palabra, significado);
                }
            }
            s.close();
            JOptionPane.showMessageDialog(null, "Archivo leido, datos incorporados");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El fichero " + filePath + " no existe.");
        }
    }
}