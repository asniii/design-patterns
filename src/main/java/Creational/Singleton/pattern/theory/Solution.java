package Creational.Singleton.pattern.theory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Solution {

    public static void main(String args[]){

        /***
         * Concepts:
         *  - Only one instance created
         *  - Guarantees control of a resource
         *  - Lazily loaded
         *  - Example : Runtime, Logger, Spring Beans, graphic managers
         *
         *
         *
         * Design:
         *  - Class is responsible for lifecycle
         *  - static in nature
         *  - Private instance
         *  - Private Constructor
         *  - No parameters required for construction
         */


        Runtime singletonRunTime = Runtime.getRuntime();
        singletonRunTime.gc();
        System.out.println(singletonRunTime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if(singletonRunTime == anotherInstance){
            System.out.println("They are the same instance");
        }
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");


        /***
         * static singleton
         */
        System.out.println("********************** Static Singleton ****************************************************");
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance1 = DbSingleton.getInstance();
        if(instance == instance1){
            System.out.println("yes they are same");
        }

        //creating a new object creation will throw error
        //DbSingleton dbSingleton = new DbSingleton();

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");


        /**
         * Lazy loaded instance
         *
         * At the starting of the app if all the instance are not initialized then it would be faster.
         */
        System.out.println("********************** Lazy Loading ********************************************************");

        DbSingleton1 dbSingleton1 = DbSingleton1.getInstance();
        System.out.println(dbSingleton1);

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");


        /**
         * Thread safe
         */
        System.out.println("********************** Thread safe *********************************************************");

        DbSingleton2 dbSingleton2 = DbSingleton2.getInstance();
        System.out.println(dbSingleton2);

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");



        /**
         * Demo application
         *
         * Let us record how much time it will take for the first creation and second creation
         */
        System.out.println("********************** Derby connection instance creation **********************************");

        DbDerbySingleton dbDerbySingleton = DbDerbySingleton.getInstance();

        Long startTime = System.currentTimeMillis();
        Connection connection = dbDerbySingleton.getConnection();
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken first time" + (endTime - startTime));

        Statement statement;
        try{
            statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address (ID int, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        Long startTime1 = System.currentTimeMillis();
        Connection connection1 = dbDerbySingleton.getConnection();
        Long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for the second time" + (endTime1 - startTime1));

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /***
         * Pitfalls
         * - Often overused
         * - Difficult to unit test
         * - If not careful, not thread-safe
         * - Sometimes confused for factory
         * - java.utilCalender is NOT a singleton ( it is prototype)
         */

        /***
         * Difference betwen Singleton and Factory
         *
         * Singleton
         *  - Return same instance
         *  - one contructor method - no args
         *  - No interface
         *
         * Factory
         *  - Returns various instances
         *  - Multiple constructor
         *  - Interface driven
         *  - Adaptable to environment more easily
         */
    }
}
