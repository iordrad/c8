package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu13 {
    public static void main(String[] args) {
        Path p1 = Paths.get("./src/main/Exemplu12.java");
        try{
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(System.out::println);
            //forEach(e->System.out.println(e))
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
