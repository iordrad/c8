package main;

import java.nio.file.Path;
import java.nio.file.Paths;
//Relativizarea cailor = calea pe care trebuie sa o parcurg ca sa ajung dintr-un pct in altul in sistemul de fisiere

public class Exemplu8 {
    public static void main(String[] args) {
            Path p1 = Paths.get("A/B/C/D");
            Path p2 = Paths.get("A/B/X/Y");
            Path p3 = p1.relativize(p2);
            System.out.println(p3);
            //../../X/Y = drumul de la D la Y in sistemul de fisiere
            //IllegalArgumentException -> daca am doua cai de tip diferit(relativa cu absoluta)
            //nu ma lasa nici cu 2 cai absolute de root diferit
           //A/B/C/D
           //E/F/G -
        // RELATIVELE AU COMUNUN FOLDERUL CURENT
    }
}
