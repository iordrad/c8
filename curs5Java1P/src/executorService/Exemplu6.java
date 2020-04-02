package executorService;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu6 {
    public static void main(String[] args) throws Exception{
        //ScheduledExecutorService -> folosit pt a executa task-uri cu un anumit delay sau pt a executa automat task-urile respective
        ScheduledExecutorService service  = Executors.newSingleThreadScheduledExecutor();
        Runnable r = ()->System.out.println("Este data si ora: "+ LocalDateTime.now());
        service.schedule(r,5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        service.shutdown();
        service.scheduleAtFixedRate(r,1,3,TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(r,1,3,TimeUnit.SECONDS);
        //ctrl -> pozitionati mouse-ul pe numele metodei -> o sa se precizeze documentatia
    }
}
