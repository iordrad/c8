package forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Exemplu1 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();//ne creem pool-ul de fire de executie <->ExecutorService service -> de oricate fire de executie suporta sistemul
        FibboTask task = new FibboTask(8);//creez task-ul si dau n-ul <-> expresia lambda ce definea taskul
        Integer rez = pool.invoke(task);//spun ca vreauu sa porneasca executia task-ul <-> service.submit(lambda)
        System.out.println(rez);//afisez rezultatul
    }
}
