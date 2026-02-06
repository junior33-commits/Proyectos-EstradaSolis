/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;
import MODELO.ModeloCalculadora;
import VISTA.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author DELL
 */
public class ControladorCalculadora implements ActionListener{
    ModeloCalculadora mc;
    VistaCalculadora vc;

    public ControladorCalculadora(ModeloCalculadora mc, VistaCalculadora vc) {
        this.mc = mc;
        this.vc = vc;
    }
    public void iniciar(){
        vc.setTitle("Calculadora basica electronica");
        vc.setLocationRelativeTo(null);
        vc.btnmas.addActionListener(this);
        vc.btnlimpiar.addActionListener(this);
        vc.btnmenos.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Limpiar")){
        vc.jTextField1.setText(null);
        vc.jTextField2.setText(null);
        vc.jLabel5.setText(null);
        vc.jTextField1.requestFocus();
        }
    if(e.getActionCommand().equals("+")){
        mc.setValor1(Float.parseFloat(vc.jTextField1.getText()));
        mc.setValor2(Float.parseFloat(vc.jTextField2.getText()));
        vc.jLabel5.setText(String.valueOf(mc.suma()));
    }
    if(e.getActionCommand().equals("-")){
        mc.setValor1(Float.parseFloat(vc.jTextField1.getText()));
        mc.setValor2(Float.parseFloat(vc.jTextField2.getText()));
        vc.jLabel5.setText(String.valueOf(mc.resta()));
        }
    if(e.getActionCommand().equals("*")){
        mc.setValor1(Float.parseFloat(vc.jTextField1.getText()));
        mc.setValor2(Float.parseFloat(vc.jTextField2.getText()));
        vc.jLabel5.setText(String.valueOf(mc.multiplicacion()));
        }
    if(e.getActionCommand().equals("/")){
        mc.setValor1(Float.parseFloat(vc.jTextField1.getText()));
        mc.setValor2(Float.parseFloat(vc.jTextField2.getText()));
        vc.jLabel5.setText(String.valueOf(mc.division()));
        }
    }
}
