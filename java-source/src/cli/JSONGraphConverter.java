package cli;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import graph.DirectedGraph;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSONGraphConverter {

    public static DirectedGraph generateGraphFromJSON(String inputAdjacencyListFile, String inputColoringFile) {
        try {
            Gson gson = new Gson();
            JsonReader jsonReader = new JsonReader(new FileReader(inputAdjacencyListFile));
            LinkedTreeMap data = gson.fromJson(jsonReader, LinkedTreeMap.class);
            
//            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void generateJSONsFromGraph(DirectedGraph inputGraph, String outputAdjacencyListFile, String outputColoringFile) {
    }
}
