/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRINCIPAL;
import MODELO.ModeloCalculadora;
import VISTA.VistaCalculadora;
import CONTROLADOR.ControladorCalculadora;
/**
 *
 * @author DELL
 */
public class PrincipalCalculadora {
    public static void main(String[] args) {
        ModeloCalculadora mc = new ModeloCalculadora();
        VistaCalculadora vc = new VistaCalculadora();
        ControladorCalculadora cc = new ControladorCalculadora(mc, vc);
        cc.iniciar();
        vc.setVisible(true);
    }
}
