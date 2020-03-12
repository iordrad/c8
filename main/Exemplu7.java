package main;

import java.nio.file.Path;
import java.nio.file.Paths;

//rezolvarea cailor = concatenarea mai multor cai
public class Exemplu7 {
    public static void main(String[] args) {
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("C/D");
        Path p3 = Paths.get("C:/A/B");

        Path rez = p1.resolve(p2);
        //cale relativa + cale relativa
        System.out.println(rez);
        Path rez2 = p3.resolve(p2);
        //cale absoluta + cale relativa
        System.out.println(rez2);
        Path rez3 = p2.resolve(p3);
        //cale relativa + cale absoluta
        System.out.println(rez3);
        Path rez4 = p1.resolve(p1);
        System.out.println(rez4);
       //pe a doua pozitie am relativa ->concatenare
        // pe a doua pozitie am relativa absoluta -> se intoarce absoluta, indiferent ce se afla pe prima pozitie
    }
    }


