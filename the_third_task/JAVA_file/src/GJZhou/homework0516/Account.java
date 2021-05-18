package GJZhou.homework0516;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字要求在2-4位，提供默认值:佚名");
            this.name = "佚名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("要求余额大于20，提供默认值0！");
            this.balance = 0;
        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6){
            this.pwd = pwd;
        }else {
            System.out.println("密码必须是6位，提供默认密码'000000'");
            this.pwd = "000000";
        }

    }
    public void info(){
        System.out.println("信息为：\tname=" + this.name + "\tbalance=" + this.balance + "\tpwd=" + this.pwd);
    }
}
