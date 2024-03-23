package Restaurant;

import java.util.List;

public interface OrderTracker {
    void addOrder(Order order);
    void completeOrder(Order order);
    List<Order> getActiveOrders();

}
