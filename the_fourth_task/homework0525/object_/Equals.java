package Homework_20210525.object_;

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);

        B bObj = a;
        System.out.println(bObj == c);

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        "hello".equals("abc");
        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);
        System.out.println(integer1 == integer2);//开辟了两个空间
        System.out.println(integer1.equals(integer2));//开辟了两个空间
    }
}

class A extends B{}

class B{}