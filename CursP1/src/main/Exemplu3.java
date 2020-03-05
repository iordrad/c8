package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//Afisez intr-un fisier salut.txt mesajul Buna seara
public class Exemplu3 {
    public static void main(String[] args) {
        try(PrintStream out = new PrintStream("salut.txt")){
            out.println("Buna seara!");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());//ia doar mesajul cu care a fost creata exceptia
        }
    }
}
