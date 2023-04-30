package IntroToReact;

public class LamdaExample1 {
    public static void main(String[] args){
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
             System.out.println("Thread Executed");
            }
        });
        t.run();
    }
}
