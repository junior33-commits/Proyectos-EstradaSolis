/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo14;

import java.io.IOException;

/**
 *
 * @author fox
 */
public class TestCB {
    public static void main(String[] args) throws IOException {
        CodigoBarras cb=new CodigoBarras();
        cb.crea128("9821008");
    }
}
