public class Main {
    public static void main(String[] args) {
        ThreadGroup myThreadGroup = new ThreadGroup("Main Group");
        int threadsCount = 4;

        for (int i = 0; i < threadsCount; i++) {
            new MyThread(myThreadGroup, "My Thread " + i).start();
        }

        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            System.out.println("Something went wrong!");
        }

        System.out.println("Interrupting threads...");
        myThreadGroup.interrupt();
        System.out.println("All threads have been interrupted");
    }
}
