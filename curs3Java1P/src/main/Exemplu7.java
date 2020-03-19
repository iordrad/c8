package main;

import java.util.stream.Stream;

public class Exemplu7 {
    public static void main(String[] args) {
        //surse finite
        Stream<Integer> s1 = Stream.empty();//stream gol->pt return-uri, ca sa scap de null
        Stream<Integer> s2 = Stream.of(45,778,986,34,12,34);//varargs

        //surse infinite
        Stream<Integer> s3 = Stream.iterate(1,i->i+2);//elem create pe baza anteriorului
        Stream<Integer> s4 = Stream.generate(()->1);//ii dau un Supplier

        s3.limit(10).forEach(System.out::println);
        System.out.println("====================");
        s4.limit(10).forEach(System.out::println);
    }
}
/*
 creati un stream ce are o sursa infinita de numere generate aleator cu val maxima de 1000, sa limitati la 20 si sa le afisati pe ecran
 */
