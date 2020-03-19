package main;

//citim continut de fisier cu ajutorul metodei lines()

import java.io.IOException;
import java.nio.file.*;

public class Exemplu1 {
    public static void main(String[] args) {
        Path p = Paths.get("./src/main/Exemplu1.java");
        try{
            Files.lines(p) //Stream<String>
                 .filter(line->line.contains("*"))   //op.intermediara pe care testez o conditie
                 .forEach(System.out::println); //metoda terminala
            //line->System.out.println(line) <->System.out::println
            //Files.lines(p).fiter(Predicat)
            //inlantuire de metode
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

//int arr[];
//for(int x:arr)