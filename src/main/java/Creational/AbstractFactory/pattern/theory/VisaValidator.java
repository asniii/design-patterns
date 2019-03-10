package Creational.AbstractFactory.pattern.theory;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
