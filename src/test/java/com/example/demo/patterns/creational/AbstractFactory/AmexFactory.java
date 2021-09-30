package com.example.demo.patterns.creational.AbstractFactory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                break;
        }
        return null;
    }
}
