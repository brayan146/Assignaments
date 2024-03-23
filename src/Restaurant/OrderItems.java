package Restaurant;

public class OrderItems {
    private MenuItems item;
    private String specialRequest;

    public  OrderItems(MenuItems item, String specialRequest) {
        this.item = item;
        this.specialRequest = specialRequest;
    }
    public MenuItems getItem() {
        return item;
    }
    public String getSpecialRequest() {
        return specialRequest;
    }
}
