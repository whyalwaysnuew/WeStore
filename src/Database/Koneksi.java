/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nuew
 */
public class Koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Database Loaded Successfully");
        }   catch (ClassNotFoundException ex){
            System.out.println ("Gagal Koneksi"+ex);
        }
        
        String url ="jdbc:mysql://localhost:3306/db_simabar";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Database Loaded Successfully");
        }   catch (SQLException ex){
            System.out.println("Failed to Load Database "+ex);
        }
        return koneksi;
    }
}
