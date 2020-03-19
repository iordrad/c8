package main;

import java.util.function.*;
public class Exemplu6 {
    public static void main(String[] args) {
        Consumer<String> c = x->System.out.println(x);
        BiConsumer<String,Integer> c2 = (a,b)->System.out.println(a+" "+b);
        Predicate<String> p = s->s.length()%2==0;
        Function<String,Integer> f = s->s.length();
    }
}
