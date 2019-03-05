package strategy.pattern.payment;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type){

        switch (type) {
            case "credit":
                return createCreditCard();
            case "debit" :
                return createDebitCard();
            case "cash":
                return createCash();
        }
        throw new IllegalArgumentException("Unknown type");
    }

    public static CreditCard createCreditCard(){
        return new CreditCard("John doe", "41111111111", "123","01/22");
    }

    public static DebitCard createDebitCard(){
        return new DebitCard("John doe", "4333333333333", "123", "01/23");
    }

    public static Cash createCash(){
        return new Cash();
    }
}
