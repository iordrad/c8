package main;

import java.io.File;

public class Exemplu1 {
    public static void main(String[] args) {
        File file = new File("A");
        //cale relativa la locul in care se afla proiectul, pentru ca nu m-am referit la un root

        file.mkdir();
        //s-a creat un folder cu denumirea specificata in constructor


    }
}
