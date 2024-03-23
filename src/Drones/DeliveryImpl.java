package Drones;

import java.util.ArrayList;
import java.util.List;

public class DeliveryImpl implements Delivery{
    private String location;
    private int weight;
    private  List<Drone> drones;

    public DeliveryImpl(String location, int weight) {
        this.location = location;
        this.weight = weight;
        this.drones = new ArrayList<>();
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void addDrone(Drone  drone) {
        drones.add(drone);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "location='" + location + '\'' +
                ", weight=" + weight +
                '}';
    }


}
