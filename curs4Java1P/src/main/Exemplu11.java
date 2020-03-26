package main;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

/*
Avem o lista de siruri de caractere si vreau sa afisez lungimile acestora separate printr-o virgula
 */
public class Exemplu11 {
    public static void main(String[] args) {
        List<String> list = List.of("rosu", "albastru", "caramiziu", "grena", "verde");
        String rez = list.stream()
                .map(s -> String.valueOf(s.length()))
                .collect(Collectors.joining(","));//concatenarea valorilor, cu delimitator
        System.out.println(rez);
    }
}
