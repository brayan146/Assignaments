package Drones;

import java.util.ArrayList;
import java.util.List;

public class DroneSquad {
    private List<Drone> drones;

    public DroneSquad() {
        this.drones = new ArrayList<>();
    }

    public void addDrone(Drone drone) {
        drones.add(drone);
    }

    public List<Drone> getDrones() {
        return drones;
    }


}
