package strategy;

public class NetBanking implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing net banking payment of $" + amount);
    }
}
