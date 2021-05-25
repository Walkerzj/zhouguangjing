package Homework_20210525.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manger milan = new Manger("Milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);

    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if (e instanceof Worker) {
            ((Worker) e).work();// 向下转型
        } else if (e instanceof Manger){
            ((Manger) e).manage();
        }else {
            System.out.println("不在范围内...");
        }
    }

}
