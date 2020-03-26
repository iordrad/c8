package main;
/*
Se da o lista de numere intregi. Se solicita afisarea unei liste formate din patratele numerelor din lista initiala
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu12 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,8,3,6,10);
        List<Integer> listRez = list.stream()
                                    .map(v->v*v)
                                    .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(listRez);

        ArrayList<Integer> rez2 = list.stream()
                                      .map(el->el*30)
                                      .collect(Collectors.toCollection(ArrayList::new));
        //()->new ArrayList<>()
        System.out.println(rez2);
    }
}
