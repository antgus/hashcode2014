package hashcode2014;

import java.util.ArrayList;
import java.util.List;

public class VehicleRoute {
    private final int vehicleId;
    private List<Edge> path;
    
    public VehicleRoute(int vehicleId) {
        this.vehicleId = vehicleId;
        this.path = new ArrayList<>();
    }
    
    public int getVehicleId() {
        return this.vehicleId;
    }

    int getTotalDuration() {
        int total = 0;
        for(Edge e: path) {
            total += e.duration;
        }
        return total;
    }
}
