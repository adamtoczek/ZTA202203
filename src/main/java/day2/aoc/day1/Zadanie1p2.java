package day2.aoc.day1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie1p2 {
    public static void main(String[] args) {
        int counter = 0;
        List<String> input = Utils.readFile("zadanie1.txt");
        for (int i = 3; i < input.size(); i++) {
            int a = Integer.parseInt(input.get(i));
            int b = Integer.parseInt(input.get(i-1));
            int c = Integer.parseInt(input.get(i-2));
            int d = Integer.parseInt(input.get(i-3));

            if (a+b+c > b+c+d)
                counter++;
        }
        System.out.println(counter);
    }
}

class Utils {
    static List<String> readFile(String filename) {
        List<String> out = new ArrayList<>();
        InputStream is = getFileFromResourceAsStream(filename);
        InputStreamReader streamReader =
                new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        out = reader.lines().collect(Collectors.toList());
        return out;
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
