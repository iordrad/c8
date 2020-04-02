package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()->{for(int i=1;i<=20;i+=2) System.out.println(i);});
        service.shutdown(); //de preferat sa fie incadrat cu finally
        //shutdownnow() - omoare toate task-urile
    }
}
