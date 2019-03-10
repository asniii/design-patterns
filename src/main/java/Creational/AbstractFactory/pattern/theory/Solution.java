package Creational.AbstractFactory.pattern.theory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class Solution {
    public static void main(String args[]) throws Exception{
        String xml = "<document><body><stock>APPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        System.out.println("root element : " + doc.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());


        /***
         * Abstract Factory example
         *
         */
        System.out.println("********************************************************************************************");
        System.out.println("********************************************************************************************");
        CreditCardFactory abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractCreditCardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(550);
        CreditCard card2 = abstractCreditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
