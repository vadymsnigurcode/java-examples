package com.example.demo.patterns.AbstractFactory;

public class AmexGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
