package Demo01.Lambda_;

public class Demo_Calculator {
    public static void main(String[] args) {

        /*invCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });*/
        //使用Lambda表达式，简化匿名内部类有参数有返回值（自定义接口）
        //括号中的数据类型可以省略不写
        //如果{}中的代码只有一行，无论是否有返回值都可以省略（{}，retrun,分号）
        //      注意：要省略{}，return，分号必须一起省略。
        invCalc(10,20,(a,b)-> a+b);
    }
    public static void invCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
