package observers;

import subject.Order;

public class DeliveryPartner implements Observer{
    private String partnerName;

    public DeliveryPartner(String partnerName){
        this.partnerName = partnerName;
    }

    @Override
    public void update(Order order){
        System.out.println("Delivery partner "+partnerName +": Order #" + order.getId() + " is now "
        + order.getStatus());
    }
}
