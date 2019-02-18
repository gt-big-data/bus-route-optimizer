package cli;

//import com.fasterxml.jackson.databind.ObjectMapper;
import graph.DirectedEdge;
import graph.DirectedGraph;
import graph.Node;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JsonParsingGraphColoring {
    public static void main(String[] args) throws IOException {
//        String fileName = "../fakeStuff/fakeGraphColoring.json";
//        ObjectMapper objectMapper = new ObjectMapper();
//        HashMap<String, Node<String, String>> allNodes = new HashMap<>();
//        ArrayList<DirectedEdge<String, String>> allDirectedEdges = new ArrayList<>();
//        Map<Node<String, String>, List<Node<String, String>>> adjacencyList = new HashMap<>();
//
//        byte[] mapDataColoring = Files.readAllBytes(Paths.get(fileName));
//        HashMap<String,String> myMapColoring = objectMapper.readValue(mapDataColoring, HashMap.class);
//        Iterator itcoloring = myMapColoring.entrySet().iterator();
//        while (itcoloring.hasNext()) {
//            Map.Entry pair = (Map.Entry)itcoloring.next();
////            System.out.println(pair.getKey() + " = " + pair.getValue());
//            Iterator itSetColors = ((LinkedHashMap)pair.getValue()).entrySet().iterator();
//            Set<String> setColors = new HashSet<>((ArrayList<String>) ((Map.Entry) itSetColors.next()).getValue());
//            Node<String, String> node = new Node<>(pair.getKey().toString(), setColors, "hi");
//            allNodes.put(pair.getKey().toString(), node);
//        }
////        System.out.println(allNodes);
//        Iterator newItcoloring = myMapColoring.entrySet().iterator();
////        System.out.println("mymapcoloring: "+myMapColoring);
//        while (newItcoloring.hasNext()) {
//            Map.Entry pair1 = (Map.Entry) newItcoloring.next();
//            Iterator connectedEdges = ((LinkedHashMap)(pair1).getValue()).entrySet().iterator();
//            while (connectedEdges.hasNext()) {
//                connectedEdges.next();
//                connectedEdges.next();
//                Map.Entry pair2 = (Map.Entry)connectedEdges.next();
////                System.out.println(pair2.getKey() + " = " + pair2.getValue());
//                DirectedEdge<String, String> directedEdge;
//                Iterator itEdgesNodes = ((LinkedHashMap)pair2.getValue()).entrySet().iterator();
//                Node<String, String> nodeKey1= allNodes.get(pair1.getKey().toString());
////                System.out.println("key 1: "+ nodeKey1);
//                while (itEdgesNodes.hasNext()) {
//                    Map.Entry pair3 = (Map.Entry)itEdgesNodes.next();
//                    Node<String, String> nodeKey2= allNodes.get(pair3.getKey().toString());
//                    directedEdge = new DirectedEdge<>(nodeKey1, nodeKey2);
////                    System.out.println("Entry eet: "+(pair3.getValue().getClass()));
//                    ArrayList colorList = (ArrayList) pair3.getValue();
////                    System.out.println("Color ls: " + colorList);
//                    directedEdge.addAllColor(colorList);
//                    allDirectedEdges.add(directedEdge);
//                }
//            }
//        }
//        System.out.println(allDirectedEdges);
//        String fileAdjacencyList = "../fakeStuff/fakeGraphAdjacencyList.json";
//        byte[] mapDataAdjacencyList = Files.readAllBytes(Paths.get(fileAdjacencyList));
//        HashMap<String,String> myMapAdjacencyList = new HashMap<String, String>();
//        myMapAdjacencyList = objectMapper.readValue(mapDataAdjacencyList, HashMap.class);
//        Iterator itAdjacencyList = myMapAdjacencyList.entrySet().iterator();
//
//        while (itAdjacencyList.hasNext()) {
//            Map.Entry pair = (Map.Entry)itAdjacencyList.next();
////            System.out.println(pair.getValue());
//            Iterator itEdgesNodes = ((LinkedHashMap)pair.getValue()).entrySet().iterator();
//            List<Node<String, String>> listOfAdjacencies = new ArrayList<>();
//            while(itEdgesNodes.hasNext()) {
//                Map.Entry pair2 = (Map.Entry)itEdgesNodes.next();
//                listOfAdjacencies.add(allNodes.get(pair2.getKey().toString()));
//                for (int i = 0; i < allDirectedEdges.size(); i++) {
//                    if (allDirectedEdges.get(i).equals(new DirectedEdge<>(allNodes.get(pair.getKey().toString()),allNodes.get(pair2.getKey().toString())))) {
//                        System.out.println(Double.parseDouble(pair2.getValue().toString()));
//                        allDirectedEdges.get(i).setWeight(Double.parseDouble(pair2.getValue().toString()));
//                        System.out.println(allDirectedEdges.get(i).getWeight());
//                        System.out.println("ADDED WEIGHT");
//                    }
//                }
//                //allDirectedEdges.get()
//            }
//            adjacencyList.put(allNodes.get(pair.getKey().toString()),listOfAdjacencies);
//        }
//
//        System.out.println(adjacencyList);
//
//        DirectedGraph<String, String> directedGraph = new DirectedGraph<String, String>(adjacencyList);
//
//
//        System.out.println(directedGraph);

    }
}

