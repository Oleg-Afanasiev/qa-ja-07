package com.academy.lesson10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        try(Scanner scanner = new Scanner(new FileReader("track.txt"))) {
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("***2***");
        try {
            Files.lines(Paths.get("track.txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
