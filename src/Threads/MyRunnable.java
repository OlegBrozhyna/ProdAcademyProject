package Threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("tap the run ");
        go();


    }
    public void go(){
        System.out.println("go the next part to go");

        doMore();
    }
    public void doMore(){
        System.out.println("top the stack doMore");
    }
}