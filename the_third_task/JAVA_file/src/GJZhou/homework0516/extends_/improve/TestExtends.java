package GJZhou.homework0516.extends_.improve;

public class TestExtends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 25;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();

    }
}
