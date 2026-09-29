package com.mycompany.yalung_program;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    public static Connection connect() {
        try {
            // Siguraduhing tama ang path at filename ng database mo
            String dbPath = "C:/Users/CL2-PC/Documents/Yalung_Database.accdb"; 
            
            String url = "jdbc:ucanaccess://" + dbPath;
            return DriverManager.getConnection(url);    
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
            return null;
        }
    }

    // Dagdag na main method para ma-test mo agad kung gagana
    public static void main(String[] args) {
        Connection conn = connect();
        if (conn != null) {
            System.out.println("SUCCESS: Connected to MS Access Database!");
        } else {
            System.out.println("FAILED: Could not connect to Database.");
        }
    }
}
