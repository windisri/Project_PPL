/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class config {
     private static Connection mysqlconfig;
    public static Connection ConfigDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/akun";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=(Connection) DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.err.println("koneksi gagal"+e.getMessage());
        }return mysqlconfig;
    }
}

