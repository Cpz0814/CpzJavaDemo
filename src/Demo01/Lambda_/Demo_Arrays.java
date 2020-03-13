package Demo01.Lambda_;

import java.util.Arrays;
import java.util.Comparator;

public class Demo_Arrays {
    public static void main(String[] args) {
        Person[] arr={
                new Person("李白",20),
                new Person("杜甫",25),
                new Person("苏轼",28)
        };

        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge()-o1.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
