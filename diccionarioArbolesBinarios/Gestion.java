/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad20;
import java.util.*;

/**
 *


 * @author DELL
 */
public class Gestion {
    private Map<String, String> diccionario;

    public Gestion() {
        diccionario = new HashMap<>();
    }
    
    public boolean agregar(String clave, String valor){
        if(!diccionario.containsKey(clave)){
            diccionario.put(clave, valor);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean buscar(String clave){
        return diccionario.containsKey(clave);
    }
    
    public boolean eliminar(String clave, String valor){
        if(diccionario.containsKey(clave)){
           diccionario.remove(clave);
           return true;
        }
        else{
            return false;
        }
    }
    
    public boolean modificar(String clave, String nuevoValor){
        if(diccionario.containsKey(clave)){
            diccionario.put(clave, nuevoValor);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String mostrarTodo(){
        if(diccionario.isEmpty()){
            return "Diccionario sin datos";
        }
        else{
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : diccionario.entrySet()) {
                sb.append("Clave").append(entry.getKey())
                        .append(" | Valor: ").append(entry.getValue())
                        .append("\n");
            }
            return sb.toString();
        }
    }
}
