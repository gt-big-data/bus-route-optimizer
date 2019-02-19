package cli;

import picocli.CommandLine;

import java.util.concurrent.Callable;

public class CLIRunner implements Callable<Void> {

    public static void main(String[] args) throws Exception {
        CommandLine.call(new CLIRunner(), args);
    }

    @Override
    public Void call() throws Exception {
        System.out.println("TEST");
        return null;
    }
}
