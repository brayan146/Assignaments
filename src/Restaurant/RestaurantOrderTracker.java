package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrderTracker implements OrderTracker{
    private List<Order> activeOrders;

    public RestaurantOrderTracker() {
        this.activeOrders = new ArrayList<>();
    }

    @Override
    public void addOrder(Order order) {
        activeOrders.add(order);
    }

    @Override
    public void completeOrder(Order order) {
        activeOrders.remove(order);
    }

    @Override
    public List<Order> getActiveOrders() {
        return activeOrders;
    }

}
