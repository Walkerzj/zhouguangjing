package GJZhou.homework0517.Extends_;

public class PC extends Computer{
    private String brand;
    //继承设计的基本思想，父类的构造器完成父类属性初始化；
    //子类的构造器完成自乐属性的初始化；
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        //调用父类方法得到属性；
        System.out.println("PC信息如下：");
        System.out.println(getDetails() +"\tbrand="+ this.brand);
    }
}
