package sincronizare;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyRunnable implements Runnable {
    int x;
    int sum;
    Random r = new Random();
    ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();

    @Override
    public void run(){
        changeX();
        readX();
    }

    public void changeX(){
        rwlock.writeLock().lock();
        x = r.nextInt();
        rwlock.writeLock().unlock();
    }
    public void readX(){
        rwlock.readLock().lock();
        sum+=x;
        rwlock.readLock().unlock();
    }
}
//il putem folosi la metode recursive
