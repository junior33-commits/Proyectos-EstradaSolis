/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo12;

/**
 *
 * @author PC HP
 */
public class Pelicula {
    private String idPelicula;
    private String Titulo;
    private String Genero;
    private String Sinopsis;

    public Pelicula() {
    }

    public Pelicula(String idPelicula, String Titulo, String Genero, String Sinopsis) {
        this.idPelicula = idPelicula;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Sinopsis = Sinopsis;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public String mostrarDatos(){
        return "Id Pelicula ---> "+this.getIdPelicula()+ "\n"+
                "Titulo -------> "+this.getTitulo()+ "\n"+
                "Genero -------> "+this.getGenero()+ "\n"+
                "Sinopsis -----> "+this.getSinopsis();
    }
    
}
