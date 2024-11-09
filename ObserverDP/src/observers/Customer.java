package observers;


import subject.Order;

public class Customer implements Observer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hello, "+name+"! Order #"+order.getStatus());
    }
}
