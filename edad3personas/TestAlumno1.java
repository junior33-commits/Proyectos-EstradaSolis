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
public class TestAlumno1 {
    public static void main(String[] args) {
        //--Crear 3 objetos del tipo alumno
        Alumno a1;
        String n;
        int e;
        //--Entradas
        Scanner s = new Scanner (System.in);
        for(int i = 1; i <= 3; i++){
            System.out.print("Escribe tu nombre: ");
            n = s.nextLine();
            System.out.print("Escribe tu edad: ");
            e = Integer.parseInt(s.nextLine());
            a1 = new Alumno(n, e);
            System.out.println(a1.mostrarDatos());
            System.out.println("-----------------");
        }
    }
 
}
