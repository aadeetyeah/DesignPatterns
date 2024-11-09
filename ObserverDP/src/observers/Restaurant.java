package observers;

import subject.Order;

public class Restaurant implements Observer {
    private String restaurantName;

    public Restaurant(String name){
        this.restaurantName = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("observers.Restaurant "+restaurantName+": Order #"+order.getStatus()+" is now "
        +order.getStatus());
    }
}
