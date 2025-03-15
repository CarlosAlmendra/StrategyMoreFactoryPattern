import processors.PaymentProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.print("Select payment method:\n1- PIX\n2- CREDIT CARD\n3- BOLETO\nR: ");
        int option = sc.nextInt();

        System.out.print("\nEnter the transaction amount: R$ ");
        double value = sc.nextDouble();

        paymentProcessor.processPayment(option, value);
        sc.close();
    }
}