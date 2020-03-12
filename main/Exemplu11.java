package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu11 {
    public static void main(String[] args) {
        Path p1 = Paths.get("MyFolder");
        try{
            if(Files.exists(p1)){
                Files.delete(p1);
            }
            //Files.deleteIfExists(p1)
            //NoSuchFileException
        }catch(IOException e){
            e.printStackTrace();

        }

    }
}
