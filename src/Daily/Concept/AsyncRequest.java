package Daily.Concept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncRequest {

    public static void main(String[] args){
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);

        CompletableFuture<Void> allTasks = new CompletableFuture<>();


        for(int i=0;i<10;i++){
            CompletableFuture<Void> task = CompletableFuture.runAsync(
                    () -> {

                        System.out.println("log...."+Math.random() % 100);
                    }

            ,executorService);
        }
        allTasks.join();
        executorService.shutdown();


    }



}
