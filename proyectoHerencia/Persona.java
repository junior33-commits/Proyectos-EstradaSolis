/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
public class Persona {
    private String Id;
    private String Nombre;
    public Persona(){
        
    }
    public Persona(String i, String n){
        this.Nombre = n;
        this.Id = i;
    }
    public void setId(String i){
        this.Id = i;
    }
    public String getId(){
        return this.Id;
    }
    public void setNombre(String n){
        this.Nombre = n;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String mostrarDatos(){
        return "Id Persona: " +this.getId()+ "\n"+
                "Nombre   :" +this.getNombre();
    }
}