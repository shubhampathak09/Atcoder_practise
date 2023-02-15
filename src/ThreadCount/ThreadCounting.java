package ThreadCount;

public class ThreadCounting {
    private static final int constantDiff = 3;


}
    class CounterThread extends Thread {
        private Counter counter;
        private Integer constantDifference;
        private Integer initialValue;
        private boolean done;
        private boolean canCallCount;

        CounterThread(Counter counter, Integer constantDifference, Integer initialValue) {
            this.counter = counter;
            this.constantDifference = constantDifference;
            this.initialValue = initialValue;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public boolean isDone() {
            return done;
        }

        /*
         * This flag is used to control which Thread is able to take control of the lock
         * when it becomes available.
         * e.g. if the main loop relinquishes the lock on counter, in order for thread1
         * to call counter.count(i), where i is one of the numbers of form 3n+1, it may
         * be possible that thread2 acquires control of the lock, resulting in the wrong
         * thread calling counter.count(i). -ok
         */
        public void setCanCallCount(boolean canCallCount) {
            this.canCallCount = canCallCount;
        }

        public boolean canCallCount() {
            return canCallCount;
        }

        @Override
        public void run() {
            int i = initialValue;
            while (isDone()) {
                if (canCallCount()) {
                    synchronized (counter) {
                        counter.count(i);
                        counter.notify();
                    }
                    i += constantDifference;
                    setCanCallCount(false);
                    if (i > 100) {
                        setDone(true);
                    }
                }
            }
        }
    }

