package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Parcurg structura de arbore a sistemului de fisiere
//list(path) <-> walk(path,1)
public class Exemplu3 {
    public static void main(String[] args) {
        Path p = Paths.get("./");
       /* try{
            Files.walk(p,2) //Stream<Path>
                 .filter(line->line.toString().endsWith(".java")) //Path->String(toString())
                 .forEach(System.out::println);

        }catch(IOException e){
            System.out.println(e.getMessage());

        }*/

        //find() = walk()+filter
        try{
            Files.find(p,10,(x,b)->b.size()>1000)
                 .forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
