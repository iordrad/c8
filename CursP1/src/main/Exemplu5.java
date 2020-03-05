package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplu5 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("produs.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            Produs p = new Produs("pix",1.5,"birotica");
            out.writeObject(p);
            /*
            out-> instanta de flux high level de scriere de obiecte in flux
            writeObject()->comportamentul ce va scrie in fisierul pointat de catre out obicetul pe care il primeste ca parametru(p)
             */

        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
