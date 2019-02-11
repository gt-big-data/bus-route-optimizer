package graph;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

public class UndirectedEdge<C, M> {

    private Node<C, M> a;
    private Node<C, M> b;
    private Set<C> colors;


    public UndirectedEdge(Node<C, M> a, Node<C, M> b) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof UndirectedEdge)) {
            return false;
        }

        UndirectedEdge otherEdge = (UndirectedEdge) obj;
        return (a.equals(otherEdge.getA()) && b.equals(otherEdge.getB())) || (a.equals(otherEdge.getB()) && b.equals(otherEdge.getA()));
    }

    @Override
    public int hashCode() {
        return (a == null ? 0 : a.hashCode()) + (b == null ? 0 : b.hashCode());
    }
}
