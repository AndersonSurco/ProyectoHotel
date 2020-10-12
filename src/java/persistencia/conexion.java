/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ander
 */
public class conexion {
    public Connection getConexion(){
        Connection cn;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/ProyectoHotel","root","root");
            
            
        }catch(Exception e){
            cn = null;
            
        }
        return cn;
    }
}
