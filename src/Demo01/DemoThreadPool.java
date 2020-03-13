package Demo01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();//销毁线程池（不建议执行）
        es.submit(new RunnableImpl());//销毁线程池后该线程无法执行
    }
}
