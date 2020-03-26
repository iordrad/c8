package main;
/*
 Avem o lista de nr intregi. Cate nr distincte exista?
 */

import java.util.List;

public class Exemplu8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(15,78,45,23,59,15,89,45,59);

        long nr = list.stream()
                     .distinct()
                     .count();
        System.out.println("nr unice "+nr);
    }
}
