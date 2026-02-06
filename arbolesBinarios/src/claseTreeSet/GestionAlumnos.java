/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseTreeSet;
import java.util.*;
/**
 *
 * @author DELL
 */
public class GestionAlumnos {
    private TreeSet<String> nombreAlumno;

    public GestionAlumnos() {
        this.nombreAlumno = new TreeSet<>();
    }
    //Metodo Agregar
    public boolean agregarAlumno(String nombre){
        return nombreAlumno.add(nombre);
    }
    //Metodo Eliminar
    public boolean eliminarAlumno(String nombre){
        return nombreAlumno.remove(nombre);
    }
    //Metodo Buscar 
    public boolean buscarAlumno(String nombre){
        return nombreAlumno.contains(nombre);
    }
    //Metodo Obtener Lista 
    public String obtenerLista(){
        if(nombreAlumno.isEmpty()){
            return "Sin datos";
        }
        StringBuilder sb = new StringBuilder("Lista de Estudiantes en Orden"
                + "Alfabetico");
        int i = 1;
        for(String nombre : nombreAlumno){
            sb.append(i++).append(". ").append(nombre).append("\n");
        }
        return sb.toString();
    }
    
}
