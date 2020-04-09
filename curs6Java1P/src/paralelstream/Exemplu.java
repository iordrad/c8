package paralelstream;

import java.util.Arrays;
import java.util.List;

public class Exemplu{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 89, 41, 34, 93, 20);

        //list.parallelStream()
         //       .forEach(System.out::println);
        long startTime = System.currentTimeMillis();
        list.parallelStream()
                .filter(elem -> test(elem))
                .forEachOrdered(System.out::println);
        System.out.println("parallel stream a durat: "+(System.currentTimeMillis()-startTime)+" milisecunde");

        startTime = System.currentTimeMillis();
        list.stream()
                .filter(elem -> test(elem))
                .forEach(System.out::println);
        System.out.println("stream-ul obisnuit a durat: "+(System.currentTimeMillis()-startTime)+" milisecunde");

    }
    public static boolean test(Integer i){
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return i%2==0;
    }
}
