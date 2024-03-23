package Restaurant;

public class Main {
     public static void main(String[] args) {

        RestaurantMenu menu = new RestaurantMenu();
        menu.addItem(new Dish("Pizza", 10.0));
        menu.addItem(new Dish("Pasta", 8.0));
        menu.addItem(new Dish("Burger", 5.0));
        menu.addItem(new Dish("Salad", 6.0));
        menu.addItem(new Dish("Fries", 3.0));
        OrderItems orderItem = new OrderItems(new Dish("Pizza", 10.0), "Extra cheese");
        OrderItems orderItem2 = new OrderItems(new Dish("Pasta", 8.0), "Extra sauce");
        OrderItems orderItem3 = new OrderItems(new Dish("Burger", 5.0), "No onions");
OrderItems orderItem4 = new OrderItems(new Dish("Salad", 6.0), "No dressing");
        OrderItems orderItem5 = new OrderItems(new Dish("Fries", 3.0), "Extra salt");
        RestaurantOrder order = new RestaurantOrder();
        order.addItem(orderItem);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);
        System.out.println("Order total: " + order.getItems().stream().mapToDouble(item -> item.getItem().getPrice()).sum());
    }
}
