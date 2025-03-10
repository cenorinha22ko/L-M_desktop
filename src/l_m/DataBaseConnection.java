/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l_m;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro53722376
 */
public class DataBaseConnection {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
      private static final String URL = "jdbc:mysql://localhost:3306/projetolm_desktop";
      private static final String USER = "pedro";
      private static final String PASS = "123";
   
   
    public static Connection conexaoBanco() throws SQLException {
       
       
        try {
            Class.forName(DRIVER);
            Component parentComponent = null;
           
            return DriverManager.getConnection(URL,USER, PASS);
           
        } catch (ClassNotFoundException ex) {
            Component parentComponent = null;  
            throw new RuntimeException("Erro no banco de dados",ex);
       
        } 
    }

}
