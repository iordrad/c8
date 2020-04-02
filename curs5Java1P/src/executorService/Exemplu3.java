package executorService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,8,6,2,9);
        SumCallable callable = new SumCallable(list);
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future<Integer> result = service.submit(callable);
        try{
            Integer suma = result.get();
            System.out.println(suma);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }

    }
}
