package processors;

import factory.PaymentFactory;
import interfaces.PaymentStrategy;
import paymentMethods.BoletoPayment;
import paymentMethods.CreditCardPayment;
import paymentMethods.PixPayment;

import java.util.Map;

public class PaymentProcessor {

    public PaymentProcessor() {}

    public void processPayment(int option, double value) {
        PaymentStrategy strategy = PaymentFactory.createPaymentMethod(option);
        strategy.processPayment(value);
    }

}
