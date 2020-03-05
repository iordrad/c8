package main;

import java.io.*;

//Citeste continutul fisierului Exemplu1.java si afisaza in consola.
public class Exemplu2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./src/main/Exemplu1.java");//flux low-level de citire dintr-un fisier pe care il specific
             InputStreamReader isr = new InputStreamReader(fis);//byte cu byte
             BufferedReader in = new BufferedReader(isr);//flux high-level
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);//citeste continutul fisierului linie cu linie pana cand ramane fara continut
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
