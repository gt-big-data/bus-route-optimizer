package graph;

import static java.util.Collections.unmodifiableSet;

import java.util.Set;

public class Node<C, M> {

    String name;
    private Set<C> colors;
    private M metaData;
    private boolean isStop;

    public Node(String name, Set<C> colors, M metaData) {
        if (colors == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        if (metaData == null) {
            throw new IllegalArgumentException("MetaData cannot be null");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
        this.colors = Set.copyOf(colors);
        this.metaData = metaData;
    }

    public String getName() {return name;}
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

    public M getMetaData() {
        return metaData;
    }

    @Override
    public String toString() {
        return String.valueOf(name) + ": " + String.valueOf(colors);
//        return String.valueOf(metaData) + ": " + String.valueOf(colors);
    }

    public boolean isStop() {
        return isStop;
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }
}
