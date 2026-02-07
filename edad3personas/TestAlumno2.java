/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TestAlumno2 {
    public static void main(String[] args) {
        Alumno a2;
        //--Entradas
        String n;
        int e;
        Scanner s = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        n = s.nextLine();
        System.out.print("Escribe tu edad: ");
        e = Integer.parseInt(s.nextLine());
        //--Nueva salida
        a2 = new Alumno(n);
        System.out.println(a2.mostrarNombre());
        System.out.println("Edad----> "+e);
        System.out.println("Conclusion "+a2.mayorEdad2(e));
    }
    
}
