package Structural.Bridge.pattern.theory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Solution {

    public static void main(String args[]){

        /**
         * Concepts
         * -- Decouple abstraction and implementation
         *
         * example :
         *  == drivers (jdbc driver)
         *
         * design:
         * -- Interface and abstract classes
         * -- Composition over inheritance
         * --
         */
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement sta = conn.createStatement();
            sta.executeUpdate("CREATE TABLE Address (ID INT,StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("table created");
        } catch (SQLException e){
            e.printStackTrace();
        }

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        /**
         *
         */
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        circle.applyColor();
        square.applyColor();

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();

    }
}
