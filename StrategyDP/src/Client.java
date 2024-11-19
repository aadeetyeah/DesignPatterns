import strategy.CreditCardPayment;
import strategy.PaymentStrategy;
import strategy.UPIPayment;

public class Client {

    public static void main(String args[]){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentStrategy paymentStrategy1 = new CreditCardPayment();

        paymentProcessor.setPaymentStrategy(paymentStrategy1);
        paymentProcessor.processPayment(100);

        PaymentStrategy paymentStrategy2 = new UPIPayment();
        paymentProcessor.setPaymentStrategy(paymentStrategy2);
        paymentProcessor.processPayment(500);
    }
}
