public class InternationalOrderProcessor extends OrderProcessingTemplate{


    @Override
    void verifyOrder() {
        System.out.println("Verifying International order....");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("Assigning an international delivery agent....");
    }

    @Override
    void trackDelivery() {
        System.out.println("Tracking international delivery.....");
    }
}
