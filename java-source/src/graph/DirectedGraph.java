package graph;

import java.util.*;

import static java.util.Collections.unmodifiableList;

public class DirectedGraph<C, M> {

    private Map<Node<C, M>, List<Node<C, M>>> adjacencyList;
    private Set<DirectedEdge<C, M>> edgeSet;

    public DirectedGraph(Map<Node<C, M>, List<Node<C, M>>> adjacencyList) {
        Map<Node<C, M>, List<Node<C, M>>> unmodifiableAdjacencyList = new HashMap<>();
        adjacencyList.forEach((key, value) -> unmodifiableAdjacencyList.put(key, unmodifiableList(value)));
        this.adjacencyList = Collections.unmodifiableMap(unmodifiableAdjacencyList);
        this.edgeSet = new HashSet<>();
        for (Map.Entry<Node<C, M>, List<Node<C, M>>> entry : this.adjacencyList.entrySet()) {
            for (Node<C, M> adjacentNode : entry.getValue()) {
                this.edgeSet.add(new DirectedEdge<>(entry.getKey(), adjacentNode));
            }
        }
    }

    public Set<DirectedEdge<C, M>> getEdgeSet() {
        return edgeSet;
    }

    public Map<Node<C, M>, List<Node<C, M>>> getAdjacencyList() {
        return adjacencyList;
    }
}
