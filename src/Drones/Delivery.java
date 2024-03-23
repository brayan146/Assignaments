package Drones;

public interface Delivery {
    String getLocation();
    int getWeight();
    void addDrone(Drone drone);
}
