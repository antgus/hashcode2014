package hashcode2014;

import hashcode2014.Optimizer.IState;
import java.util.ArrayList;
import java.util.List;

public class State implements IState {
    public final Graph g; // this is a link to the graph
    public final Node depot; // starting point
    List<VehicleRoute> routes = new ArrayList<>(); // state of route of each vehicle
    
    public State(Graph g, Node depot, int numVehicles) {
        this.g = g;
        this.depot = depot;
        for(int i=0; i < numVehicles; i++) {
            routes.add(new VehicleRoute(i));
        }
    }
}
