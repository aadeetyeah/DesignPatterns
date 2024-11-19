import strategy.PaymentStrategy;

//Context class
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(){
        paymentStrategy = null;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        if(paymentStrategy!=null){
            this.paymentStrategy = null;
        }
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }

    @Override
    public void finalize(){
        if(paymentStrategy!=null){
            paymentStrategy = null;
        }
    }
}
