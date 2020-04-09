package forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * Sa se determine care este al n-lea termen din sirul Fibonnaci
 *
 * f(n) = f(n-1) + f(n-2)
 */

public class FibboTask extends RecursiveTask<Integer> {
    //RecursiveTask este o clasa abstracta
    //vom folosi tehnica de programare Divide et Impera

    private Integer n;
    public FibboTask(Integer n){
        this.n = n;//in constructor se primeste n-ul din cerinta problemei
    }
    public Integer compute(){//metoda ce defineste task-ul, cum rezolvam problema
        if(n<=1){
            return n;//conditia de oprire a recursivitatii
        }
        FibboTask f1 = new FibboTask(n-1);//calculul termenului n-1
        FibboTask f2 = new FibboTask(n-2);//calculul termenului n-2

        f1.fork();//trimit pe un fir separat de executie
        return f1.join() + f2.compute();
        //f1.join -> firul curent(f2) asteapta ca rezultatele din f1 sa fie gata
        //f2.compute -> se realizeaza autoapelul metodei compute()


    }

}
