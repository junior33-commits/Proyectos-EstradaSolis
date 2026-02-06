/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;
import MODELO.Convertidor;
import VISTA.VistaConvertidor;
import CONTROLADOR.ControladorConvertidor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author DELL
 */
public class ControladorConvertidor implements ActionListener{
    Convertidor c;
    VistaConvertidor vc;

    public ControladorConvertidor(Convertidor c, VistaConvertidor vc) {
        this.c = c;
        this.vc = vc;
    }
    public void iniciar(){
        vc.setTitle("Convertidor de Monedas");
        vc.setLocationRelativeTo(null);
        vc.btnpd.addActionListener(this);
        vc.btndp.addActionListener(this);
        vc.btnpy.addActionListener(this);
        vc.btnyp.addActionListener(this);
        vc.btnpl.addActionListener(this);
        vc.btnlp.addActionListener(this);
        vc.btnLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Limpiar")){
            vc.jTextField1.setText(null);
            vc.jLabel4.setText(null);
            vc.jLabel5.setText(null);
            vc.jLabel6.setText(null);
            vc.jLabel7.setText(null);
            vc.jLabel8.setText(null);
            vc.jLabel9.setText(null);
        }
        if(e.getActionCommand().equals("Pesos a Dolares")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel4.setText(String.valueOf(c.pesoDolar()));
        }
        if(e.getActionCommand().equals("Dolares a Pesos")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel5.setText(String.valueOf(c.dolarPeso()));
        }
        if(e.getActionCommand().equals("Pesos a Yenes")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel6.setText(String.valueOf(c.pesoYen()));
        }
        if(e.getActionCommand().equals("Yenes a Pesos")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel7.setText(String.valueOf(c.yenPeso()));
        }
        if(e.getActionCommand().equals("Pesos a Libras")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel8.setText(String.valueOf(c.pesoLibra()));
        }
        if(e.getActionCommand().equals("Libras a Pesos")){
            c.setCantidad(Double.parseDouble(vc.jTextField1.getText()));
            vc.jLabel9.setText(String.valueOf(c.libraPeso()));
        }
    }
    
}
