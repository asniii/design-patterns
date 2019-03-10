package Creational.Prototype.pattern.theory;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String args[]){

        /***
         * This is a example of shallow copy. While we will copy only the reference will be copied in case of parameters and Record.
         * This is dangerous.
         */
        String sql = "select * from movies where title=?";
        List<String> parameters = new ArrayList<>();
        parameters.add("star wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql,parameters,record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /***
         * Using the structural design pattern
         */
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());
        System.out.println("******");
        Movie anotherMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("Gangs of four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

    }
}
