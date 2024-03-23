package Drones;

import java.util.ArrayList;
import java.util.List;

public class DroneImpl implements Drone {
    private String name;
    private int maxWeight;
    private List<Delivery> deliveries;
    private int totalWeight;

    public DroneImpl(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.deliveries = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void addDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    @Override
    public int getTotalWeight() {
        int totalWeight = 0;
        for (Delivery delivery : deliveries) {
            totalWeight += delivery.getWeight();
        }
        return totalWeight;
    }

    @Override
    public List<Delivery> getDeliveries() {
        return deliveries;
    }
    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                ", deliveries=" + deliveries +
                '}';
    }

    @Override
    public void deliver(Delivery delivery) {
        deliveries.remove(delivery);
         totalWeight -= delivery.getWeight();
        System.out.println("Drone " + name + " delivered " + "has delivered the package at " + delivery.getLocation());
    }

}
