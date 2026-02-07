/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo15;

/**
 *
 * @author DELL
 */
public class Conferencia {
    private int Id;
    private String Titulo;
    private String Fecha;
    private String Hora;
    private String Ubiciacion;
    private int idConferencista;

    public Conferencia() {
    }

    public Conferencia(int Id, String Titulo, String Fecha, String Hora, String Ubiciacion, int idConferencista) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Ubiciacion = Ubiciacion;
        this.idConferencista = idConferencista;
    }

    public int getIdConferencista() {
        return idConferencista;
    }

    public void setIdConferencista(int idConferencista) {
        this.idConferencista = idConferencista;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getUbiciacion() {
        return Ubiciacion;
    }

    public void setUbiciacion(String Ubiciacion) {
        this.Ubiciacion = Ubiciacion;
    }
    
}
