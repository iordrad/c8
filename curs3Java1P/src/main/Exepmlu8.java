package main;

/*
    Avem o lista de culori. Sa se calculeze media aritmetica a lungimilor culorilor.
 */

import java.util.Arrays;
import java.util.List;

public class Exepmlu8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("verde","rosu","galben","mov","albastru","portocaliu","magenta","turcuoaz");
        int sum = list.stream() //List<String>->Stream<String>
                        .map(s->s.length()) //op intermediara ce primeste Function->Stream<Integer>
                        .reduce(0,(a,b)->a+b); //op terminala de reductie -> int
        System.out.println((double)sum/list.size());

    }
}
//verde->5, rosu->4
//Stream<Integer> ->5,4