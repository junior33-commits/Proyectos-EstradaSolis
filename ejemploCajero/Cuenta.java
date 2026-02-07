/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo5;

/**
 *
 * @author DELL
 */
public class Cuenta {
    //--Atributos o propiedades
    private int NCuenta;
    private String Titular; 
    private double Saldo;
    //--Constructor
    public Cuenta(){
        
    }
    public Cuenta(int nc, String t, double s){
        this.NCuenta = nc;
        this.Saldo = s;
        this.Titular = t;
        if(s < 0){
            this.Saldo = 0;
        }
        else{
            this.Saldo = s;
        }
    }
     //--Encapsulación
     public void setNCuenta(int nc){
            this.NCuenta = nc;
        }
     public int getNCuenta(){
         return this.NCuenta;
     }
     public void setTitular(String t){
         this.Titular = t;
     }
     public String getTitular(){
         return this.Titular;
     }
     public void setSaldo(double s){
         if(s < 0){
             this.Saldo = 0;
         }
         else{
             this.Saldo = s;
         }
     }
     public double getSaldo(){
         return this.Saldo;
     }
     //--Metodos especiales
     public String deposito(double c){
         String res = null;
         if(c < 0){
             
         }
         else{
             this.Saldo += c;
             res = "Transacción exitosa...!";
         }
         return res;
     }
     public String retiro(double c){
         String res = null;
         if( c > this.Saldo){
             res = "Fondos insuficientes";
         }
         else{
             this.Saldo -= c;
             res = "Retiro exitoso...!";
         }
         return res;
     }
     public String MostraDatos(){
         return "Numero de cuenta: "+this.getNCuenta()+"\n"+
                 "Titular        :"+this.getTitular()+"\n"+
                 "SALDO          :"+this.getSaldo();
     }
}