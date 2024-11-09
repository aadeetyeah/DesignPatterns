import observers.CallCenter;
import observers.Customer;
import observers.DeliveryPartner;
import observers.Restaurant;
import subject.Order;

public class OrderStatus {
    public static void main(String[] args){
        //Place an order
        Order order = new Order(123);

        //Create the observers who will observe/track the order
        //Basically who will deal with the order.
        Customer customer1 = new Customer("Aditya");
        Restaurant restaurant = new Restaurant("Louis Burger");
        DeliveryPartner deliveryPartner = new DeliveryPartner("Swiggy");
        CallCenter callCenter = new CallCenter();

        //Attach the observers to the order
        order.attach(customer1);
        order.attach(restaurant);
        order.attach(deliveryPartner);
        order.attach(callCenter);
        order.notifyObservers();
        System.out.println("-----------------------------------------------------");

        //Notify the observers
        order.setStatus("Out for delivery");
        System.out.println("-----------------------------------------------------");

        //Detach an observer(if needed)
        order.dettach(callCenter);
        System.out.println("-----------------------------------------------------");

        //Notify the observers
        order.setStatus("Delivered");
    }
}
