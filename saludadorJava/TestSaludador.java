/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
public class TestSaludador {
    public static void main(String[] args) {
        //--Entradas
        String n;
        n = JOptionPane.showInputDialog("Hola, escribe tu nombre: ");
        //--Crear los objetos
        Saludador obj=new Saludador();
        //--Salidas
        JOptionPane.showMessageDialog(null, obj.saludo(n));
    }
}
