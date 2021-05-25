package GJZhou.homework0525.polyarr_;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + this.salary;
    }

    public void teach(){
        System.out.println("老师" + getName() + "\t正在授课...");
    }
}
