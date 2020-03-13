package Demo01;

public class DemoRunnable {
    public static void main(String[] args) {
        DemoRunnableImpl run = new DemoRunnableImpl();
        Thread t = new Thread(run);
        t.start();
        new Thread(run).start();
    }
}
