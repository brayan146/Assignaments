package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder implements Order{
    private List<OrderItems> items;
    public  RestaurantOrder() {
        this.items = new ArrayList<>();
    }
    @Override
    public void addItem(OrderItems item) {
        items.add(item);
    }
    @Override
    public void removeItem(OrderItems item) {
        items.remove(item);
    }
    @Override
    public List<OrderItems> getItems() {
        return items;
    }

}
