/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;
import MODELO.Empleado;
import VISTA.RegistroEmpleados;
import DATOS.ConexionMySQL;
import DATOS.ScriptSql;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class ControladorEmpleado implements ActionListener{
    Empleado emp;
    RegistroEmpleados re;
    ConexionMySQL mic;
    Statement t;
    public ControladorEmpleado(Empleado emp, RegistroEmpleados re) throws SQLException {
        this.emp = emp;
        this.re = re;
        mic = new ConexionMySQL("empresa");
        mic.conectar();
    }
    public void inicio(){
        re.setTitle("REGISTRO DE EMPLEADOS");
        re.setLocationRelativeTo(null);
        re.btnlimpiar.addActionListener(this);
        re.btninsertar.addActionListener(this);
        re.btneliminar.addActionListener(this);
        re.btnactualizar.addActionListener(this);
        re.btnbuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("LIMPIAR")){
            re.jTextField1.setText(null);
            re.jTextField2.setText(null);
            re.jTextField3.setText(null);
            re.jTextField3.setText(null);
            re.jTextField4.setText(null);
            re.jTextField5.setText(null);
            re.jTextField6.setText(null);
            re.jTextField1.requestFocus();
        }
        if(e.getActionCommand().equals("INSERTAR")){
            try {
                t = null;
                emp.setIdEmpleado(Integer.parseInt(re.jTextField1.getText()));
                emp.setNombre(re.jTextField2.getText());
                emp.setApellido1(re.jTextField3.getText());
                emp.setApellido2(re.jTextField4.getText());
                emp.setPuesto(re.jTextField5.getText());
                emp.setSueldo(Integer.parseInt(re.jTextField6.getText()));
                t = mic.getConexion().createStatement();
                String sql = ScriptSql.insertarEmpleado(emp);
                t.executeUpdate(sql);
            } 
            catch (SQLException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getActionCommand().equals("ACTUALIZAR")){
            try {
                int id = Integer.parseInt(re.jTextField1.getText());
                emp.setIdEmpleado(id);
                emp.setNombre(re.jTextField2.getText());
                emp.setApellido1(re.jTextField3.getText());
                emp.setApellido2(re.jTextField4.getText());
                emp.setPuesto(re.jTextField5.getText());
                emp.setSueldo(Integer.parseInt(re.jTextField6.getText()));
                t = mic.getConexion().createStatement();
                String sql = ScriptSql.actualizarEmpleado(id, emp);
                t.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getActionCommand().equals("ELIMINAR")){
            try {
                int id = Integer.parseInt(re.jTextField1.getText());
                t = mic.getConexion().createStatement();
                String sql = ScriptSql.eliminarEmpleado(id);
                t.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getActionCommand().equals("BUSCAR")){
            try {
                int id = Integer.parseInt(re.jTextField1.getText());
                t = mic.getConexion().createStatement();
                String sql = ScriptSql.buscarEmpleado(id);
                ResultSet rs = t.executeQuery(sql);
                if(rs.next()){
                    re.jTextField2.setText(rs.getString("nombre"));
                    re.jTextField3.setText(rs.getString("apellido1"));
                    re.jTextField4.setText(rs.getString("apellido2"));
                    re.jTextField5.setText(rs.getString("puesto"));
                    re.jTextField6.setText(String.valueOf(rs.getInt("sueldo")));
                }
                else{
                    System.out.println("Empleado no encontrado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
