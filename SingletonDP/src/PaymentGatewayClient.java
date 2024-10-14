public class PaymentGatewayClient {
    public static void main(String[] args) {
        PaymentGatewayManager paymentGatewayManager = PaymentGatewayManager.getInstance();

        paymentGatewayManager.processPayment(100.0);

        //Tryna create another instance
        PaymentGatewayManager paymentGatewayManager1 = PaymentGatewayManager.getInstance();

        if(paymentGatewayManager1 == paymentGatewayManager){
            System.out.println("Both instances are the same. Singleton DP is working.");
        }else {
            System.out.println("Singleton DP is NOT working!!!");
        }
    }
}
