package Creational.Builder.pattern.theory;

public class Solution {
    public static void main(String args[]) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is an example ");
        stringBuilder.append("of the builder pattern. ");
        stringBuilder.append("It has method to append ");
        stringBuilder.append("almost anything we want to be a string. ");
        stringBuilder.append(42);
        System.out.println(stringBuilder.toString());


        /***
         * Problems with below code
         *  - not immutable
         *  - it doesn't have a contract which define what is a proper lunch order. Means what are the must have things in a order.
         */
        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        System.out.println("************** Normal getter setter method *************************************************");
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");

        /***
         * Telescoping constructor
         *  This is immutable class - LunchOrderTele
         *  It is immutable because there is no setter method.
         *  But there can be other constructor too that can be required.
         *  Basically there can the constructor brust. ( Too many constructor)
         */
        System.out.println("************** Telescoping *****************************************************************");
        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());


        /***
         * Builder pattern
         * This gives immutable objects.
         * The good point is we don't need to have all the things for the lunch order. Which are there is fine. We can build from it.
         */
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        System.out.println("*************** Builder pattern ************************************************************");
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").codiments("Lettuce").dressing("Moyo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());


    }
}
