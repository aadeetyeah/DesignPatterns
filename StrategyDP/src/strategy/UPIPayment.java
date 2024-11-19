package strategy;

public class UPIPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
