/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;

/**
 *
 * @author DELL
 */
/*public class Nodo {
    int dato; //Almacena el Nodo
    Nodo izquierdo; //Referencia al hijo izquierdo
    Nodo derecho; //Referencia al hijo derecho
    Nodo nuevo;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null; //Al crearse, no tendrían datos
        this.derecho = null;
        this.nuevo = null;
    }
    
}*/
public class Nodo{
    String palabra;
    String significado;
    Nodo izquierdo;
    Nodo derecho;
    public Nodo(String palabra, String significado){
        this.palabra = palabra;
        this.significado = significado;
        this.izquierdo = null;
        this.derecho = null;
    }
}
