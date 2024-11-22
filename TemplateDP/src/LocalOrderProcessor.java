public class LocalOrderProcessor extends OrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Verifying local order.....");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("Assigning a local delivery agent....");
    }

    @Override
    void trackDelivery() {
        System.out.println("Tracking local delivery....");
    }
}
