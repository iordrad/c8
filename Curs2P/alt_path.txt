package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu10 {
    public static void main(String[] args) {
        Path p1 = Paths.get("exempluFile");
        Path p2 = Paths.get("MyFolder");
        try{
            Files.createFile(p1);
            Files.createDirectory(p2);

        }catch(IOException e){

            System.out.println(e.getMessage());
        }

    }
}
