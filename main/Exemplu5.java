package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {
    public static void main(String[] args) {
        Path p1 = Paths.get("A/B/C");
        Path p2 = Paths.get("A","B","C");
        //Paths imi returneaza o implentare concreta a unei clase in functie se so pe care o pune in forma de Path

        System.out.println(p1.getClass());
        Path p3 = Paths.get("C:/A/B/C");
        System.out.println(p1.getFileName());//numele fisierului
        System.out.println(p3.getFileName());
        System.out.println(p1.getParent());
        System.out.println(p1.getRoot());
        System.out.println(p3.getRoot());

    }
}
