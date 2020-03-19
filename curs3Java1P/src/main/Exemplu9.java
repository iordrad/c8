package main;

import java.util.Arrays;
import java.util.List;

/**
 * Stream-> object stream
 * IntStream, DoubleStream, LongStream -stream-uri primitive
 * Stream->map(Function)->Stream  //am nevoie de tipurile generice, nu stiu ce am
 * Stream->mapToInt(ToIntFunction)->IntStream
 * Stream->mapToLong(ToLongFunction)->LongStream
 * Stream->mapToDouble(ToDoubleFunction)->DoubleStream
 *
 * IntStream->mapToObj(IntFunction)->Stream
 * IntStream->map(IntUnaryOperator)->IntStream
 * IntStream->mapTolong(IntToLongFunction)->LongStream
 * IntStream->mapToDouble(IntToDoubleFunction)->DoubleStream
 *
 *Tema: conversiile din DoubleStream si LongStream
 *
 */
public class Exemplu9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("verde","rosu","galben","mov","albastru","portocaliu","magenta","turcuoaz");
        double av = list.stream()//->Stream<String> //iau sursa
                         .mapToInt(s->s.length())//->IntStream ->intermediara
                         .average().getAsDouble();
        //average()->metoda terminala
        //getAsDouble()->metoda apelata pe un OptionalDouble, nu mai are treaba cu Stream-ul
        System.out.println(av);
    }
}
