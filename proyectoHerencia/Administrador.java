/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9_herencia;

/**
 *
 * @author DELL
 */
public class Administrador extends Persona {
    private String Departamento;
    public Administrador(String i, String n, String d){
        super(i, n);
        this.Departamento = d;
    }
    public void setAdministrador(String d){
        this.Departamento = d;
    }
    public String getAdministrador(){
        return this.Departamento;
    }
        @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+ "\n"+
                "Administrador: " +this.getAdministrador();
    }
}
