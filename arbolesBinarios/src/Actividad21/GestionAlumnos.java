/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad21;
import java.util.*;

/**
 *
 * @author DELL
 */
public class GestionAlumnos {
    private Map<String, Double> gestionAlumno;

    public GestionAlumnos() {
        gestionAlumno = new HashMap<>();
    }
    
    public boolean agregar(String mat, double cal){
        if(!gestionAlumno.containsKey(mat)){
            gestionAlumno.put(mat, cal);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean buscar(String clave){
        return gestionAlumno.containsKey(clave);
    }
    
    public boolean eliminar(String mat){
        if(gestionAlumno.containsKey(mat)){
           gestionAlumno.remove(mat);
           return true;
        }
        else{
            return false;
        }
    }
    
    public boolean modificar(String mat, double nuevaCal){
        if(gestionAlumno.containsKey(mat)){
            gestionAlumno.put(mat, nuevaCal);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String mostrarTodo(){
        if(gestionAlumno.isEmpty()){
            return "Diccionario sin datos";
        }
        else{
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Double> entry : gestionAlumno.entrySet()) {
                sb.append("Matricula: ").append(entry.getKey())
                        .append(" | Calificación: ").append(entry.getValue())
                        .append("\n");
            }
            return sb.toString();
        }
    }
}

