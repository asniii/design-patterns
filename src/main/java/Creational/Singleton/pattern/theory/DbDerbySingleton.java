package Creational.Singleton.pattern.theory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDerbySingleton {
    private static volatile DbDerbySingleton instance = null;
    private static volatile Connection conn = null;

    private DbDerbySingleton(){
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch( SQLException e){
            e.printStackTrace();
        }

        if(conn != null){
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbDerbySingleton getInstance(){
        if(instance == null){
            synchronized (DbDerbySingleton.class){
                if(instance == null){
                    instance = new DbDerbySingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if(conn == null){
            synchronized (DbDerbySingleton.class){
                if(conn == null){
                    try{
                        String url = "jdbc:derby:memory:code/java/webdb;create=true";
                        conn = DriverManager.getConnection(url);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
