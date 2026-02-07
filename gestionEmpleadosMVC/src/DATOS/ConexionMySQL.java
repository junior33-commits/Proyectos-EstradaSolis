/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fox
 */
public class ConexionMySQL {
    String usuario;
    String password;
    String ruta;
    String bd;
    Connection c;

    public ConexionMySQL(String bd) {
        this.bd=bd;
        this.usuario="root";
        this.password="root";
        this.ruta="jdbc:mysql://127.0.0.1:3306/"+bd;
    }
    public void conectar() throws SQLException{
        c=DriverManager.getConnection(ruta, usuario, password);
    }
    public Connection getConexion(){
        return c;
    }
    public void desconectar() throws SQLException{
        c.close();
    }
}
