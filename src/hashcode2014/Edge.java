package hashcode2014;

public class Edge {

    Node from;
    Node to;
    int duration;
    int length;
    Edge oppositeDirection = null; //if this street is bidirectional, this is a direct link to the opposite direction

    Edge(Node from, Node to, int duration, int length) {
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.length = length;
    }
}
