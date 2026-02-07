/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author DELL
 */
public class Alumno {
    //--propiedades
    private String Nombre;
    private int Edad;
    //--Metodos
    public Alumno(String n, int e){
        this.Nombre = n;
        this.Edad = e;
    }
    public Alumno(String n){
        this.Nombre = n;
    }
    //--Metodos
    public String mayorEdad(){
        String res;
        if(this.Edad >= 18){
            res = "Felicidades, eres una persona madura :D!!";
        }
        else{
            res = "Camarita, ya debes madurar !!!...";
        }
        return res;
    }
    public String mayorEdad2(int x){
        String res;
        if(x >= 18){
            res = "Felicidades, eres una persona madura :D!!";
        }
        else{
            res = "Camarita, ya debes madurar !!!...";
        }
        return res;
    }
    public String mostrarDatos(){
        return "Nombre-----> "+this.Nombre+"\n"+
                "Edad------> "+this.Edad+"\n"+
                "Conclusión-> "+this.mayorEdad();
    }
    public String mostrarNombre(){
        return "Nombre-----> "+this.Nombre;
    }
}
