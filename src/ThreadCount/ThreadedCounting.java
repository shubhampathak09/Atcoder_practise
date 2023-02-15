package ThreadCount;

public class ThreadedCounting {
    private static final int constantDiff = 3;

    public static void countInThreads(Counter counter){
        CounterThread counterThread1=new CounterThread(counter,constantDiff,1);
        CounterThread counterThread2=new CounterThread(counter,constantDiff,2);
        CounterThread counterThread3=new CounterThread(counter,constantDiff,3);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();

        /*
         * The main control loop.
         *
         * This (main) thread is responsible for
         *  - iterating through from 1 to 100
         *  - informing a given thread that it is OK to proceed (to call counter.count(i))
         *  - Synchronising the activities of each counter thread and itself.
         *
         *  For each integer between 1 and 100 inclusive.
         *      Inform the relevant counter thread, that it is OK to go.
         *      Execute a synchronised wait.
         *
         *      note: each thread is responsible for assisting in this synchronisation by
         *      1) releasing the lock on the monitor.
         *      2) resetting value so that it is not OK to go (it's work is done for the moment
         *        until the main loop determines otherwise).
         *
         */
        synchronized (counter){
            for(int i=1;i <=100; i++){
                if((i % constantDiff)==1){
                    counterThread1.setCanCallCount(true);
                    try{
                        counter.wait();
                    }catch (InterruptedException e){

                    }
                }else if((i % constantDiff)==2){
                    counterThread2.setCanCallCount(true);
                    try{
                        counter.wait();
                    }catch ( InterruptedException e){

                    }
                }else if((i % constantDiff)==3){
                    counterThread3.setCanCallCount(true);
                    try{
                        counter.wait();
                    }catch (InterruptedException e){

                    }
                }
            }
        }
    }
}

