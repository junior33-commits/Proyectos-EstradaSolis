/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRINCIPAL;
import MODELO.Empleado;
import VISTA.RegistroEmpleados;
import CONTROLADOR.ControladorEmpleado;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        Empleado emp = new Empleado();
        RegistroEmpleados re = new RegistroEmpleados();
        ControladorEmpleado ce = new ControladorEmpleado(emp, re);
        ce.inicio();
        re.setVisible(true);
    }
}
