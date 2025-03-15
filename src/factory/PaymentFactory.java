package factory;

import interfaces.PaymentStrategy;
import paymentMethods.BoletoPayment;
import paymentMethods.CreditCardPayment;
import paymentMethods.PixPayment;

public class PaymentFactory {

    public static PaymentStrategy createPaymentMethod(int option) {
        switch (option) {
            case 1:
                return new PixPayment();
            case 2:
                return new CreditCardPayment();
            case 3:
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Invalid payment method selected.");
        }
    }
}
