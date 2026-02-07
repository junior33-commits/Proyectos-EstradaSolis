/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author DELL
 */
public class Persona {
    //--Propiedades
    private String Nombre;
    private int Edad;
    //--Constructor
    public Persona(String n, int e){
        this.Nombre = n;
        this.Edad = e;
    }
    public int mesesVividos(){
        return this.Edad * 12;
    }
    public int diasVividos(){
        return this.Edad * 365;
    }
    public int horasVividas(){
        return diasVividos() * 24;
    }
    public int minutosVividos(){
        return diasVividos() * 60;
    }
    public int segundosVividos(){
        return minutosVividos() * 60;
    }
    public String mostrarDatos(){
        return "Nombre: "+this.Nombre+"\n"+
                "Edad:  "+this.Edad+"\n"+
                "Meses Vividos: "+this.mesesVividos()+"\n"+
                "Dias vividos: "+this.diasVividos()+"\n"+
                "Horas vividas: "+this.horasVividas()+"\n"+
                "Minutos vividos: "+this.minutosVividos()+"\n"+
                "Segundos vividos: "+this.segundosVividos()+"\n";
    }
}
