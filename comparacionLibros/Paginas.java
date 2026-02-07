/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo8;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Paginas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Libro libro1 = new Libro();
        String a, i, t;
        int n;
        System.out.print("Titulo del libro: ");
        t = entrada.nextLine();
        System.out.print("Autor del libro: ");
        a = entrada.nextLine();
        System.out.println("Numero de paginas del libro: ");
        n = Integer.parseInt(entrada.nextLine());
        System.out.println("ISBN del libro: ");
        i = entrada.nextLine();
        libro1.setAutor(a);
        libro1.setISBN(i);
        libro1.setTitulo(t);
        libro1.setnPaginas(n);
        System.out.println(libro1.mostrarDatos());
        System.out.println("-------------");
        Libro libro2 = new Libro();
        System.out.println("Titulo del libro: ");
        t = entrada.nextLine();
        System.out.println("Autor del libro: ");
        a = entrada.nextLine();
        System.out.println("Numero de paginas del libro: ");
        n = Integer.parseInt(entrada.nextLine());
        System.out.println("ISBN del libro: ");
        i = entrada.nextLine();
        libro2.setAutor(a);
        libro2.setISBN(i);
        libro2.setTitulo(t);
        libro2.setnPaginas(n);
        System.out.println(libro2.mostrarDatos());
        System.out.println("--------------");
        if (libro1.getnPaginas() > libro2.getnPaginas()){
            System.out.println("El libro " +libro1.getTitulo()+ "tiene mas paginas");
        }
        else{
            System.out.println("El libro " +libro2.getTitulo()+ "tiene mas paginas");
        }
    }
}