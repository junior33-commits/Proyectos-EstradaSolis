/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo8;

/**
 *
 * @author DELL
 */
public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int nPaginas;
    public Libro(String i, String t, String a, int n){
        this.ISBN = i;
        this.Autor = a;
        this.nPaginas = n;
        this.Titulo = t;
    }
    public Libro(){
        
    }
    public void setISBN(String i){
        this.ISBN = i;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public void setTitulo(String t){
        this.Titulo = t;
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public void setAutor(String a){
        this.Autor = a;
    }
    public String getAutor(){
        return this.Autor;
    }
    public void setnPaginas(int n){
        this.nPaginas = n;
    }
    public int getnPaginas(){
        return this.nPaginas;
    }
    public String mostrarDatos(){
        return "El libro " +this.Titulo+ " con ISBN: " +this.ISBN+ " creado por el autor: " +this.Autor+ " tiene: " +this.nPaginas+ " paginas";
    }
}