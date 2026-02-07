/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
public class Alumno extends Persona {
    private int Edad; 
    public Alumno(String i, String n, int e){
        super(i, n);
        this.Edad = e;
    }
    public void setEdad(int e){
        this.Edad = e;
    }
    public int getEdad(){
        return this.Edad;
    }
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+ "\n"+
                "Edad: " +this.getEdad();
    }
}
