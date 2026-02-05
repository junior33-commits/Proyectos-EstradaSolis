/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.calcdists.controller;
import org.utl.calcdists.model.Punto;

/**
 *
 * @author DELL
 */
public class CalculadoraDistancia {
    public double calcularDistanciaEuclidiana(Punto p, Punto q){
        double dist = Math.sqrt(Math.pow(p.getX() - q.getX(), 2) +
                      Math.pow(p.getY() - q.getY(), 2));
        return dist;
    }
    public double calcularDistanciaManhattan(Punto p, Punto q){
    double dist = Math.abs(p.getX() - q.getX()) +    
                  Math.abs(p.getY() - q.getY());     
    return dist;
}

}
