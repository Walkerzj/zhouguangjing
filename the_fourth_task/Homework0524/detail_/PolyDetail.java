package Homework_20210524.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
//        Cat cat = (Cat) animal;//强转
        System.out.println(animal instanceof Animal);
    }
}
