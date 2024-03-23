package Restaurant;

import java.util.List;

public interface Order {
    void addItem(OrderItems item);
    void removeItem(OrderItems item);
    List<OrderItems> getItems();
}
