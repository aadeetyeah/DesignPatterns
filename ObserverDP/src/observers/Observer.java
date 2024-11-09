package observers;

import subject.Order;

public interface Observer {
    void update(Order order);

}
