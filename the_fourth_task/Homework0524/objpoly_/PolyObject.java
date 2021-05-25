package Homework_20210524.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //编译类型是animal，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();//因为运行时，animal的运行类型是Dog。所以cry是Dog的cry

        animal = new Cat();
        animal.cry();

    }
}
