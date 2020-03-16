package Demo03;

public class DemoRecurison {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
        int jc = jc(5);
        System.out.println(jc);
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static int jc(int n){
        if (n==1){
            return 1;
        }
        return n * jc(n-1);
    }
}
