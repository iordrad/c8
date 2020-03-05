package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplu6 {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("produs.dat");
            ObjectInputStream in = new ObjectInputStream(file);
        ){
            Produs p = (Produs)in.readObject();
            System.out.println(p);
        }catch(IOException |ClassNotFoundException e){

            e.printStackTrace();
        }
    }
}
