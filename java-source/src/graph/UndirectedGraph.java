package graph;

import java.util.*;

import static java.util.Collections.unmodifiableList;

public class UndirectedGraph<C, M> {

    private Map<Node<C, M>, List<Node<C, M>>> adjacencyList;
    private Set<UndirectedEdge<C, M>> edgeSet;

    public UndirectedGraph(Map<Node<C, M>, List<Node<C, M>>> adjacencyList) {
        Map<Node<C, M>, List<Node<C, M>>> unmodifiableAdjacencyList = new HashMap<>();
        adjacencyList.forEach((key, value) -> unmodifiableAdjacencyList.put(key, unmodifiableList(value)));
        this.adjacencyList = Collections.unmodifiableMap(unmodifiableAdjacencyList);
        this.edgeSet = new HashSet<>();
        for (Map.Entry<Node<C, M>, List<Node<C, M>>> entry : this.adjacencyList.entrySet()) {
            for (Node<C, M> adjacentNode : entry.getValue()) {
                this.edgeSet.add(new UndirectedEdge<>(entry.getKey(), adjacentNode));
            }
        }
    }

    public Set<UndirectedEdge<C, M>> getEdgeSet() {
        return edgeSet;
    }

    public Map<Node<C, M>, List<Node<C, M>>> getAdjacencyList() {
        return adjacencyList;
    }
}
