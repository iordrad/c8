package forkjoin;

import java.util.concurrent.RecursiveTask;

public class RecursiveSum extends RecursiveTask<Long> {
    int from;
    int to;
    public RecursiveSum(int from, int to){
        this.from = from;
        this.to = to;
    }
    @Override
    public Long compute(){
        if(to-from<1000){
            //suma a 1000 de nr poate sa fie calculata pe un singur fir de executie
            long sum = 0;
            for(int i=from;i<=to;i++){
                sum+=i;
            }
            System.out.println("Suma intre "+from+" si "+to+" este "+sum);
            return sum;
        }else{
            //trb sa impartim intervalul de numere in intervale mai mici, care sa fie prelucrate
            //in paralel pe mai multe fire de executie
            int middle = (from+to)/2;
            System.out.println("Am separat in suma dintre "+from+"-"+middle+" si suma intre "+(middle+1)+"-"+to);
            RecursiveSum firstHalf = new RecursiveSum(from,middle);
            firstHalf.fork();
            RecursiveSum secondHalf = new RecursiveSum(middle+1,to);
            long partialSum = secondHalf.compute();
            return firstHalf.join() + partialSum;
        }
    }
}
