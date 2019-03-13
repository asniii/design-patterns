package Structural.Adapter.pattern.theory;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String args[]){

        /***
         *
         * The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets
         * classes work together that couldn’t otherwise because of incompatible interfaces.
         *
         *
         * Concepts:
         *  -- plug adaptor
         *  -- convert interface to another interface
         *  -- used mostly legacy
         *  -- translates request
         *
         * Examples : Arrays -- to -- Lists
         * :streams
         *
         * Design:
         * -- client centric
         * -- integrate new with old
         * -- interface, but not required
         * -- Adaptee can be the implementation
         */
        Integer[] arrayOfInts = new Integer[]{42,43,44};
        List<Integer> integerList = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(integerList);
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /**
         * demo
         */
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /**
         * Considering EmployeeLdap as legacy code. This will not work
         *
         */
        //Employee employeeFromLdap = new EmployeeLdap("chwie","Solo","han","han@solo.com");

        /**
         * So we will use a adapter to do that.
         */
        EmployeeLdap employeeLdap = new EmployeeLdap("chewie","solo","han","han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        System.out.println(employees);
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /**
         * another example
         */
        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,holmes,sherlock@holmes.com");
        //employees.add(new EmployeeAdapterCSV(employeeCSV));
        employees.add(new EmployeeAdapterCSV(employeeCSV));
        System.out.println(employees);



    }
}
