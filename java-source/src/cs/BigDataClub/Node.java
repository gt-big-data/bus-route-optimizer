package cs.BigDataClub;

import static java.util.Collections.unmodifiableSet;

import java.util.Set;

public class Node<C, M> {

    private Set<C> colors;
    private M metaData;

    public Node(Set<C> colors, M metaData) {
        if (colors == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        if (metaData == null) {
            throw new IllegalArgumentException("MetaData cannot be null");
        }
        this.colors = Set.copyOf(colors);
        this.metaData = metaData;
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

    public M getMetaData() {
        return metaData;
    }

    @Override
    public String toString() {
        return String.valueOf(metaData) + ": " + String.valueOf(colors);
    }
}
