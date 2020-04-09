package sincronizare;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
    //x++ -> x=x+1
    //int x;
    private AtomicInteger x = new AtomicInteger(0);
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(x.incrementAndGet());
        }
    }
}
//incrementAndGet() -> ++x
//getAndIncrement() -> x++

//operatie atomica = op thread-safe, realizata intr-un singur pas