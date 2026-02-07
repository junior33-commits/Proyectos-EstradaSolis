/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
public class TestHerencia {
    public static void main(String[] args) {
        //--Crear un arreglo de objetos el tipo persona
        Persona [] datos = new Persona[5];
        datos [0] = new Alumno("24000926", "Junior", 18);
        datos [1] = new Profesor("9831009", "Fox", 1);
        
        datos [2] = new Alumno("24001697", "Jaasiel", 18);
        datos [3] = new Profesor("9831007", "Foxina", 2);
        datos [4] = new Alumno ("24002185", "Fabían", 19);
        String x = JOptionPane.showInputDialog("Id a buscar;");
        for(int i = 0; i < 5; i++){
            if(datos [i].getId().equals(x)){
                JOptionPane.showMessageDialog(null, datos [i].mostrarDatos());
            }
        }
    }
}
