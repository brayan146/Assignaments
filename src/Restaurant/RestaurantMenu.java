package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu  implements Menu{
    private List<MenuItems> items;

    public RestaurantMenu() {
        this.items = new ArrayList<>();
    }

    @Override
    public List<MenuItems> getItems() {
        return items;
    }
    @Override
    public void addItem(MenuItems item) {
        items.add(item);
    }
    @Override
    public void removeItem(MenuItems item) {
        items.remove(item);
    }

}
