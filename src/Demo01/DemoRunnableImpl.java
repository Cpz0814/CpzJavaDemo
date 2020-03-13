package Demo01;

public class DemoRunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
