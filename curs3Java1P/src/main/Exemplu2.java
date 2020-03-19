package main;
//Afisam continutul unui folder cu list()

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu2 {
    public static void main(String[] args) {
        Path p = Paths.get("./src/main");
        try{
            Files.list(p)
                    .forEach(System.out::println);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
