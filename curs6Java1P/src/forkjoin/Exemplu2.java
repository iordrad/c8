package forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Exemplu2 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long sum = pool.invoke(new RecursiveSum(1,5000));
        System.out.println("suma este "+sum);
    }
}
