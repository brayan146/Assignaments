package Restaurant;

import java.util.List;

public class RestaurantInvoice implements Invoice{
    private Order order;

    public RestaurantInvoice(Order order) {
        this.order = order;
    }

    @Override
    public double getTotalCost() {
        double totalCost = 0;
        for(OrderItems item : order.getItems()) {
            totalCost += item.getItem().getPrice();
        }
        return totalCost;
    }

    @Override
    public List<OrderItems> getItems() {
        return order.getItems();
    }
}
