package GJZhou.homework0516;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 240, 5000);
//        person.setName("jack");
//        person.setAge(300);
//        person.setSalary(3000);
        System.out.println(person.info());
    }
}

class Person{
    public String name;
    private int age;
    private double salary;


    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 60){
            this.name = name;
        }else {
            System.out.println("名字长度不对，需要输入长度2-6的字符串，提供默认名字！");
            this.name = "佚名";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            System.out.println("年龄需要在1-120岁之间！设置的年龄不正确，提供默认年龄为18岁!");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为 name=" + this.name + "\tage=" + this.age + "\tsalary=" + this.salary;
    }
}
