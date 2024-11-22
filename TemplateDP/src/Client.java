public class Client {
    public static void main(String[] args) {
        OrderProcessingTemplate localOrder  = new LocalOrderProcessor();
        OrderProcessingTemplate internationalOrder = new InternationalOrderProcessor();

        System.out.println("Processing a local order: ");
        localOrder.processOrder();
        System.out.println();

        System.out.println("Processing a international order: ");
        internationalOrder.processOrder();
    }
}
