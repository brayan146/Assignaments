package Drones;

import java.util.List;

public interface Drone {
    String getName();
    int getMaxWeight();
    void addDelivery(Delivery delivery);
    int getTotalWeight();

    List<Delivery> getDeliveries();
    void deliver(Delivery delivery);
}
