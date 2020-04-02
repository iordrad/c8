package executorService;

import java.util.List;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {
    private List<Integer> list;
    public SumCallable(List<Integer> list){
        this.list = list;
    }
    @Override
    public Integer call(){
        return list.stream()
                   .mapToInt(nr->nr)
                   .sum();
    }

}
