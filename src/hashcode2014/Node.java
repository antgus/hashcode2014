package hashcode2014;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int idx;
    double lat;
    double lng;
    List<Edge> outBound = new ArrayList<>();
    List<Edge> inBound = new ArrayList<>();
    Node(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
    
    @Override
    public String toString() {
        return "("+lat+","+lng+")";
    }
}
