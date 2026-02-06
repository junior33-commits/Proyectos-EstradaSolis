/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRINCIPAL;
import MODELO.Convertidor;
import VISTA.VistaConvertidor;
import CONTROLADOR.ControladorConvertidor;
/**
 *
 * @author DELL
 */
public class PrincipalConvertidor {
    public static void main(String[] args) {
        Convertidor c = new Convertidor();
        VistaConvertidor vc = new VistaConvertidor();
        ControladorConvertidor cc = new ControladorConvertidor(c, vc);
        cc.iniciar();
        vc.setVisible(true);
    }
    
}
