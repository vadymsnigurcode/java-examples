package com.example.demo.patterns.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingletonDerbyDb {
    private static volatile DbSingletonDerbyDb instance = null;
    private static volatile Connection conn = null;
    private DbSingletonDerbyDb () {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn != null) {
            throw new RuntimeException("Use getConnection() method to create");
        }
        if (instance !=null) {
            throw new RuntimeException("use getInstance() method to create");
        }

    }
    public static DbSingletonDerbyDb getInstance() {
        if (instance == null) {
            synchronized (DbSingletonDerbyDb.class) {
                if (instance == null) {
                    instance = new DbSingletonDerbyDb();
                }
            }
        }
        return instance;
    }
    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingletonDerbyDb.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        //String dbUrl = "jdbc:derby:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
