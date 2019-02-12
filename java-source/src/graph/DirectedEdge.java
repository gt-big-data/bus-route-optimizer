package graph;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

public class DirectedEdge<C, M> {

    private Node<C, M> a;
    private Node<C, M> b;
    private Set<C> colors;
    private double weight;


    public DirectedEdge(Node<C, M> a, Node<C, M> b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Nodes in edges cannot be null");
        }
        this.a = a;
        this.b = b;
    }

    public Node<C, M> getA() {
        return a;
    }

    public Node<C, M> getB() {
        return b;
    }


    public Set<C> getColors() {
        return unmodifiableSet(colors);
    }

    public void addColor(C color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        colors.add(color);
    }

    public void removeColor(C color) {
        colors.remove(color);
    }

    public boolean hasColor(C color) {
        return colors.contains(color);
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof DirectedEdge)) {
            return false;
        }

        DirectedEdge otherEdge = (DirectedEdge) obj;
        return (a.equals(otherEdge.getA()) && b.equals(otherEdge.getB()));
    }

    @Override
    public int hashCode() {
        return (a == null ? 0 : a.hashCode()) + 2 * (b == null ? 0 : b.hashCode());
    }
}
