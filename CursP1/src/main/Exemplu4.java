package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;

/*
Se citeste de la tastaura un numar intreg n si un nume de fisier in care se vor scrie n numere aleatoare
 */
public class Exemplu4 {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);)
        {
            System.out.println("Nr: ");
            int nr = Integer.parseInt(in.readLine());
            System.out.println("File: ");
            String file = in.readLine();
            Random r = new Random();
            try(PrintStream out = new PrintStream(file)){
                for(int i=0;i<nr;i++){
                    out.println(r.nextInt(1000));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
