/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo13;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class MiConexion {
    public static void main(String[] args) throws SQLException {
        //Clases para la conexión a MySQL
        Connection c;
        Statement t;
        ResultSet r;
        //JDBC
        String bd = "pruebasql";
        String u = "root";
        String p = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/"+bd;
        c = DriverManager.getConnection(url, u, p);
        t = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "Select * from alumno";
        r = t.executeQuery(sql);
        System.out.println("Conexión todo un exito......");
        r.beforeFirst();
        while(r.next()){
            System.out.println(r.getString(1)+ " "+ r.getString(2)+ " "+r.getString(3)+ " "+r.getString(4)+ " "+r.getString(5));
        }
    }
}