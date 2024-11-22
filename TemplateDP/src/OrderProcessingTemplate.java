public abstract class OrderProcessingTemplate {
    public void processOrder(){
        verifyOrder();
        assignDeliveryAgent();
        trackDelivery();
    }

    abstract void verifyOrder();

    abstract void assignDeliveryAgent();

    abstract void trackDelivery();
}
