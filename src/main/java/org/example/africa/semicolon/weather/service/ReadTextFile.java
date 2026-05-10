package org.example.africa.semicolon.weather.service;

import java.io.IOException;
import java.util.NoSuchFileElementException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args){
        try(Scanner input = new Scanner(Paths.get("/home/semicolon/Documents/javaProjects/weatherApp/src/main/java/org/example/africa/semicolon/weather/service/ReadTextFile.java"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
            while (input.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
        }
        catch (IOException | NoSuchFileElementException | IllegalStateException e){
            e.printStackTrace();
        }
    }
}
