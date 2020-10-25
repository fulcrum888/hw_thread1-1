import java.util.Random;

public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (!isInterrupted()) {
                System.out.printf("The thread %s is now working\n", getName());
                Thread.sleep(random.nextInt(1000)+2000);
            }
        } catch (InterruptedException err) {}
    }
}
