package Drones;


public class Runner {
    public static void main(String[] args) {
        // Create drones
        Drone drone1 = new DroneImpl("Drone1", 20);
        Drone drone2 = new DroneImpl("Drone2", 30);

        // Create deliveries
        Delivery delivery1 = new DeliveryImpl("Location1", 20);
        Delivery delivery2 = new DeliveryImpl("Location2", 5);
        Delivery delivery3 = new DeliveryImpl("Location3", 20);
        Delivery delivery4 = new DeliveryImpl("Location4", 15);

        // Create drone squad and add drones
        DroneSquad droneSquad = new DroneSquad();
        droneSquad.addDrone(drone1);
        droneSquad.addDrone(drone2);

        // Assign deliveries
       //droneSquad.assignDeliveries(Arrays.asList(delivery1, delivery2, delivery3,delivery4));


    }
}
