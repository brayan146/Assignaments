package Restaurant;

import java.util.List;

public class Restaurant {
    private Menu menu;
    private List<Table> tables;
    private OrderTracker orderTracker;

    public Restaurant(Menu menu) {
        this.menu = menu;
    }
    public void updateMenu(MenuItems item, boolean add) {
        if (add) {
            menu.addItem(item);
        } else {
            menu.removeItem(item);
        }
    }

    public Order takeOrder() {
        return new RestaurantOrder();
    }

    public Order takeOrder(Table table) {
        return new RestaurantOrder();
    }

    public void assingTable(int TableNumber, Order order) {
        for (Table table : tables) {
            if (table.getNumber() == TableNumber) {
                table.setOrder(order);
                table.setStatus("occupied");
                break;
            }
        }
    }

    public OrderTracker getOrderTracker() {
        return orderTracker;
    }

}
