package main;

import java.io.File;
import java.io.IOException;

public class Exemplu2 {
    public static void main(String[] args) {
        File file = new File("A/x.txt");
        //cale catre fisier ce va fi pus in folderul A pe care l-am creat in Ex 1
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();

        }

    }
}
