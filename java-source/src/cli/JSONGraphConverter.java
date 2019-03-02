package cli;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import graph.DirectedEdge;
import graph.DirectedGraph;
import graph.Node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class JSONGraphConverter {

    public static DirectedGraph generateGraphFromJSON(String inputAdjacencyListFile, String inputColoringFile) {
        Map<String,Node<String, String>> arrayListNodes = new HashMap<>();
        Map<Node<String, String>, List<Node<String, String>>> mapAdjacencyList = new HashMap<>();
        Set<DirectedEdge<String,String>> edgeSet = new HashSet<>();
        Map<String, DirectedEdge<String,String>> directedEdgeMap = new HashMap<>();
        try {
            Gson gson = new Gson();
            JsonReader jsonReader = new JsonReader(new FileReader(inputColoringFile));
            LinkedTreeMap dataColoringFile = gson.fromJson(jsonReader, LinkedTreeMap.class);
            for (Object s: dataColoringFile.keySet()) {
                Set<String> colors = new HashSet<>((ArrayList<String>)((LinkedTreeMap) dataColoringFile.get(s)).get("colors"));
                boolean isStop = (boolean)((LinkedTreeMap) dataColoringFile.get(s)).get("isStop");
                arrayListNodes.put(s.toString(),new Node<>(s.toString(),colors,"",isStop));
            }
            for (Object s: dataColoringFile.keySet()) {
                List<Node<String,String>> correspondingNodes = new ArrayList<>();
                for (Object i: ((LinkedTreeMap) ((LinkedTreeMap) dataColoringFile.get(s)).get("outgoingEdgeColors")).keySet()) {
                    correspondingNodes.add(arrayListNodes.get(i));
                    Set<String> colors = new HashSet<>((ArrayList<String>)((LinkedTreeMap)((LinkedTreeMap) dataColoringFile.get(s)).get("outgoingEdgeColors")).get(i));
                    DirectedEdge<String,String> directedEdge = new DirectedEdge<>(arrayListNodes.get(s),arrayListNodes.get(i),colors);
                    edgeSet.add(directedEdge);
                    directedEdgeMap.put(s.toString()+i.toString(),directedEdge);
                }
                mapAdjacencyList.put(arrayListNodes.get(s.toString()), correspondingNodes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Gson gson = new Gson();
            JsonReader jsonReader = new JsonReader(new FileReader(inputAdjacencyListFile));
            LinkedTreeMap data = gson.fromJson(jsonReader, LinkedTreeMap.class);
            for (Object s: data.keySet()) {
                for (Object a: ((LinkedTreeMap) data.get(s)).keySet()) {
                    directedEdgeMap.get(s.toString()+ a.toString()).setWeight((Double) ((LinkedTreeMap) data.get(s)).get(a));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        System.out.println(mapAdjacencyList);
//        System.out.println(edgeSet);
        return new DirectedGraph(mapAdjacencyList,edgeSet);
    }

    public static void generateJSONsFromGraph(DirectedGraph inputGraph, String outputAdjacencyListFile, String outputColoringFile) {
    }
}
