package Demo01.Lambda_;

public class DemoCook {
    public static void main(String[] args) {
        //匿名表达式
        invkeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //Lambda表达式
        invkeCook(()->{
            System.out.println("吃饭了");
        });
    }

    public static void invkeCook(Cook cook){
        cook.makeFood();
    }
}
