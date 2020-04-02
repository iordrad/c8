package executorService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu4 {
    public static void main(String ... args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Integer> list1 = List.of(5,7,3,5,8,9,10);
        List<Integer> list2 = List.of(8,7,4,5,2,9,10);
        List<Integer> list3 = List.of(11,45,7,9);
        Future<Integer> result1 = service.submit(new SumCallable((list1)));
        Future<Integer> result2 = service.submit(new SumCallable((list2)));
        Future<Integer> result3 = service.submit(new SumCallable((list3)));
        try{

            System.out.println("suma1 "+result1.get());
            System.out.println("suma2 "+result2.get());
            System.out.println("suma3 "+result3.get());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
    }
}
//service.invokeAll(List<Callable>) -> intoarce o lista de Future
                                  //  ->blocheaza executia firului curent(main) pana se va termina executia tuturor task-urilor din lista
//service.invokeAny(List<Callable>) -> intoarce o lista de Future
                                  //  ->blocheaza executia firului curent(main) pana se va termina executia unuia dintre task-urile din lista