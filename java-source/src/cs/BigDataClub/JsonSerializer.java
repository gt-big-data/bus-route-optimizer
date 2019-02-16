package cs.BigDataClub;

import com.google.gson.Gson;

import java.io.*;

public class JsonSerializer {
    public static void main(String[] args) {
        String fileName = "C:\\Georgia Tech\\bigDataClub\\Bus Route Optimization\\bus-route-optimizer\\fakeStuff\\fakeGraphAdjacencyList.json";
        BufferedReader br = null;
        String line = "";
        String jsonString = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                jsonString += line;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
        Gson gson = new Gson();
        Response response = gson.fromJson(jsonString, Response.class);
        String name = response.getDescriptor().toString();
    }
}

