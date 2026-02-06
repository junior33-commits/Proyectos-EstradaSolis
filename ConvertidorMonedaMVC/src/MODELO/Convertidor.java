/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author DELL
 */
public class Convertidor {
    private double cantidad;

    public Convertidor() {
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double pesoDolar(){
        return this.getCantidad() / 18.62;
    } 
    public double dolarPeso(){
        return this.getCantidad() * 18.62;
    }
    public double pesoYen(){
        return this.getCantidad() * 7.85;
    }
    public double yenPeso(){
        return this.getCantidad() * 0.127;
    }
    public double pesoLibra(){
        return this.getCantidad() * (1/25.28);
    }
    public double libraPeso(){
        return this.getCantidad() * 25.28;
    }
}
