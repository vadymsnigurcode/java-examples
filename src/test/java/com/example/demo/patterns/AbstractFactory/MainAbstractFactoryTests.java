package com.example.demo.patterns.AbstractFactory;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;

public class MainAbstractFactoryTests {
    @Test
    public void testAbstractFactory() throws Exception {
        String xml="<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();

        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();
        System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());


    }

    @Test
    public void testCreditCardAbstractFactory() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
    }
}
