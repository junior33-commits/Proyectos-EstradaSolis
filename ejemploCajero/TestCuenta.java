/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo5;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TestCuenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        int nc;
        String t;
        double s;
        System.out.print("Numero de cuenta: ");
        nc = Integer.parseInt(entrada.nextLine());
        System.out.print("Titular: ");
        t = entrada.nextLine();
        System.out.print("Saldo: ");
        s = Double.parseDouble(entrada.nextLine());
        c1.setNCuenta(nc);
        c1.setTitular(t);
        c1.setSaldo(s);
        //--Mostrar datos inciales de la cuenta
        System.out.println("--------------");
        System.out.println(c1.MostraDatos());
        System.out.println("--------------");
        //--Deposito
        double cantidad;
        System.out.print("Cantidad a depositar: ");
        cantidad = Double.parseDouble(entrada.nextLine());
        System.out.println(c1.deposito(cantidad));
        System.out.println(c1.MostraDatos());
        //--Retiro
        double cantidad2;
        System.out.print("Cantidad a retirar: ");
        cantidad2 = Double.parseDouble(entrada.nextLine());
        System.out.println(c1.retiro(cantidad2));
        System.out.println(c1.MostraDatos());
    }
}
