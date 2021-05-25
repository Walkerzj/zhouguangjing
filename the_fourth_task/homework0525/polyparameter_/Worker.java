package Homework_20210525.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() + " is working");
    }

    @Override
    public double getAnnual() { // 普通员工没有其他奖金收入
        return super.getAnnual();
    }
}
