package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> result = service.submit(()->{return "callable";});
        //procesari
        try{
            String message = result.get();
            System.out.println("mesaj "+message);
        }catch(Exception e){ //InterruptedException, ExecutionException->java.util.concurrent
            e.printStackTrace();
        }finally {
            service.shutdown();
        }
    }
}
