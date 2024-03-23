package Restaurant;

public class Dish  implements MenuItems{
    private String name;
    private double price;
    private String description;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
