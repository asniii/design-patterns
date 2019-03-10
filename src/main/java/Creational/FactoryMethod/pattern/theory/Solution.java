package Creational.FactoryMethod.pattern.theory;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Solution {
    public static void main(String args[]){

        /***
         * while creating the calendar we don't know what kind of calendar it is. ( gregorianCalendar)
         */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        /***
         *
         */
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
