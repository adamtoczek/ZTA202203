package day2.readJson;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class CzytanieJsona {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Osoba o1 = gson.fromJson(Utils.readFile("json.json"), Osoba.class);

        System.out.println(o1);


    }
}

class Utils {
    static String readFile(String filename) throws IOException {
        InputStream is = getFileFromResourceAsStream(filename);
        InputStreamReader streamReader =
                new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        StringBuilder contentBuilder = new StringBuilder();
        String sCurrentLine;
        while ((sCurrentLine = reader.readLine()) != null)
        {
            contentBuilder.append(sCurrentLine);
        }
        return contentBuilder.toString();
    }

    private static InputStream getFileFromResourceAsStream(String fileName) {

        InputStream inputStream = Utils.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }
}