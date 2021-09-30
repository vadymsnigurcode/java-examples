package com.example.demo.patterns.creational.AbstractFactory;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
