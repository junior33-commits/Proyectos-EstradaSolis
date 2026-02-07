/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
public class TestPersona {
    public static void main(String[] args) {
        //--Entradas
        String n;
        int e;
        n = JOptionPane.showInputDialog("Nombre: ");
        e = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        //--Instanciar Objetos
        Persona p1 = new Persona(n, e);
        //--Salida
        JOptionPane.showMessageDialog(null, p1.mostrarDatos());
    }
}
