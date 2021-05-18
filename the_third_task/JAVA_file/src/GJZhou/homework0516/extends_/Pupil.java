package GJZhou.homework0516.extends_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println(this.name + "正在考小学数学......");
        }

    public void showInfo(){
        System.out.println("name=" + this.name + "\tage=" + this.age + "\tscore" + this.score);
        }
}
