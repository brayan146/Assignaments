package Restaurant;

import java.util.List;

public interface Invoice {
    double getTotalCost();
    List<OrderItems> getItems();
}
