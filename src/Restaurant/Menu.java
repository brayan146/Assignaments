package Restaurant;

import java.util.List;

public interface Menu {
    List<MenuItems> getItems();
    void addItem(MenuItems item);
    void removeItem(MenuItems item);

}
