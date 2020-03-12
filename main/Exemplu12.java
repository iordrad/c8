package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Copiere continut
public class Exemplu12 {
    public static void main(String[] args) {
        Path p1 = Paths.get("./src/main/Exemplu10.java");
        Path p2 = Paths.get("alt_path.txt");
        try{
            Files.copy(p1,p2);
        }catch(IOException e){

            e.printStackTrace();
        }
    }
}
