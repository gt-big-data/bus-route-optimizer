package cli;

import picocli.CommandLine;

import java.util.concurrent.Callable;

public class CLIRunner implements Callable<Void> {

    @CommandLine.Parameters(paramLabel = "input_adjacency_list_file", description = "Input adjacency list JSON file.", index = "0")
    private String inputAdjacencyListFile;

    @CommandLine.Parameters(paramLabel = "output_adjacency_list_file", description = "Output adjacency list JSON file.", index = "1")
    private String outputAdjacencyListFile;

    @CommandLine.Parameters(paramLabel = "input_coloring_file", description = "Input coloring JSON file.", index = "2")
    private String inputColoringFile;

    @CommandLine.Parameters(paramLabel = "output_coloring_file", description = "Output coloring JSON file.", index = "3")
    private String outputColoringFile;

    public static void main(String[] args) throws Exception {
        CommandLine.call(new CLIRunner(), args);
    }

    @Override
    public Void call() throws Exception {
        // Testing JSONGraphConverter
        var myGraph = JSONGraphConverter.generateGraphFromJSON(inputAdjacencyListFile, inputColoringFile);
        JSONGraphConverter.generateJSONsFromGraph(myGraph, outputAdjacencyListFile, outputColoringFile);
        return null;
    }
}
