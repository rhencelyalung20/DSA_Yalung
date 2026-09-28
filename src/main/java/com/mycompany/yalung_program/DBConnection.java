package com.mycompany.yalung_program;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class DBConnection {
    public static Connection connect() {
        try {
            String dbPath = "C:/Users/Student/Documents/StudentDB.accdb"; 
            
            String url = "jdbc:ucanaccess://" + dbPath;
            return DriverManager.getConnection(url);    
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
            return null;
        }
    }
}
