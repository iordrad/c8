package sincronizare;

import java.util.concurrent.CyclicBarrier;

public class MyRunnable1 implements Runnable{
    CyclicBarrier barrier = new CyclicBarrier(4);

    @Override
    public void run(){
        System.out.println("start");
        try{
            barrier.await();
            System.out.println("end");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
