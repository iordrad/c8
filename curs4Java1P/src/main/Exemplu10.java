package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu10 {
    public static void main(String[] args) {
        List<Angajat> list = Arrays.asList(
                new Angajat("Andrei","Slobozia",2000,27),
                new Angajat("Corina","Iasi",2300,26),
                new Angajat("Andreea","Bucuresti",2600,2009),
                new Angajat("Alexandra","Iasi",3000,24),
                new Angajat("Vasile","Buzau",-200,20)

        );

        boolean b1 = list.stream()
                        .allMatch(a->a.adresa.equals("Iasi"));
        boolean b2 = list.stream()
                         .anyMatch(a->a.salariu>2200);
        boolean b3 = list.stream()
                         .noneMatch(a->a.salariu<0);
        System.out.println("Toti ang sunt din Iasi "+b1);
        System.out.println("Cel putin un angajat are salariu de peste 2200 "+b2);
        System.out.println("Niciun angajat nu are salariu negativ "+b3);
    }
}
