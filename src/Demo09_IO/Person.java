package Demo09_IO;

import java.io.Serializable;
/*
    序列化和反序列化必须实现Serializable接口，
    当我们进行序列化或者反序列化就会检测是否有这个标记
    有就可以序列化，没有就会抛出异常。

    transient关键字：瞬态关键字
        被transient修饰成员变量不能被序列化
 */

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
