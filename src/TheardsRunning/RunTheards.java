package TheardsRunning;

public class RunTheards implements Runnable{
    public static void main(String[] args) {
        RunTheards runner = new RunTheards();
        Thread alpha = new Thread(runner);
        Thread bravo = new Thread(runner);
        alpha.setName("Thread alpha");
        bravo.setName("Thread bravo");
        alpha.start();
        bravo.start();
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            String theardName = Thread.currentThread().getName();
            System.out.println(theardName + " is running");

        }

    }
}
