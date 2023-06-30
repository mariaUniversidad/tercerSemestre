/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Maluli
 */
public class ConexionDB {

    public Connection obtenerConexion() {
        Connection conn = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/ProyectoIntegrador", "MALU", ""); //ysql
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://127.0.0.1\\dbo:1433;DatabaseName=proyectoIntegrador;encrypt=false;trustServerCertificate=false";
            String user = "sa";
            String pass = "sa";
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("conectado!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("error en la conexion a base de datos" + e);
        }
        return conn;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
