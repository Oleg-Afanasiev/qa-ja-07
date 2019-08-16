package com.academy.lesson10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Properties;

public class FileWriterDemo {
    public static void main(String[] args) {
        String[] tracks = {"Track_01", "_", "   track_03", "trACk_21", "track_15   ", "   tRAck_12   ","track_99", "track_11", "track_10"};

        String path = getPath();
        try (PrintWriter pw = new PrintWriter(path)) {
            Arrays.stream(tracks)
                    .peek(System.out::println)
//                    .forEach(s->pw.println(s));
                    .forEach(pw::println);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static String getPath() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/demo.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("track.path");
    }
}
