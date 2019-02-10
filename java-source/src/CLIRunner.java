import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

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
