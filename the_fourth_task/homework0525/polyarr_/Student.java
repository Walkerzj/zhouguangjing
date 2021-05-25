package GJZhou.homework0525.polyarr_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + this.score;
    }

    public void study(){
        System.out.println("学生"+ getName()+"\t正在上课...");
    }
}
