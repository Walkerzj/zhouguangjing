package GJZhou.homework0516.extends_.improve;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("name=" + this.name + "\tage=" + this.age + "\tscore" + this.score);
    }
}
