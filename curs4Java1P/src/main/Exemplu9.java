package main;

import java.util.List;

/*
Avem o lista de cuvinte. Cate vocale exista in lista.
 */
public class Exemplu9 {
    public static void main(String[] args) {
        List<String> list = List.of("java","telacad","culori","muzica");
        long nr = list.stream() //Stream<String>
                        .map(s->s.split("\\s*")) //Stream<String[]>
                        .map(sa->List.of(sa)) //Stream<List<String>>
                        .flatMap(l->l.stream()) //Stream<String>
                        .filter(c->"aeiou".contains(c.toLowerCase()))
                        .count();
        System.out.println("nr vocale "+nr);


    }
}
