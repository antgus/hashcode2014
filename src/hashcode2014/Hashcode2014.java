package hashcode2014;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author antoniogusmao
 */
public class Hashcode2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "/Users/antoniogusmao/projects/hashcode2014/paris_54000.txt";
        Case input = readInput(filename);
    }
    
    private static Case readInput(String filename) {
        FastScanner sc;
        try {
            File file = new File(filename);
            sc = new FastScanner(new InputStreamReader(new FileInputStream(file)));
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        
        Case input = new Case();
        
        int numNodes = sc.nextInt();
        int numEdges = sc.nextInt();
        input.timeLimit = sc.nextInt(); // in seconds
        input.numVehicles = sc.nextInt();
        int depotIdx = sc.nextInt();
        
        Node[] nodes = new Node[numNodes];
        for(int i=0; i < numNodes; i++) {
            nodes[i] = new Node(sc.nextDouble(), sc.nextDouble());
        }
        input.depot = nodes[depotIdx];
        
        for(int i=0; i < numEdges; i++) {
            Node from = nodes[sc.nextInt()];
            Node to = nodes[sc.nextInt()];
            boolean isTwoWayStreet = sc.nextInt() == 2;
            int duration = sc.nextInt(); // seconds
            int length = sc.nextInt(); // meters -> score added when edge is traversed.
            Edge e1 = new Edge(from, to, duration, length);
            from.outBound.add(e1);
            to.inBound.add(e1);
            if(isTwoWayStreet) {
                // create both edges. Link them together
                Edge e2 = new Edge(to, from, duration, length);
                e2.oppositeDirection = e1;
                e1.oppositeDirection = e2;
                to.outBound.add(e2);
                from.inBound.add(e2);
            }
        }
        Graph g = new Graph();
        g.nodes = nodes;
        input.g = g;
        return input;
    }
    
    private static class Case {
        int timeLimit;
        int numVehicles;
        Node depot;
        Graph g;
    }
    
    private static class Graph {
        Node[] nodes;
    }
}
