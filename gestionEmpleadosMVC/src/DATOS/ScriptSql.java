/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATOS;
import MODELO.Empleado;

/**
 *
 * @author DELL
 */
public class ScriptSql {
    public static String insertarEmpleado(Empleado e){
        String sql = "INSERT INTO empleado VALUES(" +
                e.getIdEmpleado()+",'"+
                e.getNombre()+"','"+
                e.getApellido1()+"','"+
                e.getApellido2()+"','"+
                e.getPuesto()+"',"+
                e.getSueldo()+")";
        return sql;
    }
    public static String seleccionarTodos(){
        String sql = "SELECT * FROM empleado";
        return sql;
    }
    public static String actualizarEmpleado(int id,Empleado e){
        String sql = "UPDATE empleado set nombre='"+
                     e.getNombre()+"', apellido1='"+
                     e.getApellido1()+"', apellido2='"+
                     e.getApellido2()+"', puesto='"+
                     e.getPuesto()+"', sueldo="+
                     e.getSueldo()+ " WHERE idEmpleado="+id;
        return sql;
    }
    public static String eliminarEmpleado(int id){
        String sql = "DELETE FROM empleado WHERE idEmpleado="+id;
        return sql;
    }
    public static String buscarEmpleado(int id){
        String sql = "SELECT * FROM empleado WHERE idEmpleado="+id;
        return sql;
    }
}
