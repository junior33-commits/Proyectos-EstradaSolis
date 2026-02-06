/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author DELL
 */
public class ModeloCalculadora {
    private float valor1;
    private float valor2;

    public ModeloCalculadora() {
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    public float suma(){
        return this.getValor1() + this.getValor2();
    }
    public float resta(){
        return this.getValor1() - this.getValor2();
    }
    public float multiplicacion(){
        return this.getValor1() *  this.getValor2();
    }
    public float division(){
        return this.getValor1() / this.getValor2();
    }
}
