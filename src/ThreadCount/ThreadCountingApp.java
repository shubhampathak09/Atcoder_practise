package ThreadCount;

import scala.Int;

import java.util.List;

public class ThreadCountingApp {
    public static void main(String[] args) {
        Counter counter = new Counter();
        List<Integer> counterList;
        long startTime = System.nanoTime();
        ThreadedCounting.countInThreads(counter);
        long endTime=System.nanoTime();
        long totalTime=(endTime=startTime)/1000000;
        System.out.println("Time elapsed: "+totalTime +"ms.");
        counterList=counter.getList();
        for(Integer counternum:counterList){
            System.out.println(counternum);
        }
    }


}
