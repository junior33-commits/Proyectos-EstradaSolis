/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
public class Profesor extends Persona{
    private int sueldo;
    public Profesor(String i, String n, int s){
        super(i, n);
        this.sueldo = s;
    }
    public void setSueldo(int s){
        this.sueldo = s;
    }
    public int getSueldo(){
        return this.sueldo;
    }
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+ "\n"+
                "Sueldo: " +this.getSueldo();
    }
}
