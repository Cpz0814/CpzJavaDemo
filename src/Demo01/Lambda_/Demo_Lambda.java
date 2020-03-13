package Demo01.Lambda_;

public class Demo_Lambda {
    public static void main(String[] args) {
        //Lambda表达式  （参数列表）->{一些重写方法的代码};
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
