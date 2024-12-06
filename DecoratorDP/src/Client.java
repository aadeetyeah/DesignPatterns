public class Client {
    public static void main(String[] args) {
        FoodItem pizzaOrder = new Pizza();

        pizzaOrder = new CheeseDecorator(pizzaOrder,100);
        pizzaOrder = new ExtraToppingsDecorator(pizzaOrder, 250);

        System.out.println("Pizza Description: "+pizzaOrder.getDescription());
        System.out.println("MRP of Pizza: "+pizzaOrder.getPrice());
    }
}
